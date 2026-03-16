package com.cosa.Session;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//bean will be created when client will send the request and this time it'll be created only one time one session for one client
//in our case some data will get logged on the console every time you make the request
//this supports lazy loading/initialization
@RestController
@Scope("session")
public class ControlRoom2 {
	
	public ControlRoom2() {
		System.out.println("constructor on request");
	}
	@GetMapping("/session")
	public void getdata() {
		System.out.println("some data");
	}
}
