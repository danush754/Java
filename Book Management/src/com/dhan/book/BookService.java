package com.dhan.book;

public class BookService {
	

//	This is a special method for my book class which returns the books based on Author	
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		if(author == null || books == null) {
			return new Book[0];
		}
		
		int matchbooksAmount = 0;
		for(Book book:books) {
			if(book.hasAuthor(author)) {
				matchbooksAmount++;
			}
		}
		
		Book[] filteredBooks = new Book[matchbooksAmount];
		int index = 0;
		for (Book book : books) {
			if (book.hasAuthor(author)) {
				filteredBooks[index++] = book;
			}
		}
		
		return filteredBooks;
	}
	
//	This is a special method for my book class which returns the books based on publisher
	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		if(publisher == null || books == null) {
			return new Book[0];
		}
		
		int matchBooksAmount = 0;
		for(Book book : books ) {
			if(book.getPublisher().equals(publisher)) {
				matchBooksAmount++;
			}
		}
		
		Book[] filteredBooks = new Book[matchBooksAmount];
		int index = 0;
		for (Book book : books) {
			if(book.getPublisher().equals(publisher)) {
				filteredBooks[index++] = book;
			}
		} 
		
		return filteredBooks;
	}
	

	
//	This is a special method for my book class which returns the books based on published year
	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		if(yearFromInclusively == 0 || books == null) {
			return new Book[0];
		}
		
		int matchBookAmount = 0;
		for(Book book:books) {
			if(book.getPublishingYear() >= yearFromInclusively) {
				matchBookAmount++;
			}
		}
		
		Book[] filteredBooks = new Book[matchBookAmount];
		int index = 0;
		for(Book book:books) {
			if(book .getPublishingYear() >= yearFromInclusively) {
				filteredBooks[index++] = book;
			} 
		}
		
		return filteredBooks;
	}

}
