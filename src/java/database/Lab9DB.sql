DROP DATABASE if exists Lab9DB;
CREATE DATABASE Lab9DB;

USE Lab9DB;

CREATE TABLE user (
    username VARCHAR(20) NOT NULL, 
    password VARCHAR(20) NOT NULL, 
    firstname VARCHAR(20), 
    lastname VARCHAR(20), 
    email VARCHAR(40), 
    CONSTRAINT PK_username PRIMARY KEY (username));

INSERT INTO user(username, password)
VALUES("admin","password");
COMMIT;
