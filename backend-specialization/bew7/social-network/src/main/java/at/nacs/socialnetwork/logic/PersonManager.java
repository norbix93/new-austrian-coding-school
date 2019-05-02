package at.nacs.socialnetwork.logic;

import at.nacs.socialnetwork.persistence.Person;
import at.nacs.socialnetwork.persistence.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonManager {

    private final PersonRepository repository;
    private final ConnectionManager connectionManager;

    public Person saveAndConnectPeopleFromFriendsList(Person person) {
        List<Person> friends = person.getFriends();

        person.setFriends(new ArrayList<>());
        repository.save(person);
        friends.forEach(friend ->
                connect(person, friend));
        return person;
    }

    private void connect(Person person, Person friend) {
        List<Person> all = repository.findAll();

        if (!all.contains(friend)) {
            repository.save(friend);
        }
        connectionManager.connectById(person.getId(), friend.getId());
    }

    public void connectById(Long id1, Long id2) {
        connectionManager.connectById(id1, id2);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public List<Person> findAllWithFriends() {
        return repository.findAllByFriendsIsNotNull();
    }

    public List<Person> findAllWithoutFriends() {
        return repository.findAllByFriendsIsNull();
    }

    public void disconnectById(Long id1, Long id2) {
        connectionManager.disconnectById(id1, id2);
    }

}

