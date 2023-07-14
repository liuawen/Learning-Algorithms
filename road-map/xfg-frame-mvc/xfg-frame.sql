# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.10)
# Database: xfg-frame
# Generation Time: 2023-06-22 22:20:33 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` varchar(9) DEFAULT NULL COMMENT '用户ID',
  `user_nickname` varchar(32) DEFAULT NULL COMMENT '用户昵称',
  `user_head` varchar(16) DEFAULT NULL COMMENT '用户头像',
  `user_password` varchar(64) DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `user_id`, `user_nickname`, `user_head`, `user_password`, `create_time`, `update_time`)
VALUES
	(1,'184172133','小傅哥','01_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(2,'980765512','铁锤','02_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(3,'796542178','团团','03_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(4,'523088136','哈尼克兔','04_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(5,'123456001','比丘卡','05_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(6,'123456002','兰兰','06_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(7,'123456003','Alexa','07_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(8,'123456004','小白','08_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(9,'123456005','铃铛','09_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(10,'123456006','马小帅','10_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(11,'123456007','S.A.K','11_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),
	(12,'123456008','池鱼有点贤','12_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00');

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
