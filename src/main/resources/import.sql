CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


--
-- Table structure for table `tanim`
--

DROP TABLE IF EXISTS `tanim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tanim` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ust_tanim_id` int(11) NOT NULL DEFAULT '0',
  `aciklama` varchar(45) NOT NULL,
  `aktif` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tanim`
--

LOCK TABLES `tanim` WRITE;
/*!40000 ALTER TABLE `tanim` DISABLE KEYS */;
INSERT INTO `tanim` VALUES (1,0,'Unvan Tanimlari',1),(2,1,'Yazılım Uzmanı',1),(3,1,'Insan Kaynaklari Uzmani',1),(4,1,'Genel Mudur',1),(5,1,'Genel Mudur Yardimcisi',1),(6,1,'Proje Yoneticisi',1),(7,0,'Cinsiyet Tanimlari',1),(8,7,'Kadin',1),(9,7,'Erkek',1),(10,0,'Medeni Durum Tanimlari',1),(11,10,'Evli',1),(12,10,'Bekar',1),(13,10,'Nisanli',1),(14,0,'Uyruk Tanimlari',1),(15,14,'TC',1),(16,14,'UK',1),(17,14,'US',1),(18,14,'DE',1),(19,14,'FR',1),(20,0,'Adres Tipleri',1),(21,20,'Ev Adresi',1),(22,20,'Is Adresi',1);
/*!40000 ALTER TABLE `tanim` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `birim`
--



DROP TABLE IF EXISTS `birim`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `birim` (
  `id` int(11) NOT NULL,
  `birim_adi` varchar(45) NOT NULL,
  `yonetici_id` int(11) DEFAULT NULL,
  `aktif` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `birim_id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `birim`
--

LOCK TABLES `birim` WRITE;
/*!40000 ALTER TABLE `birim` DISABLE KEYS */;
INSERT INTO `birim` VALUES (1,'AR-GE',2,1),(2,'İdari İşler ve Maliye',3,1),(3,'Teknik Servis',2,1);
/*!40000 ALTER TABLE `birim` ENABLE KEYS */;
UNLOCK TABLES;




--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1),(1),(1),(1),(1),(1),(1),(1),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `konum`
--

DROP TABLE IF EXISTS `konum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `konum` (
  `id` int(11) NOT NULL,
  `ust_konum_id` int(11) DEFAULT NULL,
  `aciklama` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `konum`
--

LOCK TABLES `konum` WRITE;
/*!40000 ALTER TABLE `konum` DISABLE KEYS */;
INSERT INTO `konum` VALUES (1,0,'Trabzon'),(2,1,'Ortahisar'),(3,1,'Akçaabat'),(4,0,'Ankara'),(5,4,'Etimesgut'),(6,4,'Çankaya'),(7,4,'Yenimahalle'),(8,0,'İstanbul'),(9,8,'Tuzla'),(10,8,'Beşiktaş'),(11,8,'Küçükçekmece');
/*!40000 ALTER TABLE `konum` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Table structure for table `kullanici`
--



DROP TABLE IF EXISTS `kullanici`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kullanici` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adi` varchar(45) NOT NULL,
  `soyadi` varchar(45) NOT NULL,
  `kullanici_adi` varchar(45) NOT NULL,
  `sifre` varchar(45) NOT NULL,
  `aktif` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kullanici_adi_UNIQUE` (`kullanici_adi`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kullanici`
--

LOCK TABLES `kullanici` WRITE;
/*!40000 ALTER TABLE `kullanici` DISABLE KEYS */;
INSERT INTO `kullanici` VALUES (2,'nursen','altinbas','nursena','123',1);
/*!40000 ALTER TABLE `kullanici` ENABLE KEYS */;
UNLOCK TABLES;





--
-- Table structure for table `kisi`
--

DROP TABLE IF EXISTS `kisi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `kisi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(45) NOT NULL,
  `soyad` varchar(45) NOT NULL,
  `dogum_tarihi` date NOT NULL,
  `cinsiyet` int(11) NOT NULL,
  `medeni_durum` int(11) DEFAULT NULL,
  `unvan_id` int(11) NOT NULL,
  `sicil_no` varchar(45) DEFAULT NULL,
  `aktif` tinyint(1) NOT NULL,
  `dogum_yeri` varchar(45) NOT NULL,
  `uyruk` varchar(10) NOT NULL,
  `birim_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `kisi_id_UNIQUE` (`id`),
  KEY `kisi_birim_fk_idx` (`birim_id`),
  KEY `unvan_fk` (`unvan_id`),
  CONSTRAINT `FKpgmusus9681f0pwi8kxkj4tx` FOREIGN KEY (`birim_id`) REFERENCES `birim` (`id`),
  CONSTRAINT `kisi_birim_fk` FOREIGN KEY (`birim_id`) REFERENCES `birim` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `unvan_fk` FOREIGN KEY (`unvan_id`) REFERENCES `tanim` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kisi`
--

LOCK TABLES `kisi` WRITE;
/*!40000 ALTER TABLE `kisi` DISABLE KEYS */;
INSERT INTO `kisi` VALUES (2,'nursen','eyupoglu','1990-02-01',8,11,2,'',1,'trabzon','16',1),(3,'hamdi','altinbas','1982-04-03',9,11,2,'',1,'almanya','15',2);
/*!40000 ALTER TABLE `kisi` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Table structure for table `adres`
--

DROP TABLE IF EXISTS `adres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adres` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kisi_id` int(11) NOT NULL,
  `adres_tipi` int(11) NOT NULL,
  `il_id` int(11) NOT NULL,
  `ilce_id` int(11) NOT NULL,
  `adres_detay1` varchar(45) DEFAULT NULL,
  `adres_detay2` varchar(45) DEFAULT NULL,
  `ic_kapi_no` varchar(5) DEFAULT NULL,
  `dis_kapi_no` varchar(45) DEFAULT NULL,
  `aktif` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `adres_fk_idx` (`kisi_id`),
  KEY `adres_il_fk_idx` (`il_id`),
  KEY `adres_ilce_fk_idx` (`ilce_id`),
  CONSTRAINT `FK5fybun0e83cdix8nnd3ivomju` FOREIGN KEY (`ilce_id`) REFERENCES `konum` (`id`),
  CONSTRAINT `FKp2sq56fsqv8aichbhhmiue943` FOREIGN KEY (`kisi_id`) REFERENCES `kisi` (`id`),
  CONSTRAINT `FKsd3531cdrkd797qe8vkb5oobs` FOREIGN KEY (`il_id`) REFERENCES `konum` (`id`),
  CONSTRAINT `adres_fk` FOREIGN KEY (`kisi_id`) REFERENCES `kisi` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `adres_il_fk` FOREIGN KEY (`il_id`) REFERENCES `konum` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `adres_ilce_fk` FOREIGN KEY (`ilce_id`) REFERENCES `konum` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adres`
--

LOCK TABLES `adres` WRITE;
/*!40000 ALTER TABLE `adres` DISABLE KEYS */;
INSERT INTO `adres` VALUES (1,2,21,1,3,'sevgi mah. can sok.','biricik apt.','10','11',1),(2,2,22,8,11,'kgfgfxdxd','','2','1',0),(3,2,22,4,6,'bizim mah.','','2','2',1);
/*!40000 ALTER TABLE `adres` ENABLE KEYS */;
UNLOCK TABLES;



/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-03-10 19:57:56
