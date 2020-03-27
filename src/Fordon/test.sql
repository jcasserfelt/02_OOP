drop database if exists UPG1;
create database UPG1;
use UPG1;

create table town
(
    id   int not null auto_increment,
    name varchar(30),
    primary key (id)
);

create table customer
(
    id        int not null auto_increment,
    firstName varchar(30),
    lastName  varchar(30),
    townID    int,
    primary key (id),
    foreign key (townID) references town (id)
);

create table category
(
    id   int not null auto_increment primary key,
    name varchar(30)
);

create table purchase
(
    id         int not null auto_increment,
    name       varchar(30),
    date       DATE,
    customerID int,
    primary key (id),
    foreign key (customerID) references customer (id)
);

create table colour
(
    id   int not null auto_increment primary key,
    name varchar(20)
);

create table brand
(
    id   int not null auto_increment primary key,
    name varchar(20)
);

create table product
(
    id         int not null auto_increment primary key,
    price      int,
    size       int,
    brandID    int,
    colourID   int,
    purchaseID int
-- gör nått åt N:M Category
);

-- Försök till N:M mappningstabell
create table productCategory
(
    id         int not null auto_increment primary key,
    productID  int,
    categoryID int,
    foreign key (productID) references product (id),
    foreign key (categoryID) references category (id)
);

create table review
(
    id         int not null auto_increment,
    date       DATE,
    comment    varchar(140),
-- ratingID int, -- ska ev ändra type här till ENUM
    customerID int,
    productID  int,
    primary key (id),
-- foreign key(ratingID) references rating(id),
    foreign key (customerID) references customer (id),
    foreign key (productID) references product (id)
-- obs ingen foreign key till rating.
);

create table rating
(
    id       int not null auto_increment,
    name     varchar(30), -- detta ska nog vara ENUM, se vg-del
    reviewID int,
    primary key (id),
    foreign key (reviewID) references review (id)
);


-- 1:1 relationer
-- rating - review
-- produkt - review
-- customer - review

-- 1:N relationer
-- town - customer
-- customer - order
-- order - produkt
-- produkt - colour
-- produkt - brand

-- N:M relationer
-- product - category
