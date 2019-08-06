-- goodsItem.sql

create table goodsItem
(
	item_id int primary key,
	item_name varchar(50) not null,
	item_price int not null,
	item_des varchar(200),
	item_pic varchar(50)
);


delete from goodsItem;
--레코드 설정
insert into goodsItem values (1,'냉장고',850000,'s사 최고사양','img01.jpg');
insert into goodsItem values (2,'세탁기',800000,'s사 최고사양','img02.jpg');
insert into goodsItem values (3,'HDTV',285000,'s사 최고사양','img03.jpg');
insert into goodsItem values (4,'세척기',200000,'s사 최고사양','img04.jpg');
insert into goodsItem values (5,'전자레인지',150000,'s사 최고사양','img05.jpg');


select * from goodsItem;

commit work;