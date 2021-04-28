package com.te.springcoreannotation.bean;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Library {
	public Library() {

	}
	private int lid;
	private String lname;
	
	@Autowired(required = false)
	private Book book;

}
