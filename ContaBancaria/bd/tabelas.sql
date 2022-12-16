-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema contabancaria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `contabancaria` DEFAULT CHARACTER SET utf8 ;
USE `contabancaria` ;

-- -----------------------------------------------------
-- Table `contabancaria`.`cliente`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `contabancaria`.`cliente` (
  `codigo` INT AUTO_INCREMENT,
  `nome` VARCHAR(45) ,
  `email` VARCHAR(45) ,
  `telefone` VARCHAR(45) ,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


select * from cliente;	


CREATE TABLE IF NOT EXISTS `contabancaria`.`pessoafisica` (
  `codigo` INT AUTO_INCREMENT,
  `nome` VARCHAR(45),
  `cpf` VARCHAR(45),
  `email` VARCHAR(45) ,
  `telefone` VARCHAR(45) ,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;

select * from pessoafisica;


CREATE TABLE IF NOT EXISTS `contabancaria`.`pessoajuridica` (
  `codigo` INT AUTO_INCREMENT,
  `nome` VARCHAR(45),
  `cnpj` VARCHAR(45) ,
  `email` VARCHAR(45) ,
  `telefone` VARCHAR(45) ,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


select * from pessoajuridica;


CREATE TABLE IF NOT EXISTS `contabancaria`.`conta` (
  `numero` INT ,
  `agencia` INT ,
  `nome` VARCHAR(45) ,
  `cpf_cnpj` VARCHAR(45) ,
  `empresa` boolean ,
  PRIMARY KEY (`numero`))
ENGINE = InnoDB;


select * from conta;  


CREATE TABLE IF NOT EXISTS `contabancaria`.`contacorrente` (
  `numero` INT ,
  `agencia` INT ,
  `saldoCC` DOUBLE,
  `nome` VARCHAR(45) ,
  `cpf_cnpj` VARCHAR(45) ,
  `empresa` boolean ,
  PRIMARY KEY (`numero`))
ENGINE = InnoDB;


select * from contacorrente;  	


CREATE TABLE IF NOT EXISTS `contabancaria`.`contapoup` (
  `numero` INT ,
  `agencia` INT ,
  `saldoPoup` DOUBLE,
  `nome` VARCHAR(45) ,
  `cpf_cnpj` VARCHAR(45) ,
  `empresa` boolean ,
  PRIMARY KEY (`numero`))
ENGINE = InnoDB;


select * from contapoup;  		

