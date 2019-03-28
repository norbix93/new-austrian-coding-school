package at.nacs.todo_application.communication;

import at.nacs.todo_application.ToDoRepository;
import at.nacs.todo_application.controller.ToDoManager;
import at.nacs.todo_application.model.ToDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.List;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.verify;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class ToDoEndpointTest {

    @Autowired
    TestRestTemplate restTemplate;

    @Autowired
    List<ToDo> todos;

    @MockBean
    ToDoRepository repository;

    @SpyBean
    ToDoManager manager;

    @Test
    void findAll() {
        String url = "/todos";
        restTemplate.getForObject(url, ToDo[].class);
        verify(manager).findAll();
    }

    @Test
    void findByID() {
        String url = "/todos/iD/123";
        restTemplate.getForObject(url, ToDo.class);
        verify(manager).findById("123");
    }

    @Test
    void doTask() {
        ToDo example = todos.get(0);
        String url = "/todos/iD/123/done";
        restTemplate.put(url, example);
        verify(manager).doTask(anyString());
    }

    @Test
    void receiveNew() {
        String url = "/todos";
        ToDo example = ToDo.builder().build();
        restTemplate.postForObject(url, example, ToDo.class);
        verify(manager).save(example);
    }

//    @Test
//    void delete() {
//        String url = "/todos/iD/123";
//        restTemplate.delete(url,ToDo.class);
//        verify(manager).deleteItemById(anyString());
//    }
}