-- Cria��o do banco --
CREATE DATABASE comercial ;

-- acessando o banco --
use comercial;

-- Inicio Cria��o das Tabelas --
create table cliente(
id int not null auto_increment,
codigo_cliente varchar(10),
nome varchar(100),
razao_social varchar(100),
data_cadastro date,
cnpj varchar(20),
telefone varchar(20),
primary key (id));

insert into cliente(codigo_cliente, nome, razao_social, data_cadastro, cnpj, telefone)
              value('C26', 'Gulherme', 'Aluno',now(), '123456789', '(47) 92222-9999');
select now();              
select * from cliente;              

create table fornecedor(
id int not null auto_increment,
codigo_fornecedor varchar(10),
nome varchar(100),
razao_social varchar(100),
telefone varchar(20),
primary key(id));

create table vendedor(
id int not null auto_increment,
codigo_Vendedor varchar(10),
nome varchar(100),
razavende varchar(100),
telefone varchar(20),
n_porcvende float(10,2),
primary key(id));

create table produto(
id int not null auto_increment,
codigo_produto varchar(20),
descricao varchar(100),
valor float(10,2),
situacao varchar(1),
id_fornecedor int,
primary key(id));
   
create table venda(
id int not null auto_increment,
codigo_venda varchar(10),
id_cliente int not null,
id_fornecedor int not null,
id_vendedor int not null,
valor float(10,2),
desconto float(10,2),
total float(10,2),
data_venda date,
primary key(id));    
   
create table item_venda(
id int not null auto_increment,
codigo_item_venda  int not null,
id_produto  int not null,
valor float(10,2),
qtde int,
desconto float(10,2),
primary key(id));    
-- Fim Cria��o das Tabelas --  

-- inicio altera��o de tabelas --
alter table cliente add column cidade varchar(50);

alter table cliente add column estado varchar(50);

alter table cliente drop column estado;

alter table cliente add column estado varchar(50);

alter table cliente drop column estado;

alter table cliente modify column estado varchar(100);

alter table cliente modify column estado int;

alter table cliente modify column estado varchar(100);

-- mostra a estrutura fisica da table --
describe cliente;