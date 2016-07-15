package com.sijiyishi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloWorldWeb {

	@RequestMapping("{name}")
	public @ResponseBody
	String name(@PathVariable("name") String name) {
		return name;
		
	}

}
