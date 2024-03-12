package com.wipro.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.model.ApplicationScopeDemo;
import com.wipro.model.RequestScopeDemo;

@Controller
public class ApplicationController {
	
	@Autowired
	private ApplicationScopeDemo demo;
	
	@GetMapping("/testingApplication1")
	public void display(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("Default name : "+demo.getName());
		demo.setName("CONTROLLER-NAME ");
		response.getWriter().write(" New name : "+demo.getName());
	}
	
	
	
	@GetMapping("/testingApplication2")
	public void display2(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("New name : "+demo.getName());
	}

}
