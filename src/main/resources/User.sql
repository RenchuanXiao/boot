CREATE TABLE user (
                      id int(20) NOT NULL AUTO_INCREMENT,
                      name varchar(30) DEFAULT NULL,
                      password varchar(30) DEFAULT NULL,
                      PRIMARY KEY (id)
);

help to create student table that contains username and age and email and the username will be the primary key and the age will be the foreign key and the email will be the unique key

-- Path: src\main\resources\Student.sql
CREATE TABLE student (
                        username varchar(30) NOT NULL,
                        age int(30) DEFAULT NULL,
                        email varchar(30) DEFAULT NULL,
                        PRIMARY KEY (username),
                        KEY age (age),
                        UNIQUE KEY email (email),
                        CONSTRAINT age FOREIGN KEY (age) REFERENCES student (age)
);

help to create student table that contains username and age and email and the username will be the primary key and the age will be the foreign key and the email will be the unique key

-- Path: src\main\resources\Student.sql
CREATE TABLE student (
                        username varchar(30) NOT NULL,
                        age int(30) DEFAULT NULL,
                        email varchar(30) DEFAULT NULL,
                        PRIMARY KEY (username),
                        KEY age (age),
                        UNIQUE KEY email (email),
                        CONSTRAINT age FOREIGN KEY (age) REFERENCES student (age)
);

help to create student table that contains username and age and email and the username will be the primary key and the age will be the foreign key and the email will be the unique key

-- Path: src\main\resources\Student.sql
CREATE TABLE student (
                        username varchar(30) NOT NULL,
                        age int(30) DEFAULT NULL,
                        email varchar(30) DEFAULT NULL,
                        PRIMARY KEY (username),
                        KEY age (age),
                        UNIQUE KEY email (email),
                        CONSTRAINT age FOREIGN KEY (age) REFERENCES student (age)
);

help to create student table that contains username and age and email and the username will be the primary key and the age will be the foreign key and the email will be the unique key

-- Path: src\main\resources\Student.sql
CREATE TABLE student (
                        username varchar(30) NOT NULL,
                        age int(30) DEFAULT NULL,
                        email varchar(30) DEFAULT NULL,
                        PRIMARY KEY (username),
                        KEY age (age),
                        UNIQUE KEY email (email),
                        CONSTRAINT age FOREIGN KEY (age) REFERENCES student (age)
);
