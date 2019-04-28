package com.huanggz.spring_boot_hello.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huanggz.spring_boot_hello.demo.bean.Cat;
import com.huanggz.spring_boot_hello.demo.service.CatService;

@RestController
@RequestMapping("/cat")
public class CatController {
	@Resource
	private CatService catService;

	@RequestMapping("/save")
	public String save() {
		Cat cat = new Cat();
		cat.setAge(1);
		cat.setName("Micle cat");
		catService.save(cat);
		return "save ok";
	}
	@RequestMapping("/delete")
	public String delete() {
		catService.delete(1);
		return "delete ok";
	}

	@RequestMapping("/getAll")
	public Iterable<Cat> getAll() {
		return catService.getAll();
	}
}
