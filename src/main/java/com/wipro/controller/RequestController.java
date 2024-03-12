package com.wipro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.wipro.model.RequestScopeDemo;

@Controller
public class RequestController {
	
	@Autowired
	private RequestScopeDemo demo;
	
	@GetMapping("/testing1")
	public void display(HttpServletResponse response) throws IOException {
		
;		response.getWriter().write("Default name : "+demo.getName());
		demo.setName("CONTROLLER-NAME ");
		response.getWriter().write(" New name : "+demo.getName());
	}
	
	
	
	@GetMapping("/testing2")
	public void display2(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("New name : "+demo.getName());
	}

}
