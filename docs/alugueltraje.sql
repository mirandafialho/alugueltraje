-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema alugueltraje
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema alugueltraje
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `alugueltraje` DEFAULT CHARACTER SET utf8 ;
USE `alugueltraje` ;

-- -----------------------------------------------------
-- Table `alugueltraje`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `alugueltraje`.`clientes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(75) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `telefone` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `alugueltraje`.`itens`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `alugueltraje`.`itens` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `tipo` VARCHAR(50) NOT NULL,
  `tamanho` VARCHAR(5) NOT NULL,
  `quantidade` INT NOT NULL,
  `cor` VARCHAR(50) NOT NULL,
  `valor` FLOAT NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `alugueltraje`.`locacoes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `alugueltraje`.`locacoes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `total` FLOAT NOT NULL,
  `data_inicial` DATE NOT NULL,
  `data_final` DATE NOT NULL,
  `data_devolucao` DATE NULL,
  `itens_id` INT NOT NULL,
  `clientes_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_locacoes_itens_idx` (`itens_id` ASC),
  INDEX `fk_locacoes_clientes1_idx` (`clientes_id` ASC),
  CONSTRAINT `fk_locacoes_itens`
    FOREIGN KEY (`itens_id`)
    REFERENCES `alugueltraje`.`itens` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_locacoes_clientes1`
    FOREIGN KEY (`clientes_id`)
    REFERENCES `alugueltraje`.`clientes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
