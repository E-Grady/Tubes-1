-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 24, 2016 at 06:28 PM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biro_perjalanan`
--

-- --------------------------------------------------------

--
-- Table structure for table `paket_wisata`
--

CREATE TABLE IF NOT EXISTS `paket_wisata` (
  `kode_paket` char(10) NOT NULL,
  `harga` int(11) NOT NULL,
  `nama_paket` varchar(35) NOT NULL,
  `kapasitas` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `paket_wisata`
--

INSERT INTO `paket_wisata` (`kode_paket`, `harga`, `nama_paket`, `kapasitas`) VALUES
('pk01', 10000, 'Paket Murah', 20);

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
  `id_pel` char(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `jk` varchar(15) NOT NULL,
  `umur` int(5) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `kode_perjalanan` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pel`, `nama`, `alamat`, `jk`, `umur`, `no_hp`, `kode_perjalanan`) VALUES
('pel01', 'jono', 'bdg', 'Laki-laki', 19, '12381', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `perjalanan`
--

CREATE TABLE IF NOT EXISTS `perjalanan` (
  `kode_perjalanan` char(10) NOT NULL,
  `kode_paket` char(10) DEFAULT NULL,
  `tgl_berangkat` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `perjalanan`
--

INSERT INTO `perjalanan` (`kode_perjalanan`, `kode_paket`, `tgl_berangkat`) VALUES
('per01', 'pk01', '25/04/2016');

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `id` char(10) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `jk` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `umur` int(5) NOT NULL,
  `no_hp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id`, `jabatan`, `nama`, `jk`, `alamat`, `umur`, `no_hp`) VALUES
('pet01', 'bos', 'uki', 'Laki-laki', 'bdg', 19, '90182'),
('pet02', 'bos', 'ega', 'Laki-laki', 'bdg', 19, '90182');

-- --------------------------------------------------------

--
-- Table structure for table `tempat_wisata`
--

CREATE TABLE IF NOT EXISTS `tempat_wisata` (
  `nama_wisata` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `nama_cp` varchar(30) NOT NULL,
  `no_hp` varchar(13) NOT NULL,
  `kode_paket` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tempat_wisata`
--

INSERT INTO `tempat_wisata` (`nama_wisata`, `alamat`, `nama_cp`, `no_hp`, `kode_paket`) VALUES
('Ancol', 'Jakarta', 'uki', '192839', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `paket_wisata`
--
ALTER TABLE `paket_wisata`
  ADD PRIMARY KEY (`kode_paket`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pel`),
  ADD KEY `kode_perjalanan` (`kode_perjalanan`) USING BTREE;

--
-- Indexes for table `perjalanan`
--
ALTER TABLE `perjalanan`
  ADD PRIMARY KEY (`kode_perjalanan`),
  ADD KEY `kode_paket` (`kode_paket`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tempat_wisata`
--
ALTER TABLE `tempat_wisata`
  ADD PRIMARY KEY (`nama_wisata`),
  ADD KEY `kode_paket` (`kode_paket`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD CONSTRAINT `FK_PELANGGAN` FOREIGN KEY (`kode_perjalanan`) REFERENCES `perjalanan` (`kode_perjalanan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `perjalanan`
--
ALTER TABLE `perjalanan`
  ADD CONSTRAINT `FK_PERJALANAN` FOREIGN KEY (`kode_paket`) REFERENCES `paket_wisata` (`kode_paket`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tempat_wisata`
--
ALTER TABLE `tempat_wisata`
  ADD CONSTRAINT `FK_PAKET_WISATA` FOREIGN KEY (`kode_paket`) REFERENCES `paket_wisata` (`kode_paket`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
