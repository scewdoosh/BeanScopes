package com.cosa.requestScope;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//bean will be created when client will send the request
//this supports lazy loading/initialization 
@RestController
@Scope("request")
public class ControlRoom1 {
	
	public ControlRoom1() {
		System.out.println("constructor on request");
	}
	@GetMapping("/request")
	public void getdata() {
		System.out.println("some data");
	}
}
