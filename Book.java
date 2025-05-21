package com.costractor;

public class Book {
String title;
String author;
public Book(String tit , String au) {
	System.out.println( "....basic constractor....");
	this.title = tit;
	this.author = au;
	
	
}
public void displayData() {
	System.out.println( "title :"+ title );
	System.out.println("author :"+ author);
	
}
public static void main(String[] args) {
	Book book = new Book("Cnstractor" , "java");
	book.displayData();
}
}
