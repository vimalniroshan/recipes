DROP TABLE IF EXISTS RECIPE;

CREATE TABLE RECIPE (
   id INT NOT NULL AUTO_INCREMENT,
   NAME VARCHAR(100) DEFAULT NULL,
   description  VARCHAR(200) DEFAULT NULL,
   PRIMARY KEY (id)
);