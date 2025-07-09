create table products(
  id bigint not null auto_increment,
  name varchar(32) not null,
  description varchar(255) not null,
  price decimal(10, 2) not null,
  amount int not null,

  primary key(id)

);