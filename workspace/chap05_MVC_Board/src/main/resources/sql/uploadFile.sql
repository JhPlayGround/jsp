drop table uploadFile;

create table uploadFile
(
	fno int auto_increment primary key,
	bno int not null,
	filename varchar(100) not null,
	fileOriginName varchar(100) not null,
	fileurl varchar(500) not null
);

commit work;

select * from uploadFile;