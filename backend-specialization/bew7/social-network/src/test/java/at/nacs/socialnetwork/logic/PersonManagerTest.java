package at.nacs.socialnetwork.logic;

import at.nacs.socialnetwork.persistence.Person;
import at.nacs.socialnetwork.persistence.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;
import static org.springframework.test.annotation.DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD;

@SpringBootTest(webEnvironment = NONE)
@DirtiesContext(classMode = AFTER_EACH_TEST_METHOD)
class PersonManagerTest {

    @Autowired
    PersonManager personManager;

    @Autowired
    ConnectionManager connectionManager;

    @Autowired
    PersonRepository repository;

    @Autowired
    Person testPerson1;

    @Autowired
    Person testPerson2;

    @Autowired
    Person testPersonWithFriend;

    @Autowired
    Person testPersonWithTwoFriends;

    @BeforeEach
    void setUp() {
        repository.deleteAll();
        repository.save(testPerson1);
        personManager.saveAndConnectPeopleFromFriendsList(testPersonWithFriend);

        // Cleanup afterwards is done by an annotation
        // @DirtiesContext(classMode = AFTER_EACH_TEST_METHOD
    }


    @Test
    void save() {
        List<Person> actual = personManager.findAll();
        int expected = 3;

        assertThat(actual.size()).isEqualTo(expected);
    }

    @Test
    void saveWithFriends() {
        personManager.saveAndConnectPeopleFromFriendsList(testPersonWithTwoFriends);

        List<Person> actual = personManager.findAll();
        Integer expected = 6;

        assertThat(actual.size()).isEqualTo(expected);
    }

    @Test
    void findAll() {
        List<Person> actual = personManager.findAll();
        int expected = 3;

        assertThat(actual.size()).isEqualTo(expected);
    }

    @Test
    void findAllWithFriends() {
        List<Person> allWithFriends = personManager.findAllWithFriends();

        assertThat(allWithFriends.size()).isEqualTo(2);
    }

    @Test
    void findAllWithFriends_CoveringPersonHavingMoreThanOneFriend() {
//      If person has more than 1 friend he is added more than one times - counting friendships
        personManager.saveAndConnectPeopleFromFriendsList(testPersonWithTwoFriends);
        List<Person> allWithFriends = personManager.findAllWithFriends();

        assertThat(allWithFriends.size()).isEqualTo(6);
    }

    @Test
    void findAllWithoutFriends() {
        List<Person> all = personManager.findAll();

        assertThat(all.size()).isEqualTo(3);

        List<Person> allWithoutFriends = personManager.findAllWithoutFriends();

        assertThat(allWithoutFriends.size()).isEqualTo(1);
        assertThat(allWithoutFriends).isEqualTo(List.of(testPerson1));
    }

    @Test
    void connectById() {
        repository.save(testPerson2);

        Long id1 = testPerson1.getId();
        Long id2 = testPerson2.getId();
        personManager.connectById(id1, id2);

        List<Person> allWithFriends = personManager.findAllWithFriends();
        int actual = allWithFriends.size();

        assertThat(actual).isEqualTo(4);
    }

    @Test
    void disconnectById() {
        repository.save(testPerson2);

        Long id1 = testPerson1.getId();
        Long id2 = testPerson2.getId();
        personManager.connectById(id1, id2);
        List<Person> allWithFriends = personManager.findAllWithFriends();

        assertThat(allWithFriends).isNotEmpty();

        personManager.disconnectById(id1, id2);
        List<Person> allWithFriendsAfterDisconnect = personManager.findAllWithFriends();

        assertThat(testPerson1).isNotIn(allWithFriendsAfterDisconnect);
        assertThat(testPerson2).isNotIn(allWithFriendsAfterDisconnect);
    }
}