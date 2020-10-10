-- Criar schema ou banco
CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;

-- Script para criar uma tabela

CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));

  -- Definições dos comandos
  
DDL --- Data Definition Language
CREATE TABLE
ALTER TABLE
DROP TABLE

DML --- Data Manipulation Language
CREATE   --- INSERT  --- INSERIR
READ     --- SELECT  --- CONSULTAR
UPDATE   --- UPDATE  --- ALTERAR
DELETE   --- DELETE  --- EXCLUIR

-- Inserindo registros 

use zoo;

INSERT INTO animal( especie, idade, estaVivo)values("Leão", 10, 1);

-- Consultando os registros da tabela

SELECT especie, idade, estaVivo FROM animal;