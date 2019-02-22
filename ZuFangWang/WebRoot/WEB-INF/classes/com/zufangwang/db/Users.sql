//先确认是否存在同名表或外键关系 进行删除操作
 alter table Users
   drop constraint FK_USERS_REFERENCE_MYORDER;
   drop table Users cascade constraints;
//按照顺序创建相应的表
create table Users  (
   user_id              NUMBER(10)                     not null,
   user_name            VARCHAR2(40)                    not null,
   user_password        VARCHAR2(40)                    not null,
   user_email           VARCHAR2(100)                    not null,
   user_phone           NUMBER(38)                     not null,
   user_state           VARCHAR2(10)                     not null,
   user_category        VARCHAR2(10)                     not null,
   constraint PK_USERS primary key (user_id)
);

 insert into Users values(1,'管理员','admin','admin@admin.com',12121,'Y','管理员')
 
 update Users set user_name='dalao', user_phone=111111,user_password = '111111' ,user_category=2 where user_id = 4
commit;
drop sequence u_seq
	create sequence u_seq
	increment by 1
	start with 2
	NOMAXvalue
	NOCYCLE
	NOCACHE;
 commit;
//如需修改字段类型及长度
alter table House modify user_id NUMBER(10)


select * from Users

