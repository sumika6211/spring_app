package com.example.spring_app.domains;

public class Book {
	private int id;
	private String title;
	private String body;
	
	public Book(int id, String title, String body) {
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public Book(String title, String body) {
		this.title = title;
		this.body = body;
	}
	
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getBody() {
		return body;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
