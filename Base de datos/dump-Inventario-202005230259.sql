-- MySQL dump 10.13  Distrib 8.0.20, for Linux (x86_64)
--
-- Host: localhost    Database: Inventario
-- ------------------------------------------------------
-- Server version	8.0.20-0ubuntu0.20.04.1

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
-- Table structure for table `articulo`
--

DROP TABLE IF EXISTS `articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `articulo` (
  `id_articulo` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(30) NOT NULL,
  `precio_venta` int NOT NULL,
  `precio_costo` int NOT NULL,
  `stock` int NOT NULL,
  `cod_tipo_articulo` int NOT NULL,
  `cod_proveedor` varchar(20) NOT NULL,
  `fecha_ingreso` varchar(15) NOT NULL,
  PRIMARY KEY (`id_articulo`),
  KEY `ref_tipo_articulo_idx` (`cod_tipo_articulo`),
  KEY `ref_prov_art_idx` (`cod_proveedor`),
  CONSTRAINT `ref_prov_art` FOREIGN KEY (`cod_proveedor`) REFERENCES `proveedor` (`No_documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ref_tipo_articulo` FOREIGN KEY (`cod_tipo_articulo`) REFERENCES `tipo_articulo` (`id_tipoarticulo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `articulo`
--

LOCK TABLES `articulo` WRITE;
/*!40000 ALTER TABLE `articulo` DISABLE KEYS */;
INSERT INTO `articulo` VALUES (1,'Figura batman',100000,80000,20,19,'00003-A','2012-11-03'),(2,'Anillo bleach',70000,50000,55,19,'00003-A','2012-10-11'),(3,'Figura superman',150000,130000,18,19,'00003-A','2012-09-01'),(4,'Collar naruto ',120000,100000,8,20,'00002-2','2012-10-02'),(5,'Camisa deadpool',50000,30000,59,21,'00001-1','2012-11-01'),(6,'Camisa Wolverine',90000,70000,18,24,'00004-4','2012-10-02'),(7,'Anillo linterna verde\'',50000,30000,12,22,'00003-A','2012-10-20'),(8,'Figura Acuaman',70000,50000,8,24,'00004-4','2012-11-02'),(9,'Figura Goku',60000,40000,20,23,'00002-2','2012-10-23'),(10,'Figura Fin',60000,40000,17,23,'00002-2','2012-10-23'),(11,'Camisa Flash',100000,80000,20,23,'00002-2','2012-10-23'),(12,'Camisa Capitan America',30000,20000,30,24,'00005-F','2012-10-03');
/*!40000 ALTER TABLE `articulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ciudad`
--

DROP TABLE IF EXISTS `ciudad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ciudad` (
  `Codigo_ciudad` int NOT NULL AUTO_INCREMENT,
  `Nombre_ciudad` varchar(30) NOT NULL,
  PRIMARY KEY (`Codigo_ciudad`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciudad`
--

LOCK TABLES `ciudad` WRITE;
/*!40000 ALTER TABLE `ciudad` DISABLE KEYS */;
INSERT INTO `ciudad` VALUES (1,'POPAYAN'),(2,'CALI'),(3,'PASTO'),(4,'MEDELLIN'),(5,'BOGOTA'),(6,'BARRANQUILLA'),(7,'CARTAGENA'),(8,'ARAUCA'),(9,'BALBOA'),(10,'BELALCAZAR'),(11,'BETANIA'),(12,'BOLIVAR'),(13,'BUCARAMANGA'),(14,'BUENAVENTURA'),(15,'CUCUTA'),(16,'CALDAS'),(17,'CAQUETA'),(18,'CERRITO'),(19,'CHIA'),(20,'CORDOBA');
/*!40000 ALTER TABLE `ciudad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `Documento` varchar(15) NOT NULL,
  `cod_tipo_documento` int NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `Direccion` varchar(20) DEFAULT NULL,
  `cod_ciudad` int NOT NULL,
  `Telefono` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Documento`),
  KEY `cod_tipodocumento_idx` (`cod_tipo_documento`),
  KEY `ref_ciudad_idx` (`cod_ciudad`),
  CONSTRAINT `ref_ciudad` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ref_tipo_doc` FOREIGN KEY (`cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('000031',1,'Carlos','Perez','Carrera 23 N 34-34',1,'3127654323'),('000032',1,'dfdfff','ffff','fffff',1,'77777'),('0001',1,'Camilo','Lopez','Calle 23 N 12-43',2,'8239578'),('0002',2,'Maria','Arango','Carrera 5 N 23-12',1,'8253478'),('0003',1,'Andres','Florez','Carrera 23 N 12A 34',4,'3127654323'),('0004',1,'Carlos','Marin','Calle 3 N 98_21',10,'8345623'),('0005',1,'Elvira','Orozco','Centro',15,'3219843543'),('0006',1,'Kevin','Ayala','Carrera 23 N 4B 23',1,'8354624'),('0007',1,'Angela','Hoyos','Calle 4 N 23 34',3,'3217654300'),('0008',2,'Marcela','Gomez','Centro',6,NULL),('0009',1,'Andres','Orozco','Calle 34 N 89 00',1,'8219876'),('0010',1,'Marlon','Diaz','Carrera 23 N 78-00',9,'3219870987'),('0011',1,'Daniela','Ceron','Centro',1,'8236543'),('0012',2,'Camilo','Orozco','Calle 21 N 23-98',10,'3119874534'),('0013',1,'Daniela','Ramos','Centro',2,'3217653400'),('0014',2,'Camilo','Samboni','Carrera 23 N45A 12',6,'8204587'),('0015',1,'Alexander','Romero','Calle 34 N 23 B 12',2,'8340976'),('0016',1,'Sebastian','Naranjo','Carrera 23 N 2 A 1',1,'8320912'),('0017',2,'Sandra','Castillo','Centro',3,'3218769988'),('0018',1,'Nicolas','Ospina','Calle 23- N 76',1,'8230954'),('0019',1,'Santiago','Sanchez','Carrera 23 N 12-23',1,'8236521'),('0020',1,'Aleja','Dorado','Calle 34 N 23 B 4',2,'8453234'),('0021',2,'andrea','Ruiz','Centro',1,'3238765456'),('0022',1,'Andres','Perdomo','Centro',3,'8456342'),('0023',1,'Dolly','Joaqui','Calle 3 N 34-12',1,'8230943'),('0024',2,'Kevin','Rivera','Centro',1,'8342309'),('0025',1,'Camila','Maya','Carrera 23 n 65-4',1,'3150987866'),('0026',1,'Camilo','Coral','Centro',1,NULL),('0027',2,'Carlos','Paz','Centro',1,NULL),('0028',1,'Cristian','Paz','Calle 34 N b34',1,'3219870045'),('0029',1,'Daniela','Solarte','Centro',1,'8345623'),('0030',1,'Diana','Aponte','Centro',15,'8234522'),('1032',2,'andres','juan','calle 34-23',2,'326589'),('12',1,'kerly andrea','samboni bolaños','los cimuneros',1,'3113882177'),('120',1,'andres','sanchez','carere 12-45',2,'8202565'),('123',2,'carlos','andres','calle 23.5',2,'235645'),('125',2,'andres','sanchez','calle 23',2,'12545'),('4115',2,'hhhhhhhh','hhhhhhhhhh','hhhhhhhhhhh',1,'hhhhhhhhh');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_factura`
--

DROP TABLE IF EXISTS `detalle_factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_factura` (
  `cod_factura` varchar(20) NOT NULL,
  `cod_articulo` int NOT NULL,
  `cantidad` int NOT NULL,
  `total` decimal(10,0) NOT NULL,
  PRIMARY KEY (`cod_factura`,`cod_articulo`),
  KEY `ref_facturacion_idx` (`cod_factura`),
  KEY `ref_ar_fact_idx` (`cod_articulo`),
  CONSTRAINT `ref_ar_fact` FOREIGN KEY (`cod_articulo`) REFERENCES `articulo` (`id_articulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ref_facturacion` FOREIGN KEY (`cod_factura`) REFERENCES `factura` (`Nnm_factura`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura`
--

LOCK TABLES `detalle_factura` WRITE;
/*!40000 ALTER TABLE `detalle_factura` DISABLE KEYS */;
INSERT INTO `detalle_factura` VALUES ('FACT-9910966',3,1,150000),('FACT-9910966',4,2,240000),('FACT-9910966',5,1,47500);
/*!40000 ALTER TABLE `detalle_factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `devolucion`
--

DROP TABLE IF EXISTS `devolucion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `devolucion` (
  `cod_detallefactura` varchar(20) NOT NULL,
  `cod_detallearticulo` int NOT NULL,
  `Motivo` varchar(15) NOT NULL,
  `Fecha_devolucion` varchar(10) NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`cod_detallefactura`,`cod_detallearticulo`),
  KEY `ref_detallefactu_idx` (`cod_detallefactura`),
  KEY `ref_deta_art_idx` (`cod_detallearticulo`),
  CONSTRAINT `ref_deta_art` FOREIGN KEY (`cod_detallearticulo`) REFERENCES `detalle_factura` (`cod_articulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ref_detallefactu` FOREIGN KEY (`cod_detallefactura`) REFERENCES `detalle_factura` (`cod_factura`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `devolucion`
--

LOCK TABLES `devolucion` WRITE;
/*!40000 ALTER TABLE `devolucion` DISABLE KEYS */;
INSERT INTO `devolucion` VALUES ('FACT-9910966',3,'pequeño','22/1/2013',1);
/*!40000 ALTER TABLE `devolucion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura` (
  `Nnm_factura` varchar(20) NOT NULL,
  `cod_cliente` varchar(15) NOT NULL,
  `Nombre_empleado` varchar(30) NOT NULL,
  `Fecha_facturacion` varchar(15) NOT NULL,
  `cod_formapago` int NOT NULL,
  `total_factura` decimal(10,0) DEFAULT NULL,
  `IVA` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`Nnm_factura`),
  KEY `ref_cli_idx` (`cod_cliente`),
  KEY `ref_formapago_idx` (`cod_formapago`),
  CONSTRAINT `ref_cli` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`Documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ref_formapago` FOREIGN KEY (`cod_formapago`) REFERENCES `forma_de_pago` (`id_formapago`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES ('FACT-9910966','125','jose','22/1/2013',1,437500,70000);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forma_de_pago`
--

DROP TABLE IF EXISTS `forma_de_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `forma_de_pago` (
  `id_formapago` int NOT NULL AUTO_INCREMENT,
  `Descripcion_formapago` varchar(20) NOT NULL,
  PRIMARY KEY (`id_formapago`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forma_de_pago`
--

LOCK TABLES `forma_de_pago` WRITE;
/*!40000 ALTER TABLE `forma_de_pago` DISABLE KEYS */;
INSERT INTO `forma_de_pago` VALUES (1,'EFECTIVO'),(2,'BONO'),(3,'TARJETA DE CREDITO'),(4,'CHEQUE');
/*!40000 ALTER TABLE `forma_de_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `No_documento` varchar(20) NOT NULL,
  `cod_tipo_documento` int NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Nombre_comercial` varchar(20) NOT NULL,
  `direccion` varchar(20) DEFAULT NULL,
  `cod_ciudad` int NOT NULL,
  `Telefono` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`No_documento`),
  KEY `ref_prov_ciudad_idx` (`cod_ciudad`),
  KEY `proveedor_ibfk_1` (`cod_tipo_documento`),
  CONSTRAINT `proveedor_ibfk_1` FOREIGN KEY (`cod_tipo_documento`) REFERENCES `tipo_de_documento` (`id_tipo_documento`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ref_prov_ciudad` FOREIGN KEY (`cod_ciudad`) REFERENCES `ciudad` (`Codigo_ciudad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES ('00001-1',4,'Carlos','Maya','Estilos','Calle 12-12',1,NULL),('00002-2',4,'Marino','Burbano','Sports','Centro',2,NULL),('00003-A',7,'Paola','Sanchez','Fashion','Veraneras',3,NULL),('00004-4',4,'Camilo','Muñoz','Jeans&Jackets','Centro',2,NULL),('00005-F',7,'Marlon','Brandom','Bellas','Calle 34 B 12',1,NULL),('00006-6',1,'Carlos','sanchez diaz','jeans&&jeans','calle 45 N 23-23',1,'8213423'),('2222',1,'cccc','ddfff','ffff','dddd',1,'56566'),('43434',7,'fdsfdsfdsfds','fdsfsfds','fsdfdsfds','fsdfdsfds',1,'543534543');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_articulo`
--

DROP TABLE IF EXISTS `tipo_articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_articulo` (
  `id_tipoarticulo` int NOT NULL AUTO_INCREMENT,
  `descripcion_articulo` varchar(30) NOT NULL,
  PRIMARY KEY (`id_tipoarticulo`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_articulo`
--

LOCK TABLES `tipo_articulo` WRITE;
/*!40000 ALTER TABLE `tipo_articulo` DISABLE KEYS */;
INSERT INTO `tipo_articulo` VALUES (19,'Figura de accion'),(20,'Taza personalizada'),(21,'Camiseta personalizada'),(22,'Pin'),(23,'Poster'),(24,'Collar'),(25,'Anillo');
/*!40000 ALTER TABLE `tipo_articulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_de_documento`
--

DROP TABLE IF EXISTS `tipo_de_documento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_de_documento` (
  `id_tipo_documento` int NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(10) NOT NULL,
  PRIMARY KEY (`id_tipo_documento`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_de_documento`
--

LOCK TABLES `tipo_de_documento` WRITE;
/*!40000 ALTER TABLE `tipo_de_documento` DISABLE KEYS */;
INSERT INTO `tipo_de_documento` VALUES (1,'CC'),(2,'TI'),(3,'RC'),(4,'NIT'),(5,'PASAPORTE'),(6,'CE'),(7,'RUT');
/*!40000 ALTER TABLE `tipo_de_documento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'Inventario'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-05-23  2:59:42
