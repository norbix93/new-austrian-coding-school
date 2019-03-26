package at.nacs.todo_application.communication;

import at.nacs.todo_application.ToDoRunner;
import at.nacs.todo_application.model.ToDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class ToDoEndpointTest {

    @Autowired
    ToDoEndpoint toDoEndpoint;

    @SpyBean
    ToDoRunner manager;


    @Test
    void findByID() {
        ToDo actual = toDoEndpoint.findByID("5c99fecc280d542e5e143e6a");
        String expected = "5c99fecc280d542e5e143e6a";
        assertThat(actual.getID()).isEqualTo(expected);
        assertThat(actual.getID()).isNotNull();
    }

    @Test
    void findAll() {
    }

    @Test
    void getItDone() {
    }

    @Test
    void receiveNew() {
    }

    @Test
    void delete() {
    }
}