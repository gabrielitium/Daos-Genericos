SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `daos_genericos` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `daos_genericos` ;

-- -----------------------------------------------------
-- Table `daos_genericos`.`cursos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `daos_genericos`.`cursos` (
  `idcurso` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idcurso`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `daos_genericos`.`alumnos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `daos_genericos`.`alumnos` (
  `idalumno` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `grado` VARCHAR(45) NOT NULL,
  `grupo` VARCHAR(45) NOT NULL,
  `idcurso` INT NOT NULL,
  PRIMARY KEY (`idalumno`),
  INDEX `fk_alumnos_cursos_idx` (`idcurso` ASC),
  CONSTRAINT `fk_alumnos_cursos`
    FOREIGN KEY (`idcurso`)
    REFERENCES `daos_genericos`.`cursos` (`idcurso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
