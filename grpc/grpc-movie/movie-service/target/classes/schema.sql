CREATE TABLE IF NOT EXISTS `movie` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
     `title` VARCHAR(50) NOT NULL,
     `rel_year`        INTEGER  NOT NULL,
          `rating`        DOUBLE  NOT NULL,
               `genre`        VARCHAR(50)  NOT NULL

);