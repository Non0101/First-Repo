delete from z_Order
//����˳�򴴽���Ӧ�ı�
 create table z_Order(
   order_id             NUMBER(15)                      primary key ,
   house_id             NUMBER(10),
   fangdong_id          NUMBER(10),                            
   house_name           VARCHAR2(100)                    not null,
   zuke_id              NUMBER(10),
   in_time              DATE                            not null,
   out_time             DATE                            not null,
    price          NUMBER(38)                       not null,
   order_time           DATE                            not null,
   order_state          VARCHAR2(10)                     not null
);
 commit
 //������Ӧ��ϵӳ��

alter table z_Order
   add constraint FK_ORDER_REFERENCE_HOUSE foreign key (house_id)
      references House (house_id);
drop sequence order_seq
//������������
 create sequence order_seq
  increment by 1
  start with 2
  maxvalue 999999999

select * from z_Order
//�޸��ֶγ���
alter table z_Order modify price number(38)