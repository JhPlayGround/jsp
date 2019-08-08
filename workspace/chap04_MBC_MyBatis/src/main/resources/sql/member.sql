create table member
(
	id varchar(20) primary key,
	pwd varchar(30) not null,
	name varchar(30) not null
);

insert into member values('hong','1234','홍길동');
insert into member values('lee','1234','이순신');
insert into member values('kim','1234','김희선');

select * from member;

commit work;