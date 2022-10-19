CREATE TABLE IF NOT EXISTS `movie` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
     `title` VARCHAR(50) NOT NULL,
     `rel_year`        INTEGER  NOT NULL,
          `rating`        DOUBLE  NOT NULL,
               `genre`        VARCHAR(50)  NOT NULL,`image_url`        VARCHAR(245)  NOT NULL,`summary`        VARCHAR(245)  NOT NULL


);
CREATE TABLE IF NOT EXISTS `favorite` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
     `userId` INTEGER NOT NULL,
     `movieId`        INTEGER  NOT NULL,FOREIGN KEY (movieId) REFERENCES movie(id)


);
CREATE TABLE IF NOT EXISTS `comments` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
     `userId` INTEGER NOT NULL,`message` VARCHAR(50) NOT NULL,`date` VARCHAR(245) NOT NULL,
     `movieId`        INTEGER  NOT NULL,FOREIGN KEY (movieId) REFERENCES movie(id)

);