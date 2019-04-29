package com.huanggz.spring_boot_hello.demo.repository;

import org.springframework.data.repository.Repository;
import org.springframework.data.repository.RepositoryDefinition;

import com.huanggz.spring_boot_hello.demo.bean.Cat;

@RepositoryDefinition(domainClass = Cat.class, idClass = Integer.class)
public interface Cat2Repository {
	public Cat findByCatName(String catName) ;
}
