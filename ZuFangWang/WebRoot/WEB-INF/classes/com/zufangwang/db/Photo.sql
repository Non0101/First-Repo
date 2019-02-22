//先确认是否存在同名表或外键关系 进行删除操作
alter table Photo
   drop constraint FK_PHOTO_REFERENCE_HOUSE;
drop table "Photo" cascade constraints;
delete from Photo where photo_id between 0 and 800
//按照顺序创建相应的表
create table Photo(
   photo_id           NUMBER(20)                      not null,
   house_id          NUMBER(9) ,
   photo_path        VARCHAR2(100)                   not null,
   constraint PK_PHOTO primary key (photo_id)
)

//创建相应的关系映射
   alter table Photo
   add constraint FK_PHOTO_REFERENCE_HOUSE foreign key (house_id)
      references House (house_id);

   select * from photo
   
 //删除序列
 drop sequence photo_seq
 //创建序列咧 
  create sequence photo_seq
  increment by 1
  start with 2
  maxvalue 999999999
  
  select * from photo
  commit
