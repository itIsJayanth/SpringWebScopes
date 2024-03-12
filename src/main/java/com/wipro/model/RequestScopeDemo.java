package com.wipro.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
//@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
public class RequestScopeDemo {

	private String name = "DEFAULT-NAME";
	
	public RequestScopeDemo() {
		System.out.println("Object Created For RequestScopeDemo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
