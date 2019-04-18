CREATE DATABASE  IF NOT EXISTS `SpottrUserDB` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `SpottrUserDB`;
-- MySQL dump 10.13  Distrib 5.6.13, for osx10.6 (i386)
--
-- Host: 127.0.0.1    Database: web_student_tracker
-- ------------------------------------------------------
-- Server version	5.6.16

-- /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
-- /*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
-- /*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
-- /*!40101 SET NAMES utf8 */;
-- /*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
-- /*!40103 SET TIME_ZONE='+00:00' */;
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `SpottrUserDBData`;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SpottrUserDBData` (
  `spottr_id` int(11) NOT NULL AUTO_INCREMENT,
  `spottr_email` varchar(45) DEFAULT NULL,
  `spottr_password` varchar(45) DEFAULT NULL,
  `spottr_bio` varchar(45) DEFAULT NULL,
  `spottr_gender` varchar(45) DEFAULT NULL,
  `spottr_preferredGender` varchar(45) DEFAULT NULL,
  `spottr_location` varchar(45) DEFAULT NULL,
  `spottr_age` int(11) DEFAULT NULL,l
  
  PRIMARY KEY (`spottr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
-- /*!40101 SET character_set_client = @saved_cs_client */;


--
-- Dumping data for table `student`
--

LOCK TABLES `SpottrUserDBData` WRITE;
INSERT INTO `SpottrUserDBData` VALUES (1,'williamyang0903@hotmail.com','ilikefish123', 'Wholesome boy that your parents approve', 'Male', 'Female', 'Los Angeles', 18);


UNLOCK TABLES;
-- /*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

-- /*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
-- /*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
-- /*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
-- /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
-- /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
-- /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- /*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-02-13 21:50:59
