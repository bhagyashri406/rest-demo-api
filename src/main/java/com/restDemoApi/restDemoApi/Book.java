package com.restDemoApi.restDemoApi;

public class Book {

	long Id;
	String name ;
	String author ;
	
	public Book(long id, String name, String author) {
		super();
		Id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return Id;
	}


	public String getName() {
		return name;
	}

	

	public String getAuthor() {
		
		return author;
	}



	@Override
	public String toString() {
		return "Book [Id=" + Id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
}
