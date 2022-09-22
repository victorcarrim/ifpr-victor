-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: localhost    Database: atividade02
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbAtor`
--

DROP TABLE IF EXISTS `tbAtor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbAtor` (
  `codigo_ator` int NOT NULL,
  `nome_ator` varchar(20) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  `cidade_ator` varchar(20) DEFAULT NULL,
  `salario_ator` float DEFAULT NULL,
  `sexo_ator` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`codigo_ator`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbAtor`
--

LOCK TABLES `tbAtor` WRITE;
/*!40000 ALTER TABLE `tbAtor` DISABLE KEYS */;
INSERT INTO `tbAtor` VALUES (1,'José da Cruz',23,'Pinhamonhangaba',3200,'M'),(2,'Maria Aperecia',27,'São Paulo',7000,'F'),(3,'Victor Poshe',35,'Campo Grande',4490,'M'),(4,'Rosana Otana',31,'Santa Terezinha',2100,'M'),(5,'Otaviano Costa',36,'Campinas',5200,'F'),(6,'Ana Maria',19,'Marvel',1900,'F'),(7,'Fernando Souza',14,'Wakanda',1400,'M');
/*!40000 ALTER TABLE `tbAtor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbCapitulos`
--

DROP TABLE IF EXISTS `tbCapitulos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbCapitulos` (
  `codigo_capitulo` int NOT NULL,
  `nome_capitulo` varchar(50) DEFAULT NULL,
  `data_exibicao_capitulo` date DEFAULT NULL,
  `codigo_novela` int NOT NULL,
  PRIMARY KEY (`codigo_capitulo`),
  KEY `fk_tbCapitulos` (`codigo_novela`),
  CONSTRAINT `fk_tbCapitulos` FOREIGN KEY (`codigo_novela`) REFERENCES `tbNovela` (`codigo_novela`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbCapitulos`
--

LOCK TABLES `tbCapitulos` WRITE;
/*!40000 ALTER TABLE `tbCapitulos` DISABLE KEYS */;
INSERT INTO `tbCapitulos` VALUES (1,'Um dia no pantanal','2022-03-27',1),(2,'Festa do bolo','2018-01-22',2),(3,'Guerra de trincheira','2019-12-25',3),(4,'Mal bem querer','2020-02-04',2),(5,'Dias de gloria','2022-07-04',1),(6,'Joana','2018-03-01',3),(7,'Queimada','2022-07-09',1),(8,'Laços','2017-12-30',2),(9,'Atomos','2018-04-15',3),(10,'Redes Abstratas','2019-09-13',2),(11,'Perdedores','2023-02-20',1),(12,'Marcos','2018-07-05',3),(13,NULL,NULL,5),(14,NULL,NULL,5),(15,NULL,NULL,5),(16,NULL,NULL,5),(17,NULL,NULL,5),(18,NULL,NULL,5),(19,NULL,NULL,5),(20,NULL,NULL,5),(21,NULL,NULL,5),(22,NULL,NULL,5),(23,NULL,NULL,5),(24,NULL,NULL,5),(25,NULL,NULL,5),(26,NULL,NULL,5),(27,NULL,NULL,5),(28,NULL,NULL,5),(29,NULL,NULL,5),(30,NULL,NULL,5),(31,NULL,NULL,5),(32,NULL,NULL,5),(33,NULL,NULL,5),(34,NULL,NULL,5),(35,NULL,NULL,5),(36,NULL,NULL,5),(37,NULL,NULL,5),(38,NULL,NULL,5),(39,NULL,NULL,5),(40,NULL,NULL,5),(41,NULL,NULL,5),(42,NULL,NULL,5),(43,NULL,NULL,5),(44,NULL,NULL,5),(45,NULL,NULL,5),(46,NULL,NULL,5),(47,NULL,NULL,5),(48,NULL,NULL,5),(49,NULL,NULL,5),(50,NULL,NULL,5),(51,NULL,NULL,5),(52,NULL,NULL,5),(53,NULL,NULL,5);
/*!40000 ALTER TABLE `tbCapitulos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbNovela`
--

DROP TABLE IF EXISTS `tbNovela`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbNovela` (
  `codigo_novela` int NOT NULL,
  `nome_novela` varchar(30) DEFAULT NULL,
  `data_primeiro_capitulo` date DEFAULT NULL,
  `data_ultimo_capitulo` date DEFAULT NULL,
  `horario_exibicao` time DEFAULT NULL,
  PRIMARY KEY (`codigo_novela`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbNovela`
--

LOCK TABLES `tbNovela` WRITE;
/*!40000 ALTER TABLE `tbNovela` DISABLE KEYS */;
INSERT INTO `tbNovela` VALUES (1,'Pantanal','2022-03-20','2023-02-12','21:00:00'),(2,'Amor a vida','2019-07-02','2020-04-27','19:00:00'),(3,'Cheias de Graça','2017-11-20','2018-08-03','18:00:00'),(4,'Misterios de uma vida','2020-07-22','2021-02-04','00:00:00'),(5,'Chiquititas',NULL,NULL,NULL),(6,'Amor a vida',NULL,NULL,NULL),(7,NULL,NULL,NULL,NULL),(8,NULL,NULL,NULL,NULL),(9,NULL,NULL,NULL,NULL),(10,NULL,NULL,NULL,NULL),(11,NULL,NULL,NULL,NULL),(12,NULL,NULL,NULL,NULL),(13,NULL,NULL,NULL,NULL),(14,NULL,NULL,NULL,NULL),(15,NULL,NULL,NULL,NULL),(16,NULL,NULL,NULL,NULL),(17,NULL,NULL,NULL,NULL),(18,NULL,NULL,NULL,NULL),(19,NULL,NULL,NULL,NULL),(20,NULL,NULL,NULL,NULL),(21,NULL,NULL,NULL,NULL),(22,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `tbNovela` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbNovelaPersonagem`
--

DROP TABLE IF EXISTS `tbNovelaPersonagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbNovelaPersonagem` (
  `codigo_novela` int NOT NULL,
  `codigo_personagem` int NOT NULL,
  KEY `fk_tbNovelaPersonagem1` (`codigo_novela`),
  KEY `fk_tbNovelaPersonagem2` (`codigo_personagem`),
  CONSTRAINT `fk_tbNovelaPersonagem1` FOREIGN KEY (`codigo_novela`) REFERENCES `tbNovela` (`codigo_novela`),
  CONSTRAINT `fk_tbNovelaPersonagem2` FOREIGN KEY (`codigo_personagem`) REFERENCES `tbPersonagem` (`codigo_personagem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbNovelaPersonagem`
--

LOCK TABLES `tbNovelaPersonagem` WRITE;
/*!40000 ALTER TABLE `tbNovelaPersonagem` DISABLE KEYS */;
INSERT INTO `tbNovelaPersonagem` VALUES (1,2),(3,2),(2,3),(1,4),(2,5),(5,6),(6,7),(7,3),(8,3),(9,3),(10,3),(11,3),(12,3),(13,3),(14,3),(15,3),(16,3),(17,3),(18,3),(19,3),(20,3),(21,3),(22,3),(14,2),(19,2),(15,2),(17,2),(14,4),(19,4),(15,4),(17,4),(12,4),(11,4),(9,4),(18,4),(21,4);
/*!40000 ALTER TABLE `tbNovelaPersonagem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbPersonagem`
--

DROP TABLE IF EXISTS `tbPersonagem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbPersonagem` (
  `codigo_personagem` int NOT NULL,
  `nome_personagem` varchar(50) DEFAULT NULL,
  `idade_personagem` int DEFAULT NULL,
  `situacao_financeira_personagem` varchar(20) DEFAULT NULL,
  `codigo_ator` int NOT NULL,
  PRIMARY KEY (`codigo_personagem`),
  KEY `fk_tbPersonagem` (`codigo_ator`),
  CONSTRAINT `fk_tbPersonagem` FOREIGN KEY (`codigo_ator`) REFERENCES `tbAtor` (`codigo_ator`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbPersonagem`
--

LOCK TABLES `tbPersonagem` WRITE;
/*!40000 ALTER TABLE `tbPersonagem` DISABLE KEYS */;
INSERT INTO `tbPersonagem` VALUES (1,'Antoninho',35,'Bilionario',3),(2,'Carla Maria',25,'Classe Média',2),(3,'Luiz Inacio',19,'Rico',1),(4,'Josezinho',31,'Pobre',4),(5,'Silva',32,'Miseravel',5),(6,'Cadanguinho',18,'Chaves',7),(7,'Mario Antinin',12,'Patricio',7),(8,'Coringa',13,'A beira da loucura',6),(9,'João Paulo',22,'Rico',3),(10,'João Mauricio',27,'Pobre',3),(11,'João Carlos',31,'Rico',3),(12,'João Cesar',12,'Pobre',3),(13,'João Olavo',33,'Rico',3),(14,'Joao Otavio',19,'Pobre',3);
/*!40000 ALTER TABLE `tbPersonagem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-19 19:11:31
