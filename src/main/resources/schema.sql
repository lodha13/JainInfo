CREATE TABLE IF NOT EXISTS marasa
(
    id int(4) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    location varchar(100) DEFAULT NULL,
    contactPersonName varchar(100) DEFAULT NULL,
    contactPersonPhone varchar(10) DEFAULT NULL,
    PRIMARY KEY (id)
);