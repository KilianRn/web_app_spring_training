package fr.lernejo.todo;

public class TodoListController {
    private TodoList todoList;

    public TodoListController(TodoList todoList) {
        this.todoList = todoList;
    }

    @PostMapping("/api/todo")
    public void add(@RequestBody Todo newTodo) {
        todoList.save(newTodo);
    }

    @GetMapping("/api/todo")
    public Iterable get() {
        return todoList.findAll();
    }
}
