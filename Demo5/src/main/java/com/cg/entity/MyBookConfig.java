package com.cg.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBookConfig {
	@Bean
	public Author author() {
		
	return  new Author("Sai", "chennai") ;
    }
	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	public Book book() {
		Book book = new Book();
		book.setIsBn("saaa");
		book.setYear("2015");
		book.setAuthor(author());
		return book;
		
	}

}
