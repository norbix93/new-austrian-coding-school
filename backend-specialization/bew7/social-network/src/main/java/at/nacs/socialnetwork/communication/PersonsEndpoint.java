package at.nacs.socialnetwork.communication;

import at.nacs.socialnetwork.logic.PersonManager;
import at.nacs.socialnetwork.persistence.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/persons")
public class PersonsEndpoint {

    private final PersonManager manager;

    @GetMapping
    List<Person> findAll() {
        return manager.findAll();
    }

    @PostMapping
    Person save(@RequestBody Person person) {
        return manager.saveAndConnectPeopleFromFriendsList(person);
    }

    @GetMapping("/friends/with")
    List<Person> findAllWithFriends() {
        return manager.findAllWithFriends();
    }

    @GetMapping("/friends/without")
    List<Person> findAllWithoutFriends() {
        return manager.findAllWithoutFriends();
    }

    @PutMapping("/{id1}/friend/{id2}")
    void connectTwoPeople(@PathVariable Long id1, @PathVariable Long id2) {
        manager.connectById(id1, id2);
    }

    @PutMapping("/{id1}/unfriend/{id2}")
    void disconnectTwoPeople(@PathVariable Long id1, @PathVariable Long id2) {
        manager.disconnectById(id1, id2);
    }
}
