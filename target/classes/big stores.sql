use heroku_c32affd8800ea8e;

DROP TABLE IF EXISTS `products`;
DROP TABLE IF EXISTS `cash_register`;
DROP TABLE IF EXISTS `cashiers`;
DROP TABLE IF EXISTS `sales`;

CREATE TABLE `products` (
  `id` int NOT NULL auto_increment,
  `name` nvarchar(100) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `cash_register` (
  `id` int NOT NULL auto_increment,
  `floor` int NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `cashiers` (
  `id` int NOT NULL auto_increment,
  `name_surname` nvarchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `sales` (
  `id` int NOT NULL auto_increment,
  `id_product` int NOT NULL,
  `id_cash_register` int NOT NULL,
  `id_cashier` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `supplies_ibfk_1` FOREIGN KEY (`id_product`) REFERENCES `products` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `supplies_ibfk_2` FOREIGN KEY (`id_cash_register`) REFERENCES `cash_register` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `supplies_ibfk_3` FOREIGN KEY (`id_cashier`) REFERENCES `cashiers` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

INSERT INTO `products` (`name`,`price`) VALUES ('Leche',0.6) , ('Huevos',1.0) , ('Azucar',0.5);
INSERT INTO `cash_register` (`floor`) VALUES (1) , (2) , (3);
INSERT INTO `cashiers` (`name_surname`) VALUES ('Aitor Menta'), ('Orden Ador'), ('Estallo Viendo');
INSERT INTO `sales` (`id_product`, `id_cash_register`,`id_cashier`) VALUES ('1','1','1') , ('11','11','11') , ('21','21','21');

commit;