-- MySQL dump 10.13  Distrib 8.0.28, for Linux (x86_64)
--
-- Host: localhost    Database: trabalho
-- ------------------------------------------------------
-- Server version	8.0.28-0ubuntu0.21.10.3

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
-- Table structure for table `tb_cirurgia`
--

DROP TABLE IF EXISTS `tb_cirurgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cirurgia` (
  `idtb_cirurgia` int NOT NULL,
  `data_cirurgia` date NOT NULL,
  `tb_pet_idtb_pet` int NOT NULL,
  `tb_veterinario_idtb_veterinario` int NOT NULL,
  `tb_nota_fiscal_idtb_nota_fiscal` int NOT NULL,
  `tb_tipo_cirurgia_idtb_tipo_cirurgia` int NOT NULL,
  PRIMARY KEY (`idtb_cirurgia`),
  KEY `fk_tb_pet_idtb_pet` (`tb_pet_idtb_pet`),
  KEY `fk_tb_veterinario_idtb_veterinario` (`tb_veterinario_idtb_veterinario`),
  KEY `fk_tb_nota_fiscal_idtb_nota_fiscal` (`tb_nota_fiscal_idtb_nota_fiscal`),
  KEY `fk_tb_tipo_cirurgia_idtb_tipo_cirurgia` (`tb_tipo_cirurgia_idtb_tipo_cirurgia`),
  CONSTRAINT `fk_tb_nota_fiscal_idtb_nota_fiscal` FOREIGN KEY (`tb_nota_fiscal_idtb_nota_fiscal`) REFERENCES `tb_nota_fiscal` (`idtb_nota_fiscal`),
  CONSTRAINT `fk_tb_pet_idtb_pet` FOREIGN KEY (`tb_pet_idtb_pet`) REFERENCES `tb_pet` (`idtb_pet`),
  CONSTRAINT `fk_tb_tipo_cirurgia_idtb_tipo_cirurgia` FOREIGN KEY (`tb_tipo_cirurgia_idtb_tipo_cirurgia`) REFERENCES `tb_tipo_cirurgia` (`idtb_tipo_cirurgia`),
  CONSTRAINT `fk_tb_veterinario_idtb_veterinario` FOREIGN KEY (`tb_veterinario_idtb_veterinario`) REFERENCES `tb_veterinario` (`idtb_veterinario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cirurgia`
--

LOCK TABLES `tb_cirurgia` WRITE;
/*!40000 ALTER TABLE `tb_cirurgia` DISABLE KEYS */;
INSERT INTO `tb_cirurgia` VALUES (1,'2021-12-05',1,2,1,3);
/*!40000 ALTER TABLE `tb_cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_cliente`
--

DROP TABLE IF EXISTS `tb_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_cliente` (
  `idtb_cliente` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `telefone` int NOT NULL,
  `email` varchar(100) NOT NULL,
  `endereco` varchar(100) NOT NULL,
  PRIMARY KEY (`idtb_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_cliente`
--

LOCK TABLES `tb_cliente` WRITE;
/*!40000 ALTER TABLE `tb_cliente` DISABLE KEYS */;
INSERT INTO `tb_cliente` VALUES (1,'Paulo Vieira',91499987,'paulo.vieira@gmail.com','rua nieral, 887'),(2,'Ana Flavia',87990876,'ana.flavia@gmail.com','rua patagoia, 876, América'),(3,'Souza Matos',98764554,'souza.matos@outlook.com','Avenida Padre SeiLa, 6567, Olondo');
/*!40000 ALTER TABLE `tb_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_consulta`
--

DROP TABLE IF EXISTS `tb_consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_consulta` (
  `idtb_consulta` int NOT NULL,
  `data_consulta` date NOT NULL,
  `tb_pet_idtb_pet` int NOT NULL,
  `tb_veterinario_idtb_veterinario` int NOT NULL,
  `tb_nota_fiscal_idtb_nota_fiscal` int NOT NULL,
  `tb_tipo_consulta_idtb_tipo_consulta` int NOT NULL,
  PRIMARY KEY (`idtb_consulta`),
  KEY `fk_tb_pet_idtb_pet2` (`tb_pet_idtb_pet`),
  KEY `fk_tb_veterinario_idb_veterinario2` (`tb_veterinario_idtb_veterinario`),
  KEY `fk_tb_nota_fiscal_idtb_nota_fiscal2` (`tb_nota_fiscal_idtb_nota_fiscal`),
  KEY `fk_tb_tipo_consulta_idtb_tipo_consulta` (`tb_tipo_consulta_idtb_tipo_consulta`),
  CONSTRAINT `fk_tb_nota_fiscal_idtb_nota_fiscal2` FOREIGN KEY (`tb_nota_fiscal_idtb_nota_fiscal`) REFERENCES `tb_nota_fiscal` (`idtb_nota_fiscal`),
  CONSTRAINT `fk_tb_pet_idtb_pet2` FOREIGN KEY (`tb_pet_idtb_pet`) REFERENCES `tb_pet` (`idtb_pet`),
  CONSTRAINT `fk_tb_tipo_consulta_idtb_tipo_consulta` FOREIGN KEY (`tb_tipo_consulta_idtb_tipo_consulta`) REFERENCES `tb_tipo_consulta` (`idtb_tipo_consulta`),
  CONSTRAINT `fk_tb_veterinario_idb_veterinario2` FOREIGN KEY (`tb_veterinario_idtb_veterinario`) REFERENCES `tb_veterinario` (`idtb_veterinario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_consulta`
--

LOCK TABLES `tb_consulta` WRITE;
/*!40000 ALTER TABLE `tb_consulta` DISABLE KEYS */;
INSERT INTO `tb_consulta` VALUES (1,'2021-12-05',1,1,1,3),(2,'2022-01-27',3,1,2,1);
/*!40000 ALTER TABLE `tb_consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_especialidade`
--

DROP TABLE IF EXISTS `tb_especialidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_especialidade` (
  `idtb_especialidade` int NOT NULL,
  `especialidade` varchar(30) NOT NULL,
  PRIMARY KEY (`idtb_especialidade`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_especialidade`
--

LOCK TABLES `tb_especialidade` WRITE;
/*!40000 ALTER TABLE `tb_especialidade` DISABLE KEYS */;
INSERT INTO `tb_especialidade` VALUES (1,'Clinico Geral'),(2,'Cardiologista'),(3,'Ortopedia');
/*!40000 ALTER TABLE `tb_especialidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_funcionario`
--

DROP TABLE IF EXISTS `tb_funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_funcionario` (
  `idtb_funcionario` int NOT NULL,
  `nome` varchar(100) NOT NULL,
  `cpf` int NOT NULL,
  `rg` int NOT NULL,
  `telefone` int NOT NULL,
  `cargo` varchar(50) NOT NULL,
  PRIMARY KEY (`idtb_funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_funcionario`
--

LOCK TABLES `tb_funcionario` WRITE;
/*!40000 ALTER TABLE `tb_funcionario` DISABLE KEYS */;
INSERT INTO `tb_funcionario` VALUES (1,'Maria Antonia',3435432,2732632,73237,'Caixa'),(2,'Enzo Moura',883483,8347873,62652,'Zelador');
/*!40000 ALTER TABLE `tb_funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_nota_fiscal`
--

DROP TABLE IF EXISTS `tb_nota_fiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_nota_fiscal` (
  `idtb_nota_fiscal` int NOT NULL,
  `valor_total` int DEFAULT NULL,
  `data` date NOT NULL,
  `tb_cliente_idtb_cliente` int NOT NULL,
  `tb_funcionario_idtb_funcionario` int NOT NULL,
  PRIMARY KEY (`idtb_nota_fiscal`),
  KEY `fk_tb_cliente_idtb_cliente2` (`tb_cliente_idtb_cliente`),
  KEY `fk_tb_funcionario_idtb_funcionario` (`tb_funcionario_idtb_funcionario`),
  CONSTRAINT `fk_tb_cliente_idtb_cliente2` FOREIGN KEY (`tb_cliente_idtb_cliente`) REFERENCES `tb_cliente` (`idtb_cliente`),
  CONSTRAINT `fk_tb_funcionario_idtb_funcionario` FOREIGN KEY (`tb_funcionario_idtb_funcionario`) REFERENCES `tb_funcionario` (`idtb_funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_nota_fiscal`
--

LOCK TABLES `tb_nota_fiscal` WRITE;
/*!40000 ALTER TABLE `tb_nota_fiscal` DISABLE KEYS */;
INSERT INTO `tb_nota_fiscal` VALUES (1,1550,'2022-01-05',3,1),(2,100,'2022-02-07',2,1);
/*!40000 ALTER TABLE `tb_nota_fiscal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_pet`
--

DROP TABLE IF EXISTS `tb_pet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_pet` (
  `idtb_pet` int NOT NULL,
  `nome` varchar(20) NOT NULL,
  `especie` varchar(25) NOT NULL,
  `raca` varchar(25) DEFAULT NULL,
  `cor` varchar(15) NOT NULL,
  `idade` int NOT NULL,
  `tb_cliente_idtb_cliente` int NOT NULL,
  PRIMARY KEY (`idtb_pet`),
  KEY `fk_tb_cliente_idtb_cliente` (`tb_cliente_idtb_cliente`),
  CONSTRAINT `fk_tb_cliente_idtb_cliente` FOREIGN KEY (`tb_cliente_idtb_cliente`) REFERENCES `tb_cliente` (`idtb_cliente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_pet`
--

LOCK TABLES `tb_pet` WRITE;
/*!40000 ALTER TABLE `tb_pet` DISABLE KEYS */;
INSERT INTO `tb_pet` VALUES (1,'Penelope','Cavalo','Frisio','Preto',12,3),(2,'Loli','Cachorro','SRD','Caramelo',3,1),(3,'Raimundo','Gato','Persa','Malhado',1,2);
/*!40000 ALTER TABLE `tb_pet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_tipo_cirurgia`
--

DROP TABLE IF EXISTS `tb_tipo_cirurgia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_tipo_cirurgia` (
  `idtb_tipo_cirurgia` int NOT NULL,
  `tipo_cirurgia` varchar(30) NOT NULL,
  `valor_cirurgia` decimal(6,2) NOT NULL,
  PRIMARY KEY (`idtb_tipo_cirurgia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_tipo_cirurgia`
--

LOCK TABLES `tb_tipo_cirurgia` WRITE;
/*!40000 ALTER TABLE `tb_tipo_cirurgia` DISABLE KEYS */;
INSERT INTO `tb_tipo_cirurgia` VALUES (1,'Emergencial',1400.00),(2,'Agendada',800.00),(3,'Especialidade Max',1200.00);
/*!40000 ALTER TABLE `tb_tipo_cirurgia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_tipo_consulta`
--

DROP TABLE IF EXISTS `tb_tipo_consulta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_tipo_consulta` (
  `idtb_tipo_consulta` int NOT NULL,
  `tipo_consulta` varchar(30) NOT NULL,
  `valor_consulta` decimal(7,2) NOT NULL,
  PRIMARY KEY (`idtb_tipo_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_tipo_consulta`
--

LOCK TABLES `tb_tipo_consulta` WRITE;
/*!40000 ALTER TABLE `tb_tipo_consulta` DISABLE KEYS */;
INSERT INTO `tb_tipo_consulta` VALUES (1,'Geral',100.00),(2,'Exames Rotineiros',250.00),(3,'Exames Emergenciais',350.00);
/*!40000 ALTER TABLE `tb_tipo_consulta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_veterinario`
--

DROP TABLE IF EXISTS `tb_veterinario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_veterinario` (
  `idtb_veterinario` int NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` int NOT NULL,
  `telefone` int NOT NULL,
  `cargo` varchar(20) NOT NULL,
  `crmv` int NOT NULL,
  PRIMARY KEY (`idtb_veterinario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_veterinario`
--

LOCK TABLES `tb_veterinario` WRITE;
/*!40000 ALTER TABLE `tb_veterinario` DISABLE KEYS */;
INSERT INTO `tb_veterinario` VALUES (1,'Ronaldo Rogerio',234567,984582,'Veterinario N1',987654),(2,'Manuela Camargo',876389,9937652,'Veterinario N2',458722),(3,'Patricia Oliveira',542345,6533453,'Veterinario N2',43578743);
/*!40000 ALTER TABLE `tb_veterinario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tb_veterinario_has_tb_especialidade`
--

DROP TABLE IF EXISTS `tb_veterinario_has_tb_especialidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_veterinario_has_tb_especialidade` (
  `tb_veterinario_idtb_veterinario` int NOT NULL,
  `tb_especialidade_idtb_especialidade` int NOT NULL,
  KEY `fk_tb_veterinario_idtb_veterinario3` (`tb_veterinario_idtb_veterinario`),
  KEY `fk_tb_especialidad_idtb_especialidade` (`tb_especialidade_idtb_especialidade`),
  CONSTRAINT `fk_tb_especialidad_idtb_especialidade` FOREIGN KEY (`tb_especialidade_idtb_especialidade`) REFERENCES `tb_especialidade` (`idtb_especialidade`),
  CONSTRAINT `fk_tb_veterinario_idtb_veterinario3` FOREIGN KEY (`tb_veterinario_idtb_veterinario`) REFERENCES `tb_veterinario` (`idtb_veterinario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_veterinario_has_tb_especialidade`
--

LOCK TABLES `tb_veterinario_has_tb_especialidade` WRITE;
/*!40000 ALTER TABLE `tb_veterinario_has_tb_especialidade` DISABLE KEYS */;
INSERT INTO `tb_veterinario_has_tb_especialidade` VALUES (1,1),(2,3),(3,2);
/*!40000 ALTER TABLE `tb_veterinario_has_tb_especialidade` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-31 18:47:13
