package at.nacs.socialnetwork.communication;

import at.nacs.socialnetwork.logic.ConnectionManager;
import at.nacs.socialnetwork.logic.PersonManager;
import at.nacs.socialnetwork.persistence.Person;
import at.nacs.socialnetwork.persistence.PersonRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class PersonsEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    Person testPerson1;

    @SpyBean
    PersonManager personManager;

    @SpyBean
    ConnectionManager connectionManager;

    @MockBean
    PersonRepository repository;

    private String url = "/persons";

    @Test
    void findAll() {
        testRestTemplate.getForObject(url, Person[].class);
        verify(personManager).findAll();
    }

    @Test
    void save() {
        testRestTemplate.postForObject(url, testPerson1, Person.class);
        verify(personManager).saveAndConnectPeopleFromFriendsList(testPerson1);
    }

    @Test
    void findAllWithFriends() {
        String customUrl = url + "/friends/with";
        testRestTemplate.getForObject(customUrl, Person[].class);
    }

    @Test
    void findAllWithoutFriends() {
        String customUrl = url + "/friends/without";
        testRestTemplate.getForObject(customUrl, Person[].class);
    }

    @Test
    void connectTwoPeople() {
        String customUrl = url + "/" + 1 + "/friend/" + 2;
        System.out.println(customUrl);
        testRestTemplate.put(customUrl, void.class);

        verify(personManager).connectById(1L, 2L);
    }

    @Test
    void disconnectTwoPeople() {
        String customUrl = url + "/" + 1 + "/unfriend/" + 2;
        System.out.println(customUrl);
        testRestTemplate.put(customUrl, void.class);

        verify(personManager).disconnectById(1L, 2L);
    }
}