drop database if exists db_contactbook;
create database db_contactbook;
use db_contactbook;

CREATE TABLE contact (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL,
    lastname VARCHAR(40) NOT NULL,
    telephone_number VARCHAR(9) NOT NULL,
    email VARCHAR(40) NOT NULL
);