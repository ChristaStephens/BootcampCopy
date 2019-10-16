CREATE TABLE `food_items` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cat` varchar(40) DEFAULT NULL,
  `short_description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

INSERT INTO `food_items` VALUES (1,'Vegetable','Orange root vegetable.','Carrot'),(2,'Fruit','Sweet and crunchy.','Apples'),(3,'Vegetable','Small, round, and green.','Peas'),(4,'Prepared','Fluffy baked good with icing.','Cake'),(5,'Fruit','Sour citrus.','Lemon'),(6,'Prepared','Versatile staple.','Sandwich'),(7,'Fruit','Small, round, and blue.','Blueberries'),(8,'Fruit','Fuzzy, juicy, and sweet.','Peach');

CREATE TABLE `player` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `attack_strength` int(11) DEFAULT NULL,
  `health` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

INSERT INTO `player` VALUES (1,4,10,'Dab'),(2,4,10,'Zip'),(3,3,10,'Kit'),(4,5,10,'Marvel'),(5,3,10,'Ping');

CREATE TABLE `foods2` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(40) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `item_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

INSERT INTO `foods2` VALUES (1,'Breakfast','Golden crisp grid.','Waffle'),(2,'Breakfast','Migically delicious!','Lucky Charms'),(3,'Dessert','Cold, creamy, and sweet.','Ice Cream');