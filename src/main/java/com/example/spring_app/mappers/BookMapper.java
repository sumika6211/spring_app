package com.example.spring_app.mappers;

import java.awt.print.Book;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
	List<Book> all();
	//void add(Book book);
	void add(com.example.spring_app.domains.Book book);
}
