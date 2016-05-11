-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema library_system
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `library_system` ;

-- -----------------------------------------------------
-- Schema library_system
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `library_system` DEFAULT CHARACTER SET utf8 ;
USE `library_system` ;

-- -----------------------------------------------------
-- Table `library_system`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`author` (
  `authorID` INT(5) NOT NULL AUTO_INCREMENT,
  `authorName` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`authorID`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`media`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`media` (
  `mediaId` INT(5) NOT NULL AUTO_INCREMENT,
  `mediaTitle` VARCHAR(45) NULL DEFAULT NULL,
  `mediaYear` VARCHAR(4) NULL DEFAULT NULL,
  `mediaCategory` VARCHAR(20) NULL DEFAULT NULL,
  `mediaCost` DOUBLE NULL DEFAULT NULL,
  `mediaType` VARCHAR(1) NULL DEFAULT NULL,
  `mediaQuantity` INT(11) NULL DEFAULT NULL,
  `mediaPublisher` VARCHAR(20) NULL DEFAULT NULL,
  `bookISBN` VARCHAR(45) NULL DEFAULT NULL,
  `bookEdition` VARCHAR(3) NULL DEFAULT NULL,
  `bookVolume` VARCHAR(3) NULL DEFAULT NULL,
  `runningTime` VARCHAR(6) NULL DEFAULT NULL,
  `movieDirector` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaId`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`authorbooks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`authorbooks` (
  `mediaId` INT(5) NOT NULL,
  `authorId` INT(5) NOT NULL,
  PRIMARY KEY (`mediaId`, `authorId`),
  INDEX `fk5_idx` (`authorId` ASC),
  CONSTRAINT `fk5`
    FOREIGN KEY (`authorId`)
    REFERENCES `library_system`.`author` (`authorID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk6`
    FOREIGN KEY (`mediaId`)
    REFERENCES `library_system`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`patronaccount`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`patronaccount` (
  `patronId` INT(5) NOT NULL AUTO_INCREMENT,
  `patronFname` VARCHAR(45) NULL DEFAULT NULL,
  `patronLname` VARCHAR(45) NULL DEFAULT NULL,
  `patronPhoneNumber` VARCHAR(45) NULL DEFAULT NULL,
  `patronEmail` VARCHAR(45) NULL DEFAULT NULL,
  `patronAccountBalance` VARCHAR(45) NULL DEFAULT NULL,
  `accounttype` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`patronId`))
ENGINE = InnoDB
AUTO_INCREMENT = 51
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`cancellation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`cancellation` (
  `cancellationId` INT(5) NOT NULL AUTO_INCREMENT,
  `patronId` INT(5) NULL DEFAULT NULL,
  `mediaId` INT(5) NULL DEFAULT NULL,
  `reservedDate` VARCHAR(10) NULL DEFAULT NULL,
  `cancellationDate` VARCHAR(10) NULL DEFAULT NULL,
  PRIMARY KEY (`cancellationId`),
  INDEX `fk3_idx` (`mediaId` ASC),
  INDEX `fk32_idx` (`patronId` ASC),
  CONSTRAINT `fk3`
    FOREIGN KEY (`mediaId`)
    REFERENCES `library_system`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk32`
    FOREIGN KEY (`patronId`)
    REFERENCES `library_system`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`checkedoutmedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`checkedoutmedia` (
  `mediaID` INT(5) NOT NULL,
  `patronID` INT(5) NOT NULL,
  `borrowDate` VARCHAR(10) NOT NULL,
  `dueDate` VARCHAR(10) NOT NULL,
  `patronEmail` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaID`, `patronID`, `borrowDate`),
  INDEX `fk20_idx` (`patronID` ASC),
  CONSTRAINT `fk1`
    FOREIGN KEY (`mediaID`)
    REFERENCES `library_system`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk20`
    FOREIGN KEY (`patronID`)
    REFERENCES `library_system`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`reservation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`reservation` (
  `reservationId` INT(5) NOT NULL AUTO_INCREMENT,
  `patronId` INT(5) NOT NULL,
  `mediaId` INT(5) NOT NULL,
  `reservedDate` VARCHAR(10) NULL DEFAULT NULL,
  PRIMARY KEY (`reservationId`),
  INDEX `fk2_idx` (`mediaId` ASC),
  INDEX `fk25_idx` (`patronId` ASC),
  CONSTRAINT `fk2`
    FOREIGN KEY (`mediaId`)
    REFERENCES `library_system`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk25`
    FOREIGN KEY (`patronId`)
    REFERENCES `library_system`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`income`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`income` (
  `invoice` INT NOT NULL,
  `patronId` INT NOT NULL AUTO_INCREMENT,
  `date` DATE NOT NULL,
  `type` VARCHAR(1) NOT NULL,
  `amountPaid` DOUBLE NOT NULL,
  PRIMARY KEY (`invoice`),
  INDEX `patronId_idx` (`patronId` ASC),
  CONSTRAINT `patronId`
    FOREIGN KEY (`patronId`)
    REFERENCES `library_system`.`patronaccount` (`patronId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
