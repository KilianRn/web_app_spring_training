package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoListController {

    //ArrayList array = new ArrayList();
    TodoRepository todoRepository;

    public TodoListController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @PostMapping("/api/todo")
    public void add(@RequestBody TodoEntity TodoRep){
        todoRepository.save(TodoRep);
    }

    @GetMapping("/api/todo")
    public Iterable get() {
        return todoRepository.findAll();
    }
}
