-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema dbspaceships
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema dbspaceships
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `dbspaceships` DEFAULT CHARACTER SET utf8mb3 ;
USE `dbspaceships` ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Table `dbspaceships`.`spaceships`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `dbspaceships`.`spaceships` (
  `idSpaceShip` VARCHAR(45) NOT NULL,
  `fuelType` VARCHAR(45) NOT NULL,
  `yearCreation` DATETIME NOT NULL,
  `isActive` TINYINT(1) NOT NULL,
  `power` VARCHAR(45) NOT NULL,
  `countries_idCountries` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idSpaceShip`),
  UNIQUE INDEX `idSpaceShip_UNIQUE` (`idSpaceShip` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- See db table spaceShips
select * from `dbspaceships`.`spaceships`;

-- -----------------------------------------------------
-- Delte `dbspaceships`
-- -----------------------------------------------------
DROP DATABASE `dbspaceships`;

-- -----------------------------------------------------
-- Delte values from `dbspaceships`
-- -----------------------------------------------------
DELETE FROM dbspaceships.spaceships where idSpaceShip != null;