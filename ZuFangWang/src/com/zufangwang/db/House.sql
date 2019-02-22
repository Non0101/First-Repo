
//����˳�򴴽���Ӧ�ı�
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
insert into house values (1,3,6,'ͨ���Ͼ��ж�','��Ԣ',90,'�Ͼ�ɽ· ¤��· ������ ',6,4,'�յ������ӡ�ϴ�»������䡢���ݡ�ͣ��λ',90,' 1.Կ��������ʱ������2.���ĳ���˷�3.���ӵ���λ�÷ǳ��ã��������ϣ��ɹ�ǳ��ã�����ɾ�������4.��ͨ���������������ܷ��㣬����������Ҳ��;5.���﷽�㣬���������ͳ��С�ҽԺ ѧУ ���У����������ճ������룬���Ҳ�ܷ��㣬6.С�������ã�7.�Ҿ߼ҵ���ȫ��8.���������̻������������ˮ��ԡ��������˫�˴󴲵����������¹񡢿յ�����Ƭů����������ʩ��Ϊȫ�µģ�20�׹����뻧�����£���ʩ��ȫ����װ�����ס','no')

 select * from House where house_id= 1
commit;
//������ϵӳ��
 alter table House
  add constraint FK_HOUSE_REFERENCE_CATEGORY foreign key (category_id)
      references category (category_id);
  drop constraint FK_HOUSE_REFERENCE_CATEGORY;
   
   alter table House
   add constraint FK_HOUSE_REFERENCE_USERS foreign key (user_id)
      references Users (user_id)
      
 //��������
 create sequence house_seq
  increment by 1
  start with 2
  maxvalue 999999999
 //ɾ������
 drop sequence house_seq
 
 select house_seq.nextval from dual
 select * from House
 select house_seq.currval from dual
 
 update House set house_state = 'yes' where house_id=161
 
//��ѯһ��ͼƬ��������Ϊǰ̨չʾ	
		
select h.house_id,
		p.photo_path 
		from house h 
			left join photo p 
			on h.house_id=p.house_id
				where p.photo_id in 
					(select min(photo_id) from photo group by house_id) 
				and rowNum<=6 order by h.house_id desc
		
//��������ѯĳһ�෿��
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
//���ռ۸��������
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
//ͨ���������������ѯ
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
//��ѯ�����������з���
 select * from House where user_id=6
//�����ֶγ���
alter table House modify house_name VARCHAR2(100)

select * from House