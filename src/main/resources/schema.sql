drop table if exists companies;

create table companies (
    name varchar(20) primary key ,
    leader varchar(20) not null
);