package com.example.spring_app.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.spring_app.domains.Book;

@Mapper
public interface BookMapper {
	List<Book> all();
	Book show(Integer book_id);
	void add(Book book);
}
