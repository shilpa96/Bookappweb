package com.shilpa.books;

import java.time.LocalDate;

public class Books {
private int id;
private String name;
private int price;
private LocalDate publishedDate;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public LocalDate getPublishedDate() {
	return publishedDate;
}
public void setPublishedDate(LocalDate publishedDate) {
	this.publishedDate = publishedDate;
}
@Override
public String toString() {
	return "Books [id=" + id + ", name=" + name + ", price=" + price + ", publishedDate=" + publishedDate + "]";
}
}
