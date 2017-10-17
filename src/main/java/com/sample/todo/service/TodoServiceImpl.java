package com.sample.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sample.todo.mappers.TodoMapper;
import com.sample.todo.vo.Todo;

@Component
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoMapper todoMapper;
	
	public List<Todo> getAllTodo() {
		List<Todo> todo = todoMapper.getAllTodo();
		return todo;
	}
	
	public void addTodo(Todo todo) {
		todoMapper.addTodo(todo);
	}
	public void delTodo(long no) {
		todoMapper.delTodo(no);
	}
}
