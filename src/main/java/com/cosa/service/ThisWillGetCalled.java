package com.cosa.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//by default the bean will be singleton means only one bean will get created by the spring application context(eager loading)
//if you change the scope to prototype the bean will be created whenever you inject the class as a dependency (make sure the classes where you will inject the bean have any stereotype annotations on them)
@Service
//@Scope("prototype") //this and this @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) are the same :)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ThisWillGetCalled {
	public ThisWillGetCalled() {
		System.out.println("create constructor by spring boot :) for ThisWillGetCalled");
	}
}
