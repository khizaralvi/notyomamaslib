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
-- Table `mydb`.`Media`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Media` (
  `mediaId` VARCHAR(20) NOT NULL,
  `mediaTitle` VARCHAR(45) NULL,
  `mediaYear` VARCHAR(45) NULL,
  `mediaCost` VARCHAR(45) NULL,
  `mediaType` VARCHAR(45) NULL,
  `mediaQuantity` VARCHAR(45) NULL,
  `bookISBN` VARCHAR(45) NULL,
  `bookEdition` VARCHAR(45) NULL,
  `bookVolume` VARCHAR(45) NULL,
  `bookPages` VARCHAR(45) NULL,
  `bookPublisher` VARCHAR(45) NULL,
  `movieGenre` VARCHAR(45) NULL,
  `booksGenre` VARCHAR(45) NULL,
  `runningTime` VARCHAR(45) NULL,
  `publisher` VARCHAR(45) NULL,
  `numOfPages` VARCHAR(45) NULL,
  PRIMARY KEY (`mediaId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CheckedOutMedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CheckedOutMedia` (
  `mediaID` VARCHAR(20) NOT NULL,
  `patronID` VARCHAR(45) NOT NULL,
  `borrowDate` VARCHAR(45) NOT NULL,
  `dueDate` VARCHAR(45) NOT NULL,
  `patronEmail` VARCHAR(45) NULL,
  PRIMARY KEY (`mediaID`, `patronID`),
  CONSTRAINT `fk1`
    FOREIGN KEY (`mediaID`)
    REFERENCES `mydb`.`Media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Reservation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Reservation` (
  `ReservationId` INT NOT NULL AUTO_INCREMENT,
  `patronId` VARCHAR(20) NOT NULL,
  `mediaId` VARCHAR(45) NOT NULL,
  `ReservedDate` VARCHAR(45) NULL,
  INDEX `fk2_idx` (`mediaId` ASC),
  PRIMARY KEY (`ReservationId`),
  CONSTRAINT `fk2`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`Media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Cancellation`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cancellation` (
  `cancellationId` INT NOT NULL AUTO_INCREMENT,
  `patronId` VARCHAR(20) NULL,
  `mediaId` VARCHAR(45) NULL,
  `reservedDate` VARCHAR(45) NULL,
  `cancellationDate` VARCHAR(45) NULL,
  PRIMARY KEY (`cancellationId`),
  INDEX `fk3_idx` (`mediaId` ASC),
  CONSTRAINT `fk3`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`Media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Author` (
  `authorID` INT NOT NULL AUTO_INCREMENT,
  `auhorFname` VARCHAR(45) NULL,
  `authorLname` VARCHAR(45) NULL,
  `authorEmail` VARCHAR(45) NULL,
  `authorNumOfBooks` INT NULL,
  PRIMARY KEY (`authorID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`AuthorBooks`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`AuthorBooks` (
  `mediaId` VARCHAR(20) NOT NULL,
  `authorId` INT NOT NULL,
  `bookType` VARCHAR(20) NULL,
  PRIMARY KEY (`mediaId`, `authorId`),
  INDEX `fk5_idx` (`authorId` ASC),
  CONSTRAINT `fk5`
    FOREIGN KEY (`authorId`)
    REFERENCES `mydb`.`Author` (`authorID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk6`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`Media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Actors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Actors` (
  `actorId` INT NOT NULL AUTO_INCREMENT,
  `actorFname` VARCHAR(45) NULL,
  `actorLname` VARCHAR(45) NULL,
  `oscarWinner` TINYINT(1) NULL,
  `oscarNominated` TINYINT(1) NULL,
  `Actorscol` VARCHAR(45) NULL,
  PRIMARY KEY (`actorId`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`movieActors`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`movieActors` (
  `mediaId` VARCHAR(20) NOT NULL,
  `actorId` INT NOT NULL,
  PRIMARY KEY (`mediaId`, `actorId`),
  INDEX `fk10_idx` (`actorId` ASC),
  CONSTRAINT `fk9`
    FOREIGN KEY (`mediaId`)
    REFERENCES `mydb`.`Media` (`mediaId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk10`
    FOREIGN KEY (`actorId`)
    REFERENCES `mydb`.`Actors` (`actorId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
