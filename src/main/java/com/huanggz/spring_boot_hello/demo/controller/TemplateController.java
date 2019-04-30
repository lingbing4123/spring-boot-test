package com.huanggz.spring_boot_hello.demo.controller;

import java.util.Map;

import javax.activation.MailcapCommandMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
	@RequestMapping("/helloHtml")
	public String sagyHello(Map<String, Object> map) {
		map.put("hello", "from TemplateController.helloHtml");
		return "/helloHtml";
	}
}
