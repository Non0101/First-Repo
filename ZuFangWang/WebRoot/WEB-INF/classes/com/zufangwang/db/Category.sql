//��ȷ���Ƿ����ͬ����������ϵ ����ɾ������
  drop table category cascade constraints;
//����˳�򴴽���Ӧ�ı�
  create table category  (
   category_id          NUMBER(10)                      not null,
   category_name        VARCHAR2(20)                    not null,
   constraint PK_CATRGORY primary key (category_id)
);
commit;
//������Ӧ�Ĺ�ϵӳ��

insert into category values(1,'����');

insert into category values(category_seq.nextval,'����')

insert into category values(category_seq.nextval,'��Ԣ')

insert into category values(category_seq.nextval,'��ͨ')

insert into category values(category_seq.nextval,'����')

//������������
 create sequence category_seq
  increment by 1
  start with 2
  maxvalue 999999999
select * from Category
//�޸��ֶγ���
alter table House modify category_id NUMBER(10)