
create table if not exists PERSONS
(
    name VARCHAR(50),
    surname VARCHAR(50),
    age INT,
    phone_number VARCHAR(25),
    city_of_living VARCHAR(100),
    primary key(name, surname, age)
    );