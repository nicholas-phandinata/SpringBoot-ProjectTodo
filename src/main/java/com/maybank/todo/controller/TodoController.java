package com.maybank.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maybank.todo.entity.Todo;
import com.maybank.todo.service.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	@GetMapping("/list-all")
	public String listAll(Model model) {
		model.addAttribute("todos", todoService.listAll());
		return "todo/listAll";
	}
	
	@RequestMapping("/add-todo")
	public String addTodo(Model model) {
		model.addAttribute("todo", new Todo());
		return "todo/addForm";
	}
	
	@RequestMapping("save")
	public String save(@ModelAttribute Todo todo) {
		System.out.println("Form Data: " + todo);
		todoService.saveTodo(todo);
		return "redirect:list-all";
	}
	
	@RequestMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
		Todo todo = todoService.getTodoById(id);
		System.out.println("Edit Data: " + todo);
		model.addAttribute("todo", todo);
		return "todo/editForm";
	}
	
	@RequestMapping("update")
	public String update(@ModelAttribute Todo todo) {
		todoService.updateTodo(todo);
		return "redirect:list-all";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		todoService.deleteTodo(id);
		return "redirect:../list-all";
	}
	
}
