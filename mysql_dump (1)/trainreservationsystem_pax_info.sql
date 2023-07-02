-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: trainreservationsystem
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pax_info`
--

DROP TABLE IF EXISTS `pax_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pax_info` (
  `Passenger_id` int NOT NULL AUTO_INCREMENT,
  `PAX_name` varchar(45) NOT NULL,
  `PAX_age` int DEFAULT NULL,
  `PAX_sex` varchar(45) DEFAULT NULL,
  `fare` double DEFAULT NULL,
  `Seat_No` varchar(45) DEFAULT NULL,
  `PNR` bigint DEFAULT NULL,
  PRIMARY KEY (`Passenger_id`),
  KEY `PNR_idx` (`PNR`),
  CONSTRAINT `PNR` FOREIGN KEY (`PNR`) REFERENCES `ticket_reservation` (`PNR_no`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pax_info`
--

LOCK TABLES `pax_info` WRITE;
/*!40000 ALTER TABLE `pax_info` DISABLE KEYS */;
INSERT INTO `pax_info` VALUES (1,'Umaang',22,'M',300,'1A',4),(2,'Prankur',16,'M',256.78,'34B',NULL),(3,'Sinola',14,'F',34567.89,'14A',5),(4,'Mohan',13,'M',234,'1A',NULL);
/*!40000 ALTER TABLE `pax_info` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-03  0:03:53
