package at.nacs.todo_application.controller;

import static org.assertj.core.api.Assertions.assertThat;


import at.nacs.todo_application.ToDoRepository;
import at.nacs.todo_application.model.ToDo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.NONE;

@SpringBootTest(webEnvironment = NONE)
class ToDoManagerTest {

    @Autowired
    ToDoManager manager;

    @Autowired
    ToDoRepository repository;

    @Autowired
    List<ToDo> todos;

    @BeforeEach()
    void setUp() {
        repository.deleteAll();
        repository.saveAll(todos);
    }

    @Test
    void findByID() {

        ToDo example = todos.get(0);
        ToDo actual = manager.findById(example.getId());
        assertThat(actual).isEqualTo(example);
        assertThat(actual.getId()).isNotBlank();
    }

    @Test
    void findAll() {
        List<ToDo> todos = manager.findAll();
        assertThat(todos.size()).isEqualTo(4);
    }

    @Test
    void doTask() {
        ToDo example = todos.get(0);
        ToDo actual = manager.doTask(example.getId());
        assertThat(actual.getDone()).isEqualTo(true);
    }

    @Test
    void save() {
        ToDo example = ToDo.builder().id("987").title("Go to a restaurant")
                .done(false).build();
        manager.save(example);
        assertThat(repository.findById("987")).isNotEmpty();
    }

    @Test
    void deleteItemByID() {
        ToDo example = ToDo.builder().id("987").title("Go to a restaurant")
                .done(false).build();
        manager.save(example);
        manager.deleteItemById(example.getId());
        assertThat(manager.findAll()).doesNotContain(example);
        assertThat(manager.findAll().size()).isEqualTo(4);
    }
}