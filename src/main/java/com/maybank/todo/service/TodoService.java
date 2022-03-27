package com.maybank.todo.service;

import java.util.List;

import com.maybank.todo.entity.Todo;

public interface TodoService {
	List<Todo> listAll();
	
	Todo getTodoById(int id);
	
	Todo saveTodo(Todo todo);
	
	Todo updateTodo(Todo todo);
	
	String deleteTodo(int id);
}
