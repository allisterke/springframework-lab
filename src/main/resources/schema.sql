drop table if exists companies;

create table companies (
    name varchar(20) primary key ,
    leader varchar(20) not null
);

----

drop table if exists authorities;
drop table if exists users;

create table users(
  username varchar(50) not null primary key,
  password varchar(255) not null,
  enabled boolean not null
);

create table authorities (
  username varchar(50) not null,
  authority varchar(50) not null,
  constraint fk_authorities_users foreign key(username) references users(username)
);
create unique index ix_auth_username on authorities (username,authority);

----

drop table if exists material_settings;
drop table if exists material_remain;
drop table if exists material_supplied;
drop table if exists material_scanned;
drop table if exists store;
drop table if exists material;

create table store (
  id          integer primary key auto_increment,
  location    varchar(200) not null,
  latitude    double not null,
  longitude   double not null
);

create table material (
  id          integer primary key auto_increment,
  name        varchar(100),
  unit        varchar(10)
);

create table material_scanned (
  id          char(36) primary key,
  ts          datetime,
  storeId     integer references store(id),
  materialId  integer references material(id),
  amount      double
);

create table material_supplied (
  id          integer primary key auto_increment,
  ts          datetime,
  storeId     integer references store(id),
  materialId  integer references material(id),
  amount      double
);

create table material_remain (
  storeId     integer references store(id),
  materialId  integer references material(id),
  amount      double,
  primary key (storeId, materialId)
);

create table material_settings (
  storeId     integer references store(id),
  materialId  integer references material(id),
  warn        double,
  must        double,
  fill        double
);
