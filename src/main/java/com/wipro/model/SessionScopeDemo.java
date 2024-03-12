package com.wipro.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
//@Scope(value = "session",proxyMode = ScopedProxyMode.TARGET_CLASS)
@SessionScope
public class SessionScopeDemo {

	private String name = "DEFAULT-NAME";
	
	public SessionScopeDemo() {
		System.out.println("Object Created For SessionScopeDemo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
