package at.nacs.socialnetwork.logic;


import at.nacs.socialnetwork.persistence.Person;
import at.nacs.socialnetwork.persistence.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConnectionManager {

    private final PersonRepository repository;

    public void connectById(Long id1, Long id2) {
        Optional<Person> first = repository.findById(id1);
        Optional<Person> second = repository.findById(id2);

        if (isBothPresent(first, second)) {
            Person person1 = first.get();
            Person person2 = second.get();
            connect(person1, person2);
        }
    }

    private boolean isBothPresent(Optional<Person> firstPerson, Optional<Person> secondPerson) {
        return firstPerson.isPresent() && secondPerson.isPresent();
    }

    private void connect(Person person1, Person person2) {
        doConnect(person1, person2);
        doConnect(person2, person1);
    }

    public void doConnect(Person person_1, Person person_2) {
        List<Person> friends = person_1.getFriends();

        if (!friends.contains(person_2)) {
            friends.add(person_2);
            person_1.setFriends(friends);
            repository.save(person_1);
        }
    }

    public void disconnectById(Long id1, Long id2) {
        Optional<Person> first = repository.findById(id1);
        Optional<Person> second = repository.findById(id2);

        if (isBothPresent(first, second)) {
            Person person1 = first.get();
            Person person2 = second.get();
            disconnect(person1, person2);
        }
    }

    private void disconnect(Person person1, Person person2) {
        doDisconnect(person1, person2);
        doDisconnect(person2, person1);
    }

    public void doDisconnect(Person person1, Person person2) {
        List<Person> friends = person1.getFriends();
        friends.remove(person2);
        person1.setFriends(friends);
        repository.save(person1);
    }
}
