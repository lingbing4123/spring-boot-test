package com.huanggz.spring_boot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello2Controller {
	@RequestMapping("/hello4")
	public String  hello() {
		return "55555";
	}
}
