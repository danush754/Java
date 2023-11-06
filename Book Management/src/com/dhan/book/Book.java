package com.dhan.book;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private Author[] authors;
	private Publisher publisher;
	private int publishingYear;
	private int amountOfPages;
	private BigDecimal price;
	private CoverType covertype;
	
//	the below code is the constructors for above declared variables
	
	public Book() {
//		Default constructor
	}

//	parameterized constructor
	public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear, int amountOfPages,
			BigDecimal price, CoverType covertype) {
		super();
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.covertype = covertype;
	}
	
// Setters and Getters for above private variables	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author[] getAurthors() {
		return authors;
	}

	public void setAurthors(Author[] authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	public int getAmountOfPages() {
		return amountOfPages;
	}

	public void setAmountOfPages(int amountOfPages) {
		this.amountOfPages = amountOfPages;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public CoverType getCovertype() {
		return covertype;
	}

	public void setCovertype(CoverType covertype) {
		this.covertype = covertype;
	}
		
//  the below line is the hashcode, equals and tostring for above declared variables
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(amountOfPages, covertype, id, name, price,
				publisher, publishingYear);
		return result;
	}
	
// This below method is a equals method 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return amountOfPages == other.amountOfPages 
				&& Arrays.equals(authors, other.authors) && covertype == other.covertype
				&& id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) 
				&& Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book Id : " + id  + ", Name :" + name + ", Authors :" + Arrays.toString(authors)
		+ ", Publisher :" + publisher + ", Publishing Year :" + publishingYear + ", Amount Of Pages :" + amountOfPages + ", Price :"+ price 
		+ ", Cover Type :" + covertype;
	}
	
	public boolean hasAuthor(Author authorCriteria) {
		for (Author author : authors) {
			if (author.equals(authorCriteria)) {
				return true;
			}
		}
		return false;
	}


}
