package com.company;


public class Main {

    public static void main(String[] args) {
	book book1 = new book();

	book1.setBooktitle("curious george");
	book1.setAuthor("Me");
	book1.setDescription("child story");

	String author = book1.getAuthor();
	String title = book1.getBooktitle();
	String description= book1.getDescription();

	book1.getDisplayText();


    }
}
