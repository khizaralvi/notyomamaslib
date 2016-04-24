-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`actors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`actors` (
  `actorId` INT(11) NOT NULL AUTO_INCREMENT,
  `actorFname` VARCHAR(45) NULL DEFAULT NULL,
  `actorLname` VARCHAR(45) NULL DEFAULT NULL,
  `oscarWinner` TINYINT(1) NULL DEFAULT NULL,
  `oscarNominated` TINYINT(1) NULL DEFAULT NULL,
  `Actorscol` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`actorId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`author` (
  `authorID` INT(11) NOT NULL AUTO_INCREMENT,
  `auhorFname` VARCHAR(45) NULL DEFAULT NULL,
  `authorLname` VARCHAR(45) NULL DEFAULT NULL,
  `authorEmail` VARCHAR(45) NULL DEFAULT NULL,
  `authorNumOfBooks` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`authorID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`media`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`media` (
  `mediaId` VARCHAR(20) NOT NULL,
  `mediaTitle` VARCHAR(45) NULL DEFAULT NULL,
  `mediaYear` VARCHAR(45) NULL DEFAULT NULL,
  `mediaCost` VARCHAR(45) NULL DEFAULT NULL,
  `mediaType` VARCHAR(45) NULL DEFAULT NULL,
  `mediaQuantity` VARCHAR(45) NULL DEFAULT NULL,
  `bookISBN` VARCHAR(45) NULL DEFAULT NULL,
  `bookEdition` VARCHAR(45) NULL DEFAULT NULL,
  `bookVolume` VARCHAR(45) NULL DEFAULT NULL,
  `bookPages` VARCHAR(45) NULL DEFAULT NULL,
  `bookPublisher` VARCHAR(45) NULL DEFAULT NULL,
  `movieGenre` VARCHAR(45) NULL DEFAULT NULL,
  `booksGenre` VARCHAR(45) NULL DEFAULT NULL,
  `runningTime` VARCHAR(45) NULL DEFAULT NULL,
  `publisher` VARCHAR(45) NULL DEFAULT NULL,
  `numOfPages` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`authorbooks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`authorbooks` (
  `mediaId` VARCHAR(20) NOT NULL,
  `authorId` INT(11) NOT NULL,
  `bookType` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaId`, `authorId`),
  INDEX `fk5_idx` (`authorId` ASC),
  CONSTRAINT `fk5`
    FOREIGN KEY (`authorId`)
    REFERENCES `mydb`.`author` (`authorID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk6`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`patronaccount`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`patronaccount` (
  `patronId` VARCHAR(20) NOT NULL,
  `patronFname` VARCHAR(45) NULL,
  `patronLname` VARCHAR(45) NULL,
  `patronPhoneNumber` VARCHAR(45) NULL,
  `patronEmail` VARCHAR(45) NULL,
  `patronAccountBalance` VARCHAR(45) NULL,
  `accounttype` VARCHAR(45) NULL,
  PRIMARY KEY (`patronId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`cancellation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`cancellation` (
  `cancellationId` INT(11) NOT NULL AUTO_INCREMENT,
  `patronId` VARCHAR(20) NULL DEFAULT NULL,
  `mediaId` VARCHAR(45) NULL DEFAULT NULL,
  `reservedDate` VARCHAR(45) NULL DEFAULT NULL,
  `cancellationDate` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`cancellationId`),
  INDEX `fk3_idx` (`mediaId` ASC),
  INDEX `fk32_idx` (`patronId` ASC),
  CONSTRAINT `fk3`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk32`
    FOREIGN KEY (`patronId`)
    REFERENCES `mydb`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`checkedoutmedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`checkedoutmedia` (
  `mediaID` VARCHAR(20) NOT NULL,
  `patronID` VARCHAR(45) NOT NULL,
  `borrowDate` VARCHAR(45) NOT NULL,
  `dueDate` VARCHAR(45) NOT NULL,
  `patronEmail` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaID`, `patronID`),
  INDEX `fk20_idx` (`patronID` ASC),
  CONSTRAINT `fk1`
    FOREIGN KEY (`mediaID`)
    REFERENCES `mydb`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk20`
    FOREIGN KEY (`patronID`)
    REFERENCES `mydb`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`movieactors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`movieactors` (
  `mediaId` VARCHAR(20) NOT NULL,
  `actorId` INT(11) NOT NULL,
  PRIMARY KEY (`mediaId`, `actorId`),
  INDEX `fk10_idx` (`actorId` ASC),
  CONSTRAINT `fk10`
    FOREIGN KEY (`actorId`)
    REFERENCES `mydb`.`actors` (`actorId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk9`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `mydb`.`reservation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`reservation` (
  `ReservationId` INT(11) NOT NULL AUTO_INCREMENT,
  `patronId` VARCHAR(20) NOT NULL,
  `mediaId` VARCHAR(45) NOT NULL,
  `ReservedDate` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`ReservationId`),
  INDEX `fk2_idx` (`mediaId` ASC),
  INDEX `fk25_idx` (`patronId` ASC),
  CONSTRAINT `fk2`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk25`
    FOREIGN KEY (`patronId`)
    REFERENCES `mydb`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
