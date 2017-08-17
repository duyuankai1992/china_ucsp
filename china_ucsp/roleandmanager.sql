
CREATE DATABASE chinaucsp;
USE chinaucsp;

--1.角色表    
--drop table role_info;

create table role_info (
    id int(11) primary key,
    name varchar(20) not null
);
--角色    
insert into role_info values(1,'超级管理员');
insert into role_info values(2,'角色管理员');
insert into role_info values(3,'账单管理员');
insert into role_info values(4,'报表管理员');
insert into role_info values(5,'业务账号管理员');
insert into role_info values(6,'账务账号管理员');

--select * from role_info;
--2.角色权限表       
--drop table role_privilege;

create table role_privilege(
    role_id int(4), 
    privilege_id int(4),
    PRIMARY KEY  (role_id,privilege_id)
);
--超级管理员      权限          
insert into role_privilege values(1,1);
insert into role_privilege values(1,2);
insert into role_privilege values(1,3);
insert into role_privilege values(1,4);
insert into role_privilege values(1,5);
insert into role_privilege values(1,6);
insert into role_privilege values(1,7);
--角色管理员      权限          
insert into role_privilege values(2,2);
--账单管理员       权限          
insert into role_privilege values(3,6);
--报表管理员       权限        
insert into role_privilege values(4,7);
--业务管理员       权限        
insert into role_privilege values(5,5);
--账务账户管理员        权限           
insert into role_privilege values(6,4);

--select * from role_privilege;
--3.管理员表      
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
--添加管理员       
insert into admin_info values(1,'admin1','123456','陈川','13077332357','jiaqiang123@qq.com.cn',now());  
insert into admin_info values(2,'admin2','123456','卢冲','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(3,'admin3','123456','罗立文','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(4,'admin4','123456','韩老师','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(5,'admin5','123456','余老师','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(6,'admin6','123456','黎老师','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(7,'admin7','123456','李老师','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(8,'admin8','123456','王老师','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(9,'admin9','123456','韩老师','13077332357','jiaqiang123@qq.com.cn',now());
insert into admin_info values(10,'admin10','123456','张老师','13077332357','jiaqiang123@qq.com.cn',now());
--select * from admin_info;

--4.管理员角色表
--drop table admin_role;
create table admin_role(
    admin_id int(4),
    role_id int(4),
    PRIMARY KEY  (admin_id,role_id)
);
--添加管理员的角色         
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

--5.权限表     
create table privilege_info(
    privilege_id int(4) primary key,
    privilege_name varchar(20) not null
);
--添加权限     
insert into privilege_info values(1,'管理员管理');
insert into privilege_info values(2,'角色管理');
insert into privilege_info values(3,'资费管理');
insert into privilege_info values(4,'账务账号管理');
insert into privilege_info values(5,'业务账号管理');
insert into privilege_info values(6,'账单管理');
insert into privilege_info values(7,'报表管理');

--select * from privilege_info;

