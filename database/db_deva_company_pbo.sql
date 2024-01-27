/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.4.28-MariaDB : Database - db_deva_company_pbo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_deva_company_pbo` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `db_deva_company_pbo`;

/*Table structure for table `tbl_absensi` */

DROP TABLE IF EXISTS `tbl_absensi`;

CREATE TABLE `tbl_absensi` (
  `nip` char(15) DEFAULT NULL,
  `Nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `jabatan` varchar(50) DEFAULT NULL,
  `waktu` date DEFAULT NULL,
  `ket` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci CHECKSUM=1 DELAY_KEY_WRITE=1;

/*Data for the table `tbl_absensi` */

LOCK TABLES `tbl_absensi` WRITE;

insert  into `tbl_absensi`(`nip`,`Nama`,`alamat`,`jabatan`,`waktu`,`ket`) values 
('101','Muhammad Arif','Bandar Lampung','Manajer','2024-01-04','Tanpa Keterangan'),
('102','Nyoman','Bandar jaya','Manajer','2024-01-05','Hadir'),
('103','restu','bandar','admin','2024-01-05','Hadir'),
('104','Nyoman Wisatria','Bandar Lampung','Pegawai','2024-01-06','Hadir'),
('106','muh','asa','man','2024-01-09','Hadir');

UNLOCK TABLES;

/*Table structure for table `tbl_pegawai` */

DROP TABLE IF EXISTS `tbl_pegawai`;

CREATE TABLE `tbl_pegawai` (
  `nip` char(15) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `jenis_kelamin` varchar(50) DEFAULT NULL,
  `ttl` varchar(100) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `telf` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci CHECKSUM=1 DELAY_KEY_WRITE=1;

/*Data for the table `tbl_pegawai` */

LOCK TABLES `tbl_pegawai` WRITE;

insert  into `tbl_pegawai`(`nip`,`nama`,`jenis_kelamin`,`ttl`,`alamat`,`telf`) values 
('101','Muhammad Arif Martadinata','Laki-Laki','Bandar Lampung, 20 Maret 2003','Bandar Lampung','08762267263273'),
('102','Nyoman Wisatria','Laki-Laki','Bandar Lampung, 20 ','Bandar Lampung','0872121');

UNLOCK TABLES;

/*Table structure for table `tbl_pengguna` */

DROP TABLE IF EXISTS `tbl_pengguna`;

CREATE TABLE `tbl_pengguna` (
  `id_pengguna` int(11) NOT NULL AUTO_INCREMENT,
  `nip` int(11) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `level` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_pengguna`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci CHECKSUM=1 DELAY_KEY_WRITE=1;

/*Data for the table `tbl_pengguna` */

LOCK TABLES `tbl_pengguna` WRITE;

insert  into `tbl_pengguna`(`id_pengguna`,`nip`,`nama`,`password`,`level`) values 
(1,101,'arif','12345','Admin'),
(2,102,'yogi','12345','Pegawai'),
(3,103,'restu','12345','Admin'),
(4,104,'Admin','Admin','Admin');

UNLOCK TABLES;

/*Table structure for table `view_absensi` */

DROP TABLE IF EXISTS `view_absensi`;

/*!50001 DROP VIEW IF EXISTS `view_absensi` */;
/*!50001 DROP TABLE IF EXISTS `view_absensi` */;

/*!50001 CREATE TABLE  `view_absensi`(
 `nip` char(15) ,
 `Nama` varchar(50) ,
 `alamat` varchar(50) ,
 `waktu` date ,
 `jabatan` varchar(50) ,
 `ket` varchar(50) 
)*/;

/*Table structure for table `view_pengguna` */

DROP TABLE IF EXISTS `view_pengguna`;

/*!50001 DROP VIEW IF EXISTS `view_pengguna` */;
/*!50001 DROP TABLE IF EXISTS `view_pengguna` */;

/*!50001 CREATE TABLE  `view_pengguna`(
 `id_pengguna` int(11) ,
 `nip` int(11) ,
 `nama` varchar(50) ,
 `password` varchar(50) ,
 `level` varchar(20) 
)*/;

/*View structure for view view_absensi */

/*!50001 DROP TABLE IF EXISTS `view_absensi` */;
/*!50001 DROP VIEW IF EXISTS `view_absensi` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_absensi` AS (select `tbl_absensi`.`nip` AS `nip`,`tbl_absensi`.`Nama` AS `Nama`,`tbl_absensi`.`alamat` AS `alamat`,`tbl_absensi`.`waktu` AS `waktu`,`tbl_absensi`.`jabatan` AS `jabatan`,`tbl_absensi`.`ket` AS `ket` from `tbl_absensi`) */;

/*View structure for view view_pengguna */

/*!50001 DROP TABLE IF EXISTS `view_pengguna` */;
/*!50001 DROP VIEW IF EXISTS `view_pengguna` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `view_pengguna` AS (select `tbl_pengguna`.`id_pengguna` AS `id_pengguna`,`tbl_pengguna`.`nip` AS `nip`,`tbl_pengguna`.`nama` AS `nama`,`tbl_pengguna`.`password` AS `password`,`tbl_pengguna`.`level` AS `level` from `tbl_pengguna`) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
