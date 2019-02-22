
//按照顺序创建相应的表
create table House(
   house_id             NUMBER(10)                      not null,
   category_id          NUMBER(10)                       not null,
   user_id              NUMBER(10)                        not null,
   house_name           VARCHAR2(100)                     not null,
   house_type           VARCHAR2(10)                    not null,
   house_area           NUMBER(38)                        not null,
   house_address        VARCHAR2(80)                    not null,
   live_number          NUMBER(38)                      not null,
   room_number          NUMBER(38)                      not null,
   room_sheshi          VARCHAR2(80)                    not null,
   house_price          NUMBER(38)                      not null,
   house_describe       VARCHAR2(800)                    not null,
   house_state          VARCHAR2(10)                      not null,
   constraint PK_HOUSE primary key (house_id)
);
insert into house values (1,3,6,'通利紫荆尚都','公寓',90,'紫荆山路 陇海路 地铁口 ',6,4,'空调、电视、洗衣机、冰箱、电梯、停车位',90,' 1.钥匙在手随时看房。2.诚心出租此房3.房子地理位置非常好，坐北朝南，采光非常好，房间干净卫生；4.交通便利，附近公交很方便，地铁、公交也有;5.购物方便，附近大中型超市、医院 学校 都有，您可以买日常所必须，买菜也很方便，6.小区环境好，7.家具家电齐全，8.厨房，油烟机、整体橱柜、热水淋浴器、卧室双人大床电脑桌、大衣柜、空调、整片暖气，所有设施均为全新的，20兆光纤入户，晾衣，设施齐全，精装拎包入住','no')

 select * from House where house_id= 1
commit;
//创建关系映射
 alter table House
  add constraint FK_HOUSE_REFERENCE_CATEGORY foreign key (category_id)
      references category (category_id);
  drop constraint FK_HOUSE_REFERENCE_CATEGORY;
   
   alter table House
   add constraint FK_HOUSE_REFERENCE_USERS foreign key (user_id)
      references Users (user_id)
      
 //创建序列
 create sequence house_seq
  increment by 1
  start with 2
  maxvalue 999999999
 //删除序列
 drop sequence house_seq
 
 select house_seq.nextval from dual
 select * from House
 select house_seq.currval from dual
 
 update House set house_state = 'yes' where house_id=161
 
//查询一条图片名数据作为前台展示	
		
select h.house_id,
		p.photo_path 
		from house h 
			left join photo p 
			on h.house_id=p.house_id
				where p.photo_id in 
					(select min(photo_id) from photo group by house_id) 
				and rowNum<=6 order by h.house_id desc
		
//按照类别查询某一类房屋
select h.house_id,
       h.house_type,
       h.house_price,
		p.photo_path 
		from house h 
			left join photo p 
			on h.house_id=p.house_id
				where p.photo_id in 
					(select min(photo_id) from photo group by house_id) 
				and h.category_id=1;
//按照价格区间分类
select h.house_id,
       h.house_type,
       h.house_price,
		p.photo_path 
		from house h 
			left join photo p 
			on h.house_id=p.house_id
				where p.photo_id in 
					(select min(photo_id) from photo group by house_id) 
				and h.house_price between 0 and 99;
//通过房间数来分类查询
	select h.house_id,
	  h.house_name,
       h.house_type,
       h.house_price,
		p.photo_path 
		from house h 
			left join photo p 
			on h.house_id=p.house_id
				where p.photo_id in 
					(select min(photo_id) from photo group by house_id) 
				and h.room_number =1
//查询房东名下所有房屋
 select * from House where user_id=6
//更新字段长度
alter table House modify house_name VARCHAR2(100)

select * from House