-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema contabancaria
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `contabancaria` DEFAULT CHARACTER SET utf8 ;
USE `contabancaria` ;

-- -----------------------------------------------------
-- Table `contabancaria`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `contabancaria`.`cliente` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) ,
  `telefone` VARCHAR(45) ,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;
