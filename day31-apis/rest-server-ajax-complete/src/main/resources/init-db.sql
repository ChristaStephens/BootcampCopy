CREATE TABLE `product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `taxable` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

insert into product (name, price, taxable)
  values ('LEGO Hogwarts', 99.99, 1);
insert into product (name, price, taxable)
  values ('Hatchimals Egg', 54.99, 1);
insert into product (name, price, taxable)
  values ('Bread', 2.89, 0);
insert into product (name, price, taxable)
  values ('Star Wars FurReal Co-Pilot Chewie', 129.99, 1);
insert into product (name, price, taxable)
  values ('The Kano ‘Harry Potter Wand’ Coding Kit', 99.99, 1);
insert into product (name, price, taxable)
  values ('The Jurassic Park Power Wheels Jeep Wrangler', 299.99, 1);
insert into product (name, price, taxable)
  values ('Gallon of Water', 0.89, 0);
insert into product (name, price, taxable)
  values ('Life-Size Jenga-Like Wooden Topple Blocks', 64.63, 1);
insert into product (name, price, taxable)
  values ('NECTAR Memory Foam Mattress', 328.30, 1);
insert into product (name, price, taxable)
  values ('Medium 2-Topping Pizza', 10.99, 1);
insert into product (name, price, taxable)
  values ('Wmeo Mini and Light Switch', 18.70, 1);
insert into product (name, price, taxable)
  values ('Starlink Battle for Atlas', 39.99, 1);
insert into product (name, price, taxable)
  values ('V-MODA Wireless Crossfade Headphones', 114.99, 1);
insert into product (name, price, taxable)
  values ('Solar System Floor Puzzle', 7.14, 1);
insert into product (name, price, taxable)
  values ('Halloween Bee Costume', 18.99, 1);