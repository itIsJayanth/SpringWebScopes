package com.wipro.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class ApplicationScopeDemo {

	private String name = "DEFAULT-NAME-ApplicationScopeName";

	public ApplicationScopeDemo() {

		System.out.println("Object Created For ApplicationScopeDemo");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
