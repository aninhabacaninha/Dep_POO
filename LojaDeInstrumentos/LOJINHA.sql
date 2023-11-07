create database LOJINHA;
use LOJINHA;

create table Usuario (
	codigo int primary key auto_increment,
    nome text not null,
    senha text not null,
    saldo numeric(10,2) not null
);

create table Vendedor (
	codigo int primary key auto_increment,
    nome text not null,
    saldo numeric(10,2) not null
);

select * from vendedor;