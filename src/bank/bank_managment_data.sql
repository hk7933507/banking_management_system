create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20), name varchar(20), fname varchar(20), dob varchar(20), gender varchar(20), email varchar(30), martial varchar(20), address varchar(40), city varchar(25), pin varchar(25), state varchar(20));
show tables;
create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), soccupation varchar(30), span varchar(20), saadhar varchar(40), seniorcitizen varchar(25), exisitingaccount varchar(25));
show tables;
select * from signuptwo;
create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100));
create table login(formno varchar(20), cardnumber varchar(25), pinnumber varchar(10));
select * from login;
select * from signupthree;
create table bank(pin varchar(20), date varchar(50), type varchar(20), amount varchar(20));
select * from login;
select * from bank;