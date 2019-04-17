package at.nacs.phonebook.logic;

import at.nacs.phonebook.persistence.Contact;
import at.nacs.phonebook.persistence.ContactRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class ContactManagerTest {

    @Autowired
    ContactManager manager;

    @Autowired
    ContactRepository repository;

    @Autowired
    Contact testContact;

    @BeforeEach
    void before() {
        manager.save(testContact);
    }

    @AfterEach
    void after() {
        repository.deleteAll();

        testContact.getAddress().setId(null);
        testContact.setId(null);
    }

    @Test
    void save() {
        List<Contact> allContactsFound = manager.findAll();

        assertThat(allContactsFound).isNotEmpty();
        assertThat(allContactsFound).contains(testContact);
        assertThat(testContact.getId()).isEqualTo(allContactsFound.get(0).getId());
    }

    @Test
    void findAll() {
        List<Contact> allContactsFound = manager.findAll();
        Contact contact = allContactsFound.get(0);

        assertThat(contact.getId()).isEqualTo(testContact.getId());
        assertThat(allContactsFound.size()).isEqualTo(1);
    }

    @Test
    void findByAddress() {
        List<Contact> actual = manager.findByAddressAddressLike("12");

        assertThat(actual.size()).isEqualTo(1);
        assertThat(actual).contains(testContact);
    }

    @Test
    void failToFindByAddress() {
        List<Contact> actual = manager.findByAddressAddressLike("212");

        assertThat(actual.size()).isEqualTo(0);
    }
}