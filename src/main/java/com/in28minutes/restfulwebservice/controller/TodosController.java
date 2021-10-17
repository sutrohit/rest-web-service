package com.in28minutes.restfulwebservice.controller;

import com.in28minutes.restfulwebservice.entity.TodoEntity;
import com.in28minutes.restfulwebservice.service.TodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodosController {

    @Autowired
   private TodosService todosService;

    @PostMapping("todos")
    public TodoEntity addTodos(@RequestBody TodoEntity todos){
        return todosService.addTodos(todos);
    }
    @GetMapping("todos")
    public List<TodoEntity> getTodosData(){
        return todosService.getTodosData();
    }

    @PutMapping("todos/{id}")
    public TodoEntity updateTodos(@RequestBody TodoEntity todos,@PathVariable int id){
        return todosService.updateTodos(todos,id);
    }

    @DeleteMapping("todos/{id}")
    public void deleteTodos(@PathVariable int id){
         todosService.deleteTodos(id);
    }


}
