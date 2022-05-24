-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema clientes_vip
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clientes_vip
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clientes_vip` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `clientes_vip` ;

-- -----------------------------------------------------
-- Table `clientes_vip`.`operaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientes_vip`.`operaciones` (
  `idOperaciones` INT NOT NULL,
  `Fecha` VARCHAR(45) NOT NULL,
  `Cantidad puntos gastados` VARCHAR(45) NOT NULL,
  `OPcliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idOperaciones`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clientes_vip`.`clientes vip`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientes_vip`.`clientes vip` (
  `idclientes vip` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellidos` VARCHAR(45) NOT NULL,
  `Correo_electronico` VARCHAR(45) NOT NULL,
  `Usuario` VARCHAR(45) NOT NULL,
  `Contraseña` VARCHAR(45) NOT NULL,
  `Saldo` INT NOT NULL,
  `Maximo saldo mes` INT NOT NULL,
  `Operaciones_idOperaciones` INT NOT NULL,
  PRIMARY KEY (`idclientes vip`, `Operaciones_idOperaciones`),
  INDEX `fk_clientes vip_Operaciones1_idx` (`Operaciones_idOperaciones` ASC) VISIBLE,
  CONSTRAINT `fk_clientes vip_Operaciones1`
    FOREIGN KEY (`Operaciones_idOperaciones`)
    REFERENCES `clientes_vip`.`operaciones` (`idOperaciones`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clientes_vip`.`clientes potenciales`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientes_vip`.`clientes potenciales` (
  `idClientes potenciales` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `apellidos` VARCHAR(45) NOT NULL,
  `correo` VARCHAR(45) NOT NULL,
  `clientes vip_idclientes vip` INT NOT NULL,
  `clientes vip_Operaciones_idOperaciones` INT NOT NULL,
  PRIMARY KEY (`idClientes potenciales`, `clientes vip_idclientes vip`, `clientes vip_Operaciones_idOperaciones`),
  INDEX `fk_clientes potenciales_clientes vip1_idx` (`clientes vip_idclientes vip` ASC, `clientes vip_Operaciones_idOperaciones` ASC) VISIBLE,
  CONSTRAINT `fk_clientes potenciales_clientes vip1`
    FOREIGN KEY (`clientes vip_idclientes vip` , `clientes vip_Operaciones_idOperaciones`)
    REFERENCES `clientes_vip`.`clientes vip` (`idclientes vip` , `Operaciones_idOperaciones`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clientes_vip`.`gestor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientes_vip`.`gestor` (
  `idGestores` INT NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `Apellidos` VARCHAR(45) NOT NULL,
  `Correocontacto` VARCHAR(45) NOT NULL,
  `Años en la empresa` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGestores`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `clientes_vip`.`relacion cliente gestor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clientes_vip`.`relacion cliente gestor` (
  `clientes vip_idclientes vip` INT NOT NULL,
  `clientes vip_Operaciones_idOperaciones` INT NOT NULL,
  `Gestores_idGestores` INT NOT NULL,
  PRIMARY KEY (`clientes vip_idclientes vip`, `clientes vip_Operaciones_idOperaciones`, `Gestores_idGestores`),
  INDEX `fk_clientes vip_has_Gestores_Gestores1_idx` (`Gestores_idGestores` ASC) VISIBLE,
  INDEX `fk_clientes vip_has_Gestores_clientes vip1_idx` (`clientes vip_idclientes vip` ASC, `clientes vip_Operaciones_idOperaciones` ASC) VISIBLE,
  CONSTRAINT `fk_clientes vip_has_Gestores_clientes vip1`
    FOREIGN KEY (`clientes vip_idclientes vip` , `clientes vip_Operaciones_idOperaciones`)
    REFERENCES `clientes_vip`.`clientes vip` (`idclientes vip` , `Operaciones_idOperaciones`),
  CONSTRAINT `fk_clientes vip_has_Gestores_Gestores1`
    FOREIGN KEY (`Gestores_idGestores`)
    REFERENCES `clientes_vip`.`gestor` (`idGestores`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
