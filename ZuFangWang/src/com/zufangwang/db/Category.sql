//先确认是否存在同名表或外键关系 进行删除操作
  drop table category cascade constraints;
//按照顺序创建相应的表
  create table category  (
   category_id          NUMBER(10)                      not null,
   category_name        VARCHAR2(20)                    not null,
   constraint PK_CATRGORY primary key (category_id)
);
commit;
//创建相应的关系映射

insert into category values(1,'别墅');

insert into category values(category_seq.nextval,'民宿')

insert into category values(category_seq.nextval,'公寓')

insert into category values(category_seq.nextval,'普通')

insert into category values(category_seq.nextval,'其他')

//创建自增序列
 create sequence category_seq
  increment by 1
  start with 2
  maxvalue 999999999
select * from Category
//修改字段长度
alter table House modify category_id NUMBER(10)