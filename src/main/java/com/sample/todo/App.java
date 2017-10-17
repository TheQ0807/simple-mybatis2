package com.sample.todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.todo.mappers.TodoMapper;
import com.sample.todo.service.TodoService;
import com.sample.todo.vo.Todo;

public class App {

	public static void main(String[] args) {
		
		String resource = "classpath:/META-INF/spring/app-mybatis-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		TodoService todoService = context.getBean(TodoService.class);
		
		List<Todo> todos = todoService.getAllTodo();
		System.out.println(todos.size());
		/*Todo todo = new Todo();
		todo.setTitle("안녕");
		todo.setDates("10.16");
		todo.setContents("공부해야된다?");
		todoService.addTodo(todo);*/
	}
}
