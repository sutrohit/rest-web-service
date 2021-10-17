package com.in28minutes.restfulwebservice.repository;

import com.in28minutes.restfulwebservice.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodosRepository extends JpaRepository<TodoEntity , Integer> {
}
