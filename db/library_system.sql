-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

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
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`media`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`media` (
  `mediaId` INT(10) NOT NULL AUTO_INCREMENT,
  `mediaTitle` VARCHAR(300) NULL DEFAULT NULL,
  `mediaYear` VARCHAR(4) NULL DEFAULT NULL,
  `mediaCategory` VARCHAR(20) NULL DEFAULT NULL,
  `mediaCost` DOUBLE NULL DEFAULT NULL,
  `mediaType` VARCHAR(1) NULL DEFAULT NULL,
  `mediaQuantity` INT(11) NULL DEFAULT NULL,
  `mediaPublisher` VARCHAR(20) NULL DEFAULT NULL,
  `mediaCode` VARCHAR(45) NULL DEFAULT NULL,
  `bookEdition` VARCHAR(3) NULL DEFAULT NULL,
  `bookVolume` VARCHAR(3) NULL DEFAULT NULL,
  `runningTime` VARCHAR(6) NULL DEFAULT NULL,
  `movieDirector` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaId`))
ENGINE = InnoDB
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
-- Table `library_system`.`patron`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`patron` (
  `pID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `pFname` VARCHAR(64) NOT NULL,
  `pLname` VARCHAR(64) NOT NULL,
  `pPhone` VARCHAR(11) NOT NULL,
  `pEmail` VARCHAR(128) NOT NULL,
  `pAddress` VARCHAR(264) NOT NULL,
  `pBalance` FLOAT(10,2) NULL DEFAULT 0.0,
  `enrollDate` TIMESTAMP(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `lastModified` TIMESTAMP(0) NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`pID`),
  UNIQUE INDEX `pID_UNIQUE` (`pID` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `library_system`.`patron_Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`patron_Login` (
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `patronId` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`patronId`),
  CONSTRAINT `fk66`
    FOREIGN KEY (`patronId`)
    REFERENCES `library_system`.`patron` (`pID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `library_system`.`staff_account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`staff_account` (
  `staffId` INT(11) NOT NULL AUTO_INCREMENT,
  `StaffFname` VARCHAR(45) NULL,
  `staffLname` VARCHAR(45) NULL DEFAULT NULL,
  `StaffPhoneNumber` VARCHAR(45) NULL DEFAULT NULL,
  `staffEmail` VARCHAR(45) NULL DEFAULT NULL,
  `accounttype` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`staffId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `library_system`.`staff_Login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`staff_Login` (
  `login_id` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`login_id`),
  CONSTRAINT `fk72`
    FOREIGN KEY (`login_id`)
    REFERENCES `library_system`.`staff_account` (`staffId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `library_system`.`cancellation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`cancellation` (
  `cancellationId` INT(15) NOT NULL AUTO_INCREMENT,
  `patronId` INT(10) UNSIGNED NOT NULL,
  `mediaId` INT(10) NOT NULL,
  `reservedDate` DATE NOT NULL,
  `cancellationDate` DATE NOT NULL,
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
    REFERENCES `library_system`.`patron` (`pID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`checkedoutmedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`checkedoutmedia` (
  `mediaID` INT(10) NOT NULL,
  `patronID` INT(10) UNSIGNED NOT NULL,
  `borrowDate` DATE NOT NULL,
  `dueDate` DATE NOT NULL,
  `patronEmail` VARCHAR(64) NULL DEFAULT NULL,
  PRIMARY KEY (`mediaID`, `patronID`, `borrowDate`),
  INDEX `fk20_idx` (`patronID` ASC),
  CONSTRAINT `fk1`
    FOREIGN KEY (`mediaID`)
    REFERENCES `library_system`.`media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk20`
    FOREIGN KEY (`patronID`)
    REFERENCES `library_system`.`patron` (`pID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`income`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`income` (
  `invoice` INT(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `patronId` INT(10) UNSIGNED NOT NULL,
  `date` DATE NOT NULL,
  `type` VARCHAR(1) NOT NULL,
  `amountPaid` DOUBLE NOT NULL,
  PRIMARY KEY (`invoice`),
  INDEX `patronId_idx` (`patronId` ASC),
  CONSTRAINT `patronId`
    FOREIGN KEY (`patronId`)
    REFERENCES `library_system`.`patron` (`pID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `library_system`.`reservation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `library_system`.`reservation` (
  `reservationId` INT(15) NOT NULL AUTO_INCREMENT,
  `patronId` INT(10) UNSIGNED NOT NULL,
  `mediaId` INT(10) NOT NULL,
  `reservedDate` DATE NULL DEFAULT NULL,
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
    REFERENCES `library_system`.`patron` (`pID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;