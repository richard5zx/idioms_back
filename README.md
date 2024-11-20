# idioms_back
## Motivation
Upon finishing a few example projects from my technical classes I decided to apply it to creating a fullstack application that I believe maybe useful to me. Hence, I decided to create an app to practice idioms.

## Introduction
This is the API for the idioms applications that will be used in conjunction with (idioms_front).\
Functions:
- Idioms for different langauge
- Daily idiom practice

Used in conjunction with idioms_front (https://github.com/richard5zx/idioms_front)

## Tech used
Frontend: Node.js, Vue.js, JavaScript, HTML, CSS

## Demo


## How to run the backend application
### Database setup
Open up MySQL\
Create a database in MySQL
```script
mysql> CREATE DATABASE idioim;
```

Check if database is created using
```script
mysql> show databases;
```

Enter todolist database
```script
mysql> USE idiom
```

Create idiom and idiom_example table in the idiom database
```script
mysql> CREATE TABLE idiom (
    idiom_id int NOT NULL AUTO_INCREMENT,
    idiom varchar(255) NOT NULL,
    definition varchar(255),
    language varchar(100),
    date_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (idiom_id)
);
```

Create idiom_example table in the idiom database
```script
mysql> CREATE TABLE idiom_example (
    example_id int NOT NULL AUTO_INCREMENT,
    idiom_id int,
    example varchar(255),
    date_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (example_id),
    FOREIGN KEY (idiom_id) REFERENCES idiom(idiom_id)
);
```

Check details of table
```script
mysql> DESCRIBE idiom;
mysql> DESCRIBE idiom_example;
```
