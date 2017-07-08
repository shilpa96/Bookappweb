drop table orders;
create table orders(id int primary key auto_increment,
users_id int,
foreign key(users_id) references users2(user_id),
book_id int,
foreign key(book_id)references books(id),
status varchar(30) not null,
constraint status check(status in('ordered','delivered','cancelled')),
quantity int);

alter table orders add(order_date date);

insert into orders values (1,21'ordered',2,'2016-12-15');
insert into orders(users_id,book_id,status,quantity,order_date) values (2,2,'ordered',2,'2016-10-14');
insert into orders(users_id,book_id,status,quantity,order_date) values (2,3,'ordered',3,'2016-11-13');
 select * from orders;
 
 
