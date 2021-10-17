package com.in28minutes.restfulwebservice.service;


import com.in28minutes.restfulwebservice.entity.TodoEntity;
import com.in28minutes.restfulwebservice.repository.TodosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TodosService {

    @Autowired
private TodosRepository todosRepo;

    //add
    public TodoEntity addTodos(TodoEntity todos){
      return  todosRepo.save(todos);
    }

    //getList
    public List<TodoEntity> getTodosData(){
        return todosRepo.findAll();
    }

    //update
    public TodoEntity updateTodos(TodoEntity todos,int id){
        Optional<TodoEntity> todosUpdated=todosRepo.findById(id);
        todosUpdated.get().setDescription(todos.getDescription());
        todosUpdated.get().setDone(todos.isDone());
        return todosRepo.save(todosUpdated.get());
    }

    //delete
    public void deleteTodos(int id){
         todosRepo.deleteById(id);
    }
}
