
CREATE DATABASE chinaucsp;
USE chinaucsp;

--1.��ɫ��    
--drop table role_info;

create table role_info (
    id int(11) primary key,
    name varchar(20) not null
);
--��ɫ    
insert into role_info values(1,'��������Ա');
insert into role_info values(2,'��ɫ����Ա');
insert into role_info values(3,'�˵�����Ա');
insert into role_info values(4,'�������Ա');
insert into role_info values(5,'ҵ���˺Ź���Ա');
insert into role_info values(6,'�����˺Ź���Ա');

--select * from role_info;
--2.��ɫȨ�ޱ�       
--drop table role_privilege;

create table role_privilege(
    role_id int(4), 
    privilege_id int(4),
    PRIMARY KEY  (role_id,privilege_id)
);
--��������Ա      Ȩ��          
insert into role_privilege values(1,1);
insert into role_privilege values(1,2);
insert into role_privilege values(1,3);
insert into role_privilege values(1,4);
insert into role_privilege values(1,5);
insert into role_privilege values(1,6);
insert into role_privilege values(1,7);
--��ɫ����Ա      Ȩ��          
insert into role_privilege values(2,2);
--�˵�����Ա       Ȩ��          
insert into role_privilege values(3,6);
--�������Ա       Ȩ��        
insert into role_privilege values(4,7);
--ҵ�����Ա       Ȩ��        
insert into role_privilege values(5,5);
--�����˻�����Ա        Ȩ��           
insert into role_privilege values(6,4);

--select * from role_privilege;
--3.����Ա��      
--drop table admin_info;
create table admin_info(
    id int(4) primary key,
    admin_code varchar(30) unique not null,
    password varchar(8) not null,
    name varchar(20) not null,
    telephone varchar(15),
    email varchar(50),
    enrolldate date not null
);
--��ӹ���Ա       
insert into admin_info values(1,'admin1','123456','�´�','13077332357','jiaqiang123@qq.com.cn',now());  
insert into admin_info values(2,'admin2','123456','¬��','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(3,'admin3','123456','������','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(4,'admin4','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(5,'admin5','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(6,'admin6','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(7,'admin7','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(8,'admin8','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(9,'admin9','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(10,'admin10','123456','����ʦ','13077332357','jiaqiang123@qq.com.cn',now());
--select * from admin_info;

--4.����Ա��ɫ��
--drop table admin_role;
create table admin_role(
    admin_id int(4),
    role_id int(4),
    PRIMARY KEY  (admin_id,role_id)
);
--��ӹ���Ա�Ľ�ɫ         
insert into admin_role values(1,1);
insert into admin_role values(2,2);
insert into admin_role values(3,3);
insert into admin_role values(4,4);
insert into admin_role values(5,5);
insert into admin_role values(6,6);
insert into admin_role values(7,1);
insert into admin_role values(8,1);
insert into admin_role values(8,2);
insert into admin_role values(8,3);
insert into admin_role values(8,4);
insert into admin_role values(8,5);
insert into admin_role values(8,6);
insert into admin_role values(9,2);
insert into admin_role values(9,3);
insert into admin_role values(9,4);
insert into admin_role values(10,4);
insert into admin_role values(10,5);
insert into admin_role values(10,6);
--select * from admin_role;

--5.Ȩ�ޱ�     
create table privilege_info(
    privilege_id int(4) primary key,
    privilege_name varchar(20) not null
);
--���Ȩ��     
insert into privilege_info values(1,'����Ա����');
insert into privilege_info values(2,'��ɫ����');
insert into privilege_info values(3,'�ʷѹ���');
insert into privilege_info values(4,'�����˺Ź���');
insert into privilege_info values(5,'ҵ���˺Ź���');
insert into privilege_info values(6,'�˵�����');
insert into privilege_info values(7,'�������');

--select * from privilege_info;

