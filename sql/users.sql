use bookapp;
create table users2(user_id int primary  key auto_increment,
name varchar(20) not null,
email varchar(50) not null,
password varchar(30) not null);

insert into users2 values(1,'shilpa','ss@gmail.com','123');
insert into users2(name,email,password) values('shi','ss1@gmail.com','1232');
insert into users2 (name,email,password)values('shil','ss2@gmail.com','1238');
insert into users2 (name,email,password)values('sh','ss3@gmail.com','1230');

select * from users2;

