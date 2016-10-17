package com.robert.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController implements EnvironmentAware, ApplicationContextAware{
	
	private final Log logger = LogFactory.getLog(HelloController.class);
	
	private Environment environment;
	
	private ApplicationContext applicationContext;
	
	public void setEnvironment(Environment environment) {
		this.environment = environment;
		System.out.println("@@@"+environment.getProperty("contextConfigLocation"));
	}
	

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(applicationContext.getBeanDefinitionCount());
	}
	
	@RequestMapping(value={"hello","hi"})
	public String hello(HttpServletRequest request){
		logger.info(request.getServletContext().getRealPath("/"));
		System.out.println(request.getServletContext().getRealPath("/"));
		return "hello";
	}

}
