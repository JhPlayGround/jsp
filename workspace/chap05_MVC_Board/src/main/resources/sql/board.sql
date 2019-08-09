drop table board;

create or replace table board
(
	bno int auto_increment primary key,
	subject varchar(50) not null,
	content varchar(2000) not null,
	writer varchar(30) not null,
	reg_date date
);

insert into board(subject, content, writer, reg_date) values('안녕하세요','게시판을 작성 중입니다.','관리자',now());

select * from board;

commit work;