
create table books(id int primary key auto_increment,
name varchar(20) not null,
price int not null,
published_date date not null);

insert into books values(1,'java',100,'2017-10-12');
insert into books (name,price,published_date)values('c++',200,'2015-10-18');
insert into books (name,price,published_date)values('c',500,'2016-10-20');
insert into books (name,price,published_date)values('st',600,'2014-10-01');
select * from books;

desc users;