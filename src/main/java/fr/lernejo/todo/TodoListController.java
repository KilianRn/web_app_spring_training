package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TodoListController {

    ArrayList array = new ArrayList();

    @PostMapping("/api/todo")
    public void add(@RequestParam("message") String message,@RequestParam("author") String author ) {
        Todo todo = new Todo(message,author);
        array.add(todo);
    }

    @GetMapping("/api/todo")
    public Iterable get() {
        return array;
    }
}
