DROP TABLE IF EXISTS catalog;

CREATE TABLE catalog(
    sku VARCHAR(32) NOT NULL PRIMARY KEY ,
    title VARCHAR(256) NOT NULL,
    price DECIMAL NOT NULL);

insert into catalog values ('abcr', 'All Butter Croissant', 0.75);
insert into catalog values ('ccr', 'Chocolate Croissant', 0.95);
insert into catalog values ('b', 'Fresh Baguette', 1.60);
insert into catalog values ('rv', 'Red Velvet', 3.95);
insert into catalog values ('vs', 'Victoria Sponge', 5.45);
insert into catalog values ('cc', 'Carrot Cake', 3.45);

