package com.huanggz.spring_boot_hello;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String  hello() {
		return "hello2016-12-15";
	}
	@RequestMapping("/hello2")
	public String  hello2() {
		return "hello2";
	}
	@RequestMapping("/hello3")
	public String  hello3() {
		return "hello44444";
	}
	//-javaagent:.\lib\springloaded-1.2.8.RELEASE.jar -noverify

	@RequestMapping("/getPerson")
	public Person  getPerson() {
		Person psPerson = new Person();
		psPerson.setAge(28);
		psPerson.setName("张三2222");
		psPerson.setRemarks("这是备注信息");
		psPerson.setDate(new Date());
		return psPerson;
	}
	
}
