package com.wipro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.RequestScopeDemo;
import com.wipro.model.SessionScopeDemo;

@Controller
public class SessionController {
	
	@Autowired
	private SessionScopeDemo demo;
	
	@GetMapping("/testingSession1")
	public void display(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("Default name : "+demo.getName());
		demo.setName("CONTROLLER-NAME");
		response.getWriter().write("New name : "+demo.getName());
	}
	
	
	
	@GetMapping("/testingSession2")
	public void display2(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("New name : "+demo.getName());
	}

}
