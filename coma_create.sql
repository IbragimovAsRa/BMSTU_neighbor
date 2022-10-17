-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
        'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema jwtappdemo
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema jwtappdemo
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `jwtappdemo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
USE `jwtappdemo`;

-- -----------------------------------------------------
-- Table `jwtappdemo`.`roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jwtappdemo`.`roles`
(
    `id`      BIGINT       NOT NULL AUTO_INCREMENT,
    `name`    VARCHAR(100) NOT NULL,
    `created` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `status`  VARCHAR(25)  NOT NULL DEFAULT 'ACTIVE',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name` (`name` ASC) VISIBLE
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 3
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `jwtappdemo`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jwtappdemo`.`users`
(
    `id`         BIGINT       NOT NULL AUTO_INCREMENT,
    `username`   VARCHAR(100) NOT NULL,
    `email`      VARCHAR(255) NOT NULL,
    `first_name` VARCHAR(100) NOT NULL,
    `last_name`  VARCHAR(100) NOT NULL,
    `password`   VARCHAR(255) NOT NULL,
    `created`    TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `updated`    TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `status`     VARCHAR(25)  NOT NULL DEFAULT 'ACTIVE',
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email` (`email` ASC) VISIBLE,
    UNIQUE INDEX `username` (`username` ASC) VISIBLE
)
    ENGINE = InnoDB
    AUTO_INCREMENT = 2
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `jwtappdemo`.`user_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jwtappdemo`.`user_roles`
(
    `user_id` BIGINT NULL DEFAULT NULL,
    `role_id` BIGINT NULL DEFAULT NULL,
    INDEX `fk_user_roles_user` (`user_id` ASC) VISIBLE,
    INDEX `fk_user_roles_roles` (`role_id` ASC) VISIBLE,
    CONSTRAINT `fk_user_roles_roles`
        FOREIGN KEY (`role_id`)
            REFERENCES `jwtappdemo`.`roles` (`id`)
            ON DELETE CASCADE
            ON UPDATE RESTRICT,
    CONSTRAINT `fk_user_roles_user`
        FOREIGN KEY (`user_id`)
            REFERENCES `jwtappdemo`.`users` (`id`)
            ON DELETE CASCADE
            ON UPDATE RESTRICT
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `jwtappdemo`.`posts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jwtappdemo`.`posts`
(
    `id`          BIGINT       NOT NULL AUTO_INCREMENT,
    `users_id`    BIGINT       NOT NULL,
    `location`    VARCHAR(150) NOT NULL,
    `price`       INT          NOT NULL,
    `description` VARCHAR(250) NOT NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_posts_users1_idx` (`users_id` ASC) VISIBLE,
    CONSTRAINT `fk_posts_users1`
        FOREIGN KEY (`users_id`)
            REFERENCES `jwtappdemo`.`users` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `jwtappdemo`.`favourites`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `jwtappdemo`.`favourites`
(
    `users_id` BIGINT NOT NULL,
    `posts_id` BIGINT NOT NULL,
    PRIMARY KEY (`users_id`, `posts_id`),
    INDEX `fk_users_has_posts_posts1_idx` (`posts_id` ASC) VISIBLE,
    INDEX `fk_users_has_posts_users1_idx` (`users_id` ASC) VISIBLE,
    CONSTRAINT `fk_users_has_posts_users1`
        FOREIGN KEY (`users_id`)
            REFERENCES `jwtappdemo`.`users` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_users_has_posts_posts1`
        FOREIGN KEY (`posts_id`)
            REFERENCES `jwtappdemo`.`posts` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB
    DEFAULT CHARACTER SET = utf8mb4
    COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE = @OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;
