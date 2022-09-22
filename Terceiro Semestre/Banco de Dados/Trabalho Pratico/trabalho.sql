-- MySQL dump 10.13  Distrib 8.0.29, for macos12 (x86_64)
--
-- Host: localhost    Database: trabalho
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
-- Table structure for table `tbElevadores`
--

DROP TABLE IF EXISTS `tbElevadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbElevadores` (
  `idtbElevadores` int NOT NULL,
  `capacidade` int DEFAULT NULL,
  `localizacao` varchar(20) NOT NULL,
  `estado` varchar(20) NOT NULL,
  PRIMARY KEY (`idtbElevadores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbElevadores`
--

LOCK TABLES `tbElevadores` WRITE;
/*!40000 ALTER TABLE `tbElevadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbElevadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbEstudante`
--

DROP TABLE IF EXISTS `tbEstudante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbEstudante` (
  `idtbEstudante` int NOT NULL,
  `instituicao_ensino` varchar(50) NOT NULL,
  `registro_academico` varchar(20) NOT NULL,
  `idtbVisitantes` int NOT NULL,
  PRIMARY KEY (`idtbEstudante`),
  KEY `fk_idtbVisitante` (`idtbVisitantes`),
  CONSTRAINT `fk_idtbVisitante` FOREIGN KEY (`idtbVisitantes`) REFERENCES `tbVisitantes` (`idtbVisitantes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbEstudante`
--

LOCK TABLES `tbEstudante` WRITE;
/*!40000 ALTER TABLE `tbEstudante` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbEstudante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbIdiomas`
--

DROP TABLE IF EXISTS `tbIdiomas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbIdiomas` (
  `idtbIdiomas` int NOT NULL,
  `idioma` varchar(45) NOT NULL,
  PRIMARY KEY (`idtbIdiomas`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbIdiomas`
--

LOCK TABLES `tbIdiomas` WRITE;
/*!40000 ALTER TABLE `tbIdiomas` DISABLE KEYS */;
INSERT INTO `tbIdiomas` VALUES (1,'Português'),(2,'Inglês'),(3,'Espanhol'),(4,'Francês'),(5,'Coreano'),(6,'Chinês'),(7,'Italiano');
/*!40000 ALTER TABLE `tbIdiomas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbLindeiros`
--

DROP TABLE IF EXISTS `tbLindeiros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbLindeiros` (
  `idtbLindeiros` int NOT NULL,
  `municipio_lindeiro` varchar(50) NOT NULL,
  `comprovante_residencia` varchar(100) NOT NULL,
  `idtbVisitantes` int NOT NULL,
  PRIMARY KEY (`idtbLindeiros`),
  KEY `fk_lindeiros_idtbVisitante` (`idtbVisitantes`),
  CONSTRAINT `fk_lindeiros_idtbVisitante` FOREIGN KEY (`idtbVisitantes`) REFERENCES `tbVisitantes` (`idtbVisitantes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbLindeiros`
--

LOCK TABLES `tbLindeiros` WRITE;
/*!40000 ALTER TABLE `tbLindeiros` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbLindeiros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbMonitores`
--

DROP TABLE IF EXISTS `tbMonitores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbMonitores` (
  `idtbMonitores` int NOT NULL,
  `nome_monitor` varchar(100) NOT NULL,
  `idade_monitor` int NOT NULL,
  `documento_monitor` varchar(20) NOT NULL,
  `salario_monitor` decimal(5,2) NOT NULL,
  `cnh_monitor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idtbMonitores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbMonitores`
--

LOCK TABLES `tbMonitores` WRITE;
/*!40000 ALTER TABLE `tbMonitores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbMonitores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbMonitores_has_tbIdiomas`
--

DROP TABLE IF EXISTS `tbMonitores_has_tbIdiomas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbMonitores_has_tbIdiomas` (
  `idtbMonitores` int NOT NULL,
  `idtbIdiomas` int NOT NULL,
  KEY `fk_idiomasMonitores_idtbMonitores` (`idtbMonitores`),
  KEY `fk_idiomasMonitores_idtbIdimos` (`idtbIdiomas`),
  CONSTRAINT `fk_idiomasMonitores_idtbIdimos` FOREIGN KEY (`idtbIdiomas`) REFERENCES `tbIdiomas` (`idtbIdiomas`),
  CONSTRAINT `fk_idiomasMonitores_idtbMonitores` FOREIGN KEY (`idtbMonitores`) REFERENCES `tbMonitores` (`idtbMonitores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbMonitores_has_tbIdiomas`
--

LOCK TABLES `tbMonitores_has_tbIdiomas` WRITE;
/*!40000 ALTER TABLE `tbMonitores_has_tbIdiomas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbMonitores_has_tbIdiomas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbMotorista`
--

DROP TABLE IF EXISTS `tbMotorista`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbMotorista` (
  `idtbMotorista` int NOT NULL,
  `nome_motorista` varchar(100) NOT NULL,
  `cnh_motorista` varchar(20) NOT NULL,
  `idade_motorista` int NOT NULL,
  `salario_motorista` decimal(5,2) NOT NULL,
  `ambulancia` char(1) DEFAULT NULL,
  PRIMARY KEY (`idtbMotorista`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbMotorista`
--

LOCK TABLES `tbMotorista` WRITE;
/*!40000 ALTER TABLE `tbMotorista` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbMotorista` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbPasseio`
--

DROP TABLE IF EXISTS `tbPasseio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbPasseio` (
  `idtbPasseio` int NOT NULL,
  `rota_passeio` varchar(10) NOT NULL,
  `tipo_passeio` varchar(10) NOT NULL,
  `pessoas_passeio` int NOT NULL,
  `dataHora_passeio` datetime NOT NULL,
  `idtbMonitores` int NOT NULL,
  `idtbMotorista` int NOT NULL,
  `idtbVeiculo` int NOT NULL,
  `idtbElevadores` int NOT NULL,
  PRIMARY KEY (`idtbPasseio`),
  KEY `fk_passeio_idtbMonitores` (`idtbMonitores`),
  KEY `fk_passeio_idtbMotorista` (`idtbMotorista`),
  KEY `fk_passeio_idtbVeiculo` (`idtbVeiculo`),
  KEY `fk_passeio_idtbElevadores` (`idtbElevadores`),
  CONSTRAINT `fk_passeio_idtbElevadores` FOREIGN KEY (`idtbElevadores`) REFERENCES `tbElevadores` (`idtbElevadores`),
  CONSTRAINT `fk_passeio_idtbMonitores` FOREIGN KEY (`idtbMonitores`) REFERENCES `tbMonitores` (`idtbMonitores`),
  CONSTRAINT `fk_passeio_idtbMotorista` FOREIGN KEY (`idtbMotorista`) REFERENCES `tbMotorista` (`idtbMotorista`),
  CONSTRAINT `fk_passeio_idtbVeiculo` FOREIGN KEY (`idtbVeiculo`) REFERENCES `tbVeiculo` (`idtbVeiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbPasseio`
--

LOCK TABLES `tbPasseio` WRITE;
/*!40000 ALTER TABLE `tbPasseio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbPasseio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbTipoVeiculo`
--

DROP TABLE IF EXISTS `tbTipoVeiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbTipoVeiculo` (
  `idtbTipoVeiculo` int NOT NULL,
  `modelo_veiculo` varchar(50) NOT NULL,
  `fabricante_veiculo` varchar(30) NOT NULL,
  PRIMARY KEY (`idtbTipoVeiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbTipoVeiculo`
--

LOCK TABLES `tbTipoVeiculo` WRITE;
/*!40000 ALTER TABLE `tbTipoVeiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbTipoVeiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbVeiculo`
--

DROP TABLE IF EXISTS `tbVeiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbVeiculo` (
  `idtbVeiculo` int NOT NULL,
  `placa_veiculo` varchar(10) DEFAULT NULL,
  `capacidade_veiculo` int NOT NULL,
  `estado_veiculo` varchar(20) NOT NULL,
  `idtbTipoVeiculo` int NOT NULL,
  PRIMARY KEY (`idtbVeiculo`),
  KEY `fk_idtbTipoVeiculo` (`idtbTipoVeiculo`),
  CONSTRAINT `fk_idtbTipoVeiculo` FOREIGN KEY (`idtbTipoVeiculo`) REFERENCES `tbTipoVeiculo` (`idtbTipoVeiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbVeiculo`
--

LOCK TABLES `tbVeiculo` WRITE;
/*!40000 ALTER TABLE `tbVeiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbVeiculo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbVendaPasseio`
--

DROP TABLE IF EXISTS `tbVendaPasseio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbVendaPasseio` (
  `idtbVendaPasseio` int NOT NULL,
  `valor_passeio` decimal(4,2) NOT NULL,
  `idtbVendedores` int NOT NULL,
  `idtbPasseio` int NOT NULL,
  PRIMARY KEY (`idtbVendaPasseio`),
  KEY `fk_venda_idtbVendedores` (`idtbVendedores`),
  KEY `fk_venda_idtbPasseio` (`idtbPasseio`),
  CONSTRAINT `fk_venda_idtbPasseio` FOREIGN KEY (`idtbPasseio`) REFERENCES `tbPasseio` (`idtbPasseio`),
  CONSTRAINT `fk_venda_idtbVendedores` FOREIGN KEY (`idtbVendedores`) REFERENCES `tbVendedores` (`idtbVendedores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbVendaPasseio`
--

LOCK TABLES `tbVendaPasseio` WRITE;
/*!40000 ALTER TABLE `tbVendaPasseio` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbVendaPasseio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbVendedores`
--

DROP TABLE IF EXISTS `tbVendedores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbVendedores` (
  `idtbVendedores` int NOT NULL,
  `nome_vendedor` varchar(100) NOT NULL,
  `idade_vendedor` int NOT NULL,
  `salario_vendedor` decimal(5,2) NOT NULL,
  `documento_vendedor` varchar(20) NOT NULL,
  PRIMARY KEY (`idtbVendedores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbVendedores`
--

LOCK TABLES `tbVendedores` WRITE;
/*!40000 ALTER TABLE `tbVendedores` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbVendedores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbVendedores_has_tbIdiomas`
--

DROP TABLE IF EXISTS `tbVendedores_has_tbIdiomas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbVendedores_has_tbIdiomas` (
  `idtbVendedores` int NOT NULL,
  `idtbIdiomas` int NOT NULL,
  KEY `fk_idiomasVendedores_idtbVendedores` (`idtbVendedores`),
  KEY `fk_idiomasVendedores_idtbIdiomas` (`idtbIdiomas`),
  CONSTRAINT `fk_idiomasVendedores_idtbIdiomas` FOREIGN KEY (`idtbIdiomas`) REFERENCES `tbIdiomas` (`idtbIdiomas`),
  CONSTRAINT `fk_idiomasVendedores_idtbVendedores` FOREIGN KEY (`idtbVendedores`) REFERENCES `tbVendedores` (`idtbVendedores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbVendedores_has_tbIdiomas`
--

LOCK TABLES `tbVendedores_has_tbIdiomas` WRITE;
/*!40000 ALTER TABLE `tbVendedores_has_tbIdiomas` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbVendedores_has_tbIdiomas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbVisitantes`
--

DROP TABLE IF EXISTS `tbVisitantes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbVisitantes` (
  `idtbVisitantes` int NOT NULL,
  `nome_visitante` varchar(100) NOT NULL,
  `idade_visitante` int NOT NULL,
  `documento_visitante` varchar(20) NOT NULL,
  `idtbVendaPasseio` int DEFAULT NULL,
  PRIMARY KEY (`idtbVisitantes`),
  KEY `fk_idtbVendaPasseio` (`idtbVendaPasseio`),
  CONSTRAINT `fk_idtbVendaPasseio` FOREIGN KEY (`idtbVendaPasseio`) REFERENCES `tbVendaPasseio` (`idtbVendaPasseio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbVisitantes`
--

LOCK TABLES `tbVisitantes` WRITE;
/*!40000 ALTER TABLE `tbVisitantes` DISABLE KEYS */;
INSERT INTO `tbVisitantes` VALUES (1,'Adriana Andrade Baptista da Silva',34,'995.657.080-05',NULL),(2,'Gustavo Siqueira Simoes Viana',80,'616.041.530-16',NULL),(3,'Sávio Pimenta Paulo Ferreira',86,'338.322.930-00',NULL),(4,'Sergio Espindola Pacheco Bochimpani',15,'378.253.810-25',NULL),(5,'Noah Lucio Dinis Pinto',16,'533.409.460-19',NULL),(6,'Almir Moraes Xavier Peres',30,'319.757.430-32',NULL),(7,'Hebert Furtado Livramento Carminatti',62,'371.281.000-83',NULL),(8,'Rosimere Debossam Mattos Lima',21,'200.781.440-43',NULL),(9,'Gian Mello Sá Veiga',103,'874.065.340-43',NULL),(10,'Isaac Esteves Heizelmann Cunha',62,'743.011.460-16',NULL),(11,'Kaique Machado Ximenes Richa',12,'125.161.700-09',NULL),(12,'Emmanuel Avilla Montilla Vilela',109,'548.668.290-52',NULL),(13,'Lurdes Inácio Pessoa Louzano',64,'108.055.340-16',NULL),(14,'Igor Augusto Coelho Alfradique',13,'604.375.480-07',NULL),(15,'Oseias Magalhães Barsosa Cormack',22,'597.579.520-60',NULL),(16,'Lorenna Santomauro Garcia Goulart',19,'719.888.680-92',NULL),(17,'Renato Macedo Barboza Bravo',40,'313.438.340-31',NULL),(18,'Ricardo Luis Amancio Cardoso Vilela',30,'601.046.230-47',NULL),(19,'Breno Limeira Macedo Robadey',56,'543.743.080-91',NULL),(20,'Everaldo Barthon Alfradique Frotté',64,'488.059.700-77',NULL),(21,'Milena Grilo Avilla Muchão',69,'598.645.250-00',NULL),(22,'Gutemberg Machado Folly Bochimpani',49,'481.056.590-42',NULL),(23,'Alice Goulart Heizelmann Venancio',28,'490.122.550-23',NULL),(24,'Sidney Stutz Couto Lana',71,'846.539.000-27',NULL),(25,'Caio Meyer Diovani Sarmanto',59,'925.520.900-01',NULL),(26,'Ana Carolina Mota Reis Cocelo',40,'037.739.310-00',NULL);
/*!40000 ALTER TABLE `tbVisitantes` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-24 21:37:44
