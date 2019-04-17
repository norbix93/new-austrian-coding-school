package at.nacs.phonebook.communication;

import at.nacs.phonebook.logic.ContactManager;
import at.nacs.phonebook.persistence.Contact;
import at.nacs.phonebook.persistence.ContactRepository;
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
class ContactsEndpointTest {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Autowired
    Contact testContact;

    @SpyBean
    ContactManager manager;

    @MockBean
    ContactRepository repository;

    String url = "/contacts";

    @AfterEach
    void after() {
        repository.deleteAll();

        testContact.getAddress().setId(null);
        testContact.setId(null);
    }


    @Test
    void findAll() {
        testRestTemplate.getForObject(url, Contact[].class);
        verify(manager).findAll();

    }

    @Test
    void save() {
        testRestTemplate.postForObject(url, testContact, Contact.class);
        verify(manager).save(testContact);
    }

    @Test
    void findContactsByAddressAddressLike() {
        testRestTemplate.getForObject(url + "/address/12", Contact[].class);
        verify(manager).findByAddressAddressLike("12");
    }
}