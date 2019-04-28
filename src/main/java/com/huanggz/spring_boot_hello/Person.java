package com.huanggz.spring_boot_hello;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Person {
	private int age;
	private String name;
	@JSONField(serialize=false)
	private String remarks;
	
	@JSONField(format="yyyy-MM-dd hh:mm:ss")
	private Date date;


	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
