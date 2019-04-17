package at.nacs.phonebook.communication;

import at.nacs.phonebook.logic.ContactManager;
import at.nacs.phonebook.persistence.Contact;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contacts")
public class ContactsEndpoint {

    private final ContactManager manager;

    @GetMapping
    List<Contact> findAll() {
        return manager.findAll();
    }

    @PostMapping
    Contact save(@RequestBody Contact contact) {
        return manager.save(contact);
    }

    @GetMapping("/address/{address}")
    List<Contact> findContactsByAddress(@PathVariable String address) {
        return manager.findByAddressAddressLike(address);
    }
}
