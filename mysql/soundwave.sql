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
  `user_id1` BIGINT,
  `user_id2` BIGINT,
  `status` ENUM('pending', 'accepted', 'rejected') DEFAULT 'pending',
  PRIMARY KEY (`user_id1`, `user_id2`),
  CONSTRAINT `fk_user1`
    FOREIGN KEY (`user_id1`)
    REFERENCES `soundwave`.`users` (`user_id`),
    CONSTRAINT `fk_user2`
    FOREIGN KEY (`user_id2`)
    REFERENCES `soundwave`.`users` (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`notifications`
-- -----------------------------------------------------

  
  CREATE TABLE IF NOT EXISTS `soundwave`.`notifications` (
    `notification_id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `user_id` BIGINT,
    type ENUM('comment', 'like', 'friend_request', 'message') NOT NULL,
    `message` TEXT NOT NULL,
    `is_read` BOOLEAN DEFAULT FALSE,
    `created_at` TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (`user_id`) 
    REFERENCES `soundwave`.`users`(`user_id`) ON DELETE CASCADE)

ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`posts` (
  `post_id` BIGINT NOT NULL AUTO_INCREMENT,
  `content` longtext NOT NULL,
  `url_spotify` VARCHAR (200),
  `creation_date` DATETIME NOT NULL,
  `user_id` BIGINT,
  PRIMARY KEY (`post_id`),
  CONSTRAINT `posts_has_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `soundwave`.`users` (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`profile` (
  `profile_id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR (40),
  `description` LONGTEXT,
  `user_img` VARCHAR(400) NULL DEFAULT NULL,
  `birthday_date` TIMESTAMP NULL DEFAULT NULL,
  `location` VARCHAR(150) NULL DEFAULT NULL,
  `user_id` BIGINT,
  PRIMARY KEY (`profile_id`),
  CONSTRAINT `profile_has_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `soundwave`.`users` (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`users` (
  `user_id` BIGINT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(100) NOT NULL,
  `phone` VARCHAR (10),
  `email` VARCHAR(100) NULL DEFAULT NULL,
  `created_at` DATE NULL DEFAULT NULL,
  `password` VARCHAR(150) NOT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `soundwave`.`comments`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `soundwave`.`comments` (
  `comments_id` BIGINT NOT NULL AUTO_INCREMENT,
  `content` longtext NOT NULL,
  `date_comment` DATETIME NULL DEFAULT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`comments_id`),
  CONSTRAINT `comments_has_user`
    FOREIGN KEY (`comments_id`)
    REFERENCES `soundwave`.`users` (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;

CREATE TABLE IF NOT EXISTS `soundwave`.`reactions` (
    `reaction_id` BIGINT AUTO_INCREMENT PRIMARY KEY,
    `post_id` BIGINT,
    `user_id` BIGINT,
    type ENUM('like') NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (`post_id`) REFERENCES `posts`(`post_id`) ON DELETE CASCADE,
    FOREIGN KEY (`user_id`) REFERENCES `users`(`user_id`) ON DELETE CASCADE
);



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;