CREATE DATABASE store_data_base;

USE store_data_base;

CREATE TABLE admins(
id INT AUTO_INCREMENT,
surname VARCHAR(50) NOT NULL,
name VARCHAR(50) NOT NULL,
patronymic VARCHAR(50) NOT NULL,
address VARCHAR(50) NOT NULL,
email VARCHAR(50) UNIQUE NOT NULL,
phone VARCHAR(50) UNIQUE NOT NULL,
password VARCHAR(50) NOT NULL,
registrationDate DATE NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE customers(
id INT AUTO_INCREMENT,
surname VARCHAR(50) NOT NULL,
name VARCHAR(50) NOT NULL,
patronymic VARCHAR(50) NOT NULL,
address VARCHAR(50) NOT NULL,
email VARCHAR(50) UNIQUE NOT NULL,
phone VARCHAR(50) UNIQUE NOT NULL,
password VARCHAR(50) NOT NULL,
registrationDate DATE NOT NULL,
inBlackList BOOLEAN,
PRIMARY KEY(id)
);

CREATE TABLE brands(
id INT AUTO_INCREMENT,
brand VARCHAR(50) NOT NULL,
PRIMARY KEY(id)
);
CREATE TABLE products(
id INT AUTO_INCREMENT,
price INT NOT NULL,
title VARCHAR(50) NOT NULL,
code VARCHAR(50) NOT NULL,
characteristics VARCHAR(255) NOT NULL,
creatiom_date DATE NOT NULL,
description VARCHAR(50) NOT NULL,
brand_id INT NOT NULL,
FOREIGN KEY(brand_id) REFERENCES brands(id),
PRIMARY KEY(id)
);

 CREATE TABLE orders(
id INT AUTO_INCREMENT,
user_id INT UNIQUE NOT NULL,
address VARCHAR(50)  NOT NULL,
phone VARCHAR(50) NOT NULL,
comment VARCHAR(50)  NOT NULL,
status VARCHAR(50)  NOT NULL,
PRIMARY KEY(id),
customer_id INT NOT NULL,
product_id INT NOT NULL,
FOREIGN KEY(customer_id) REFERENCES customers(id),
FOREIGN KEY(product_id) REFERENCES products(id)
);

CREATE TABLE orders_products(
product_id INT UNIQUE NOT NULL,
order_id INT UNIQUE NOT NULL,
PRIMARY KEY(product_id, order_id),
FOREIGN KEY(product_id) REFERENCES products(id),
FOREIGN KEY(order_id) REFERENCES orders(id)
);

