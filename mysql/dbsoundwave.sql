-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema soundwave
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema soundwave
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `soundwave` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `soundwave` ;

-- -----------------------------------------------------
-- Table `soundwave`.`friends`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`friends` (
  `idFriends` BIGINT NOT NULL AUTO_INCREMENT,
  `status` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`idFriends`),
  CONSTRAINT `friends_has_user`
    FOREIGN KEY (`idFriends`)
    REFERENCES `soundwave`.`users` (`idUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`notifications`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`notifications` (
  `idNotifications` BIGINT NOT NULL AUTO_INCREMENT,
  `comentary` longtext NOT NULL,
  `published` VARCHAR(350) NOT NULL,
  PRIMARY KEY (`idNotifications`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`posts` (
  `idPost` BIGINT NOT NULL AUTO_INCREMENT,
  `description` longtext NOT NULL,
  `date_post` DATETIME NOT NULL,
  `idUser` BIGINT,
  PRIMARY KEY (`idPost`),
  CONSTRAINT `posts_has_comments`
    FOREIGN KEY (`idPost`)
    REFERENCES `soundwave`.`comments` (`idComments`),
  CONSTRAINT `posts_has_user`
    FOREIGN KEY (`idPost`)
    REFERENCES `soundwave`.`users` (`idUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`profile` (
  `idProfile` BIGINT NOT NULL AUTO_INCREMENT,
  `user_img` VARCHAR(350) NULL DEFAULT NULL,
  `birthday_date` TIMESTAMP NULL DEFAULT NULL,
  `location` VARCHAR(150) NULL DEFAULT NULL,
  `gender` VARCHAR(45) NULL DEFAULT NULL,
  `idUser` BIGINT,
  PRIMARY KEY (`idProfile`),
  CONSTRAINT `profile_has_user`
    FOREIGN KEY (`idProfile`)
    REFERENCES `soundwave`.`users` (`idUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`users` (
  `idUser` BIGINT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL DEFAULT NULL,
  `email` VARCHAR(100) NULL DEFAULT NULL,
  `created_at` DATE NULL DEFAULT NULL,
  `password` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`idUser`),
  CONSTRAINT `user_has_notifications`
    FOREIGN KEY (`idUser`)
    REFERENCES `soundwave`.`notifications` (`idNotifications`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`comments` (
  `idComments` BIGINT NOT NULL AUTO_INCREMENT,
  `content` longtext NULL DEFAULT NULL,
  `date_comment` DATETIME NULL DEFAULT NULL,
  `idUser` BIGINT NOT NULL,
  PRIMARY KEY (`idComments`),
  CONSTRAINT `comments_has_user`
    FOREIGN KEY (`idComments`)
    REFERENCES `soundwave`.`users` (`idUser`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- Insertar registros en `notifications`
INSERT INTO `soundwave`.`notifications` (`comentary`, `published`) VALUES
('New update available for the app.', '2024-07-30 10:00:00');

INSERT INTO `soundwave`.`notifications` (`comentary`, `published`) VALUES
('System maintenance scheduled for tonight.', '2024-07-30 11:00:00');

INSERT INTO `soundwave`.`notifications` (`comentary`, `published`) VALUES
('New feature added to the platform.', '2024-07-30 12:00:00');

INSERT INTO `soundwave`.`notifications` (`comentary`, `published`) VALUES
('Reminder: Profile updates needed.', '2024-07-30 13:00:00');

INSERT INTO `soundwave`.`notifications` (`comentary`, `published`) VALUES
('Weekly summary of your activities.', '2024-07-30 14:00:00');


-- Insertar registros en `users`
INSERT INTO `soundwave`.`users` (`username`, `name`, `lastname`, `email`, `created_at`, `password`) VALUES
('john_doe', 'John', 'Doe', 'john.doe@example.com', '2024-07-01', 'hashed_password_1');

INSERT INTO `soundwave`.`users` (`username`, `name`, `lastname`, `email`, `created_at`, `password`) VALUES
('jane_smith', 'Jane', 'Smith', 'jane.smith@example.com', '2024-07-05', 'hashed_password_2');

INSERT INTO `soundwave`.`users` (`username`, `name`, `lastname`, `email`, `created_at`, `password`) VALUES
('alice_johnson', 'Alice', 'Johnson', 'alice.johnson@example.com', '2024-07-10', 'hashed_password_3');

INSERT INTO `soundwave`.`users` (`username`, `name`, `lastname`, `email`, `created_at`, `password`) VALUES
('bob_brown', 'Bob', 'Brown', 'bob.brown@example.com', '2024-07-15', 'hashed_password_4');

INSERT INTO `soundwave`.`users` (`username`, `name`, `lastname`, `email`, `created_at`, `password`) VALUES
('charlie_davis', 'Charlie', 'Davis', 'charlie.davis@example.com', '2024-07-20', 'hashed_password_5');


-- Insertar registros en `comments`
INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `idUser`) VALUES
('This is a great post!', '2024-07-30 09:00:00', 1);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `idUser`) VALUES
('I agree with the points made.', '2024-07-30 10:00:00', 2);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `idUser`) VALUES
('Interesting perspective!', '2024-07-30 11:00:00', 3);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `idUser`) VALUES
('I have a different opinion on this.', '2024-07-30 12:00:00', 4);

INSERT INTO `soundwave`.`comments` (`content`, `date_comment`, `idUser`) VALUES
('Can you provide more details?', '2024-07-30 13:00:00', 5);


-- Insertar registros en `friends`
INSERT INTO `soundwave`.`friends` (`status`) VALUES
(1);

INSERT INTO `soundwave`.`friends` (`status`) VALUES
(1);

INSERT INTO `soundwave`.`friends` (`status`) VALUES
(0);

INSERT INTO `soundwave`.`friends` (`status`) VALUES
(1);

INSERT INTO `soundwave`.`friends` (`status`) VALUES
(0);

-- Insertar registros en `posts`
INSERT INTO `soundwave`.`posts` (`description`, `date_post`, `idUser`) VALUES
('Exciting news about the upcoming feature!', '2024-07-30 09:00:00', 1);

INSERT INTO `soundwave`.`posts` (`description`, `date_post`, `idUser`) VALUES
('Check out our latest blog post on user experience.', '2024-07-30 10:00:00', 2);

INSERT INTO `soundwave`.`posts` (`description`, `date_post`, `idUser`) VALUES
('We have updated our privacy policy.', '2024-07-30 11:00:00', 3);

INSERT INTO `soundwave`.`posts` (`description`, `date_post`, `idUser`) VALUES
('Here are some tips for better productivity.', '2024-07-30 12:00:00', 4);

INSERT INTO `soundwave`.`posts` (`description`, `date_post`, `idUser`) VALUES
('Join us for a webinar on new trends in tech.', '2024-07-30 13:00:00', 5);

-- Insertar registros en `profile`
INSERT INTO `soundwave`.`profile` (`user_img`, `birthday_date`, `location`, `gender`, `idUser`) VALUES
('john_doe_image.jpg', '1990-05-15 00:00:00', 'New York', 'Male', 1);

INSERT INTO `soundwave`.`profile` (`user_img`, `birthday_date`, `location`, `gender`, `idUser`) VALUES
('jane_smith_image.jpg', '1992-08-22 00:00:00', 'Los Angeles', 'Female', 2);

INSERT INTO `soundwave`.`profile` (`user_img`, `birthday_date`, `location`, `gender`, `idUser`) VALUES
('alice_johnson_image.jpg', '1989-12-01 00:00:00', 'Chicago', 'Female', 3);

INSERT INTO `soundwave`.`profile` (`user_img`, `birthday_date`, `location`, `gender`, `idUser`) VALUES
('bob_brown_image.jpg', '1991-07-11 00:00:00', 'Houston', 'Male', 4);

INSERT INTO `soundwave`.`profile` (`user_img`, `birthday_date`, `location`, `gender`, `idUser`) VALUES
('charlie_davis_image.jpg', '1993-03-27 00:00:00', 'San Francisco', 'Male', 5);

SELECT * FROM users;
SELECT * FROM profile;
SELECT * FROM posts;