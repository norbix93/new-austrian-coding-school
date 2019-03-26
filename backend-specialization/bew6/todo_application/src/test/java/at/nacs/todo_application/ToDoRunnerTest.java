package at.nacs.todo_application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class ToDoRunnerTest {

    @Autowired
    ToDoRunner toDoRunner;

    @SpyBean
    ToDoRunner manager;

    @Test
    void applicationRunner() {



    }
}