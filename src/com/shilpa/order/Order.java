package com.shilpa.order;

import java.time.LocalDate;

public class Order {
private int id;
private int usersId;
private int bookId;
private String status;
private int quantity;
private LocalDate orderDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUsersId() {
	return usersId;
}
public void setUsersId(int usersId) {
	this.usersId = usersId;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
@Override
public String toString() {
	return "Order [id=" + id + ", usersId=" + usersId + ", bookId=" + bookId + ", status=" + status + ", quantity="
			+ quantity + ", orderDate=" + orderDate + "]";
}


}
