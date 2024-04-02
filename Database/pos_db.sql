-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Apr 2024 pada 15.32
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pos_db`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `activity`
--

CREATE TABLE `activity` (
  `id` int(100) NOT NULL,
  `activity` varchar(256) NOT NULL,
  `user` varchar(256) NOT NULL,
  `datetime` datetime NOT NULL,
  `description` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `activity`
--

INSERT INTO `activity` (`id`, `activity`, `user`, `datetime`, `description`) VALUES
(7, 'User Login', 'yusuf', '2024-04-02 11:22:54', 'Transaksi pada tanggal 2024-04-02 11:22:54'),
(8, 'Transaksi', 'yusuf', '2024-04-02 14:30:54', 'Transaksi pada tanggal 2024-04-02 14:30:54'),
(9, 'Transaksi', 'yusuf', '2024-04-02 14:34:01', 'Transaksi pada tanggal 2024-04-02 14:34:01'),
(10, 'Login', 'yusuf', '2024-04-02 15:18:10', 'User yusuf logged in at 2024-04-02 15:18:10'),
(11, 'Transaksi', 'yusuf', '2024-04-02 15:52:33', 'Transaksi pada tanggal 2024-04-02 15:52:33'),
(12, 'Login', 'yusuf', '2024-04-02 16:14:07', 'User yusuf logged in at 2024-04-02 16:14:07'),
(13, 'Logout', '0', '2024-04-02 16:14:11', 'User yusuf logged out at 2024-04-02 16:14:11'),
(14, 'Login', 'yusuf', '2024-04-02 16:47:07', 'User yusuf logged in at 2024-04-02 16:47:07'),
(15, 'Logout', '1', '2024-04-02 16:47:09', 'User yusuf logged out at 2024-04-02 16:47:09'),
(16, 'Login', 'yusuf', '2024-04-02 16:58:02', 'User yusuf logged in at 2024-04-02 16:58:02'),
(17, 'Logout', '1', '2024-04-02 16:58:03', 'User yusuf logged out at 2024-04-02 16:58:03'),
(18, 'Login', 'yusuf', '2024-04-02 16:59:36', 'User yusuf logged in at 2024-04-02 16:59:36'),
(19, 'Logout', '1', '2024-04-02 16:59:38', 'User yusuf logged out at 2024-04-02 16:59:38'),
(20, 'Login', 'yusuf', '2024-04-02 17:06:58', 'User yusuf logged in at 2024-04-02 17:06:58'),
(21, 'Logout', 'yusuf', '2024-04-02 17:06:59', 'User yusuf logged out at 2024-04-02 17:06:59'),
(22, 'Login', 'yusuf', '2024-04-02 17:11:34', 'User yusuf logged in at 2024-04-02 17:11:34'),
(23, 'Logout', 'yusuf', '2024-04-02 17:11:35', 'User yusuf logged out at 2024-04-02 17:11:35'),
(24, 'Login', 'yusuf', '2024-04-02 17:31:49', 'User yusuf logged in at 2024-04-02 17:31:49'),
(25, 'Transaksi', 'yusuf', '2024-04-02 17:31:59', 'Transaksi pada tanggal 2024-04-02 17:31:59'),
(26, 'Transaksi', 'yusuf', '2024-04-02 17:33:04', 'Transaksi pada tanggal 2024-04-02 17:33:04'),
(27, 'Login', 'yusuf', '2024-04-02 17:35:04', 'User yusuf logged in at 2024-04-02 17:35:04'),
(28, 'Transaksi', 'yusuf', '2024-04-02 17:35:13', 'Transaksi pada tanggal 2024-04-02 17:35:13'),
(29, 'Logout', 'yusuf', '2024-04-02 17:35:14', 'User yusuf logged out at 2024-04-02 17:35:14'),
(30, 'Login', 'yusuf', '2024-04-02 17:51:13', 'User yusuf logged in at 2024-04-02 17:51:13'),
(31, 'Login', 'yusuf', '2024-04-02 17:55:58', 'User yusuf logged in at 2024-04-02 17:55:58'),
(32, 'Login', 'yusuf', '2024-04-02 17:57:13', 'User yusuf logged in at 2024-04-02 17:57:13'),
(33, 'Login', 'yusuf', '2024-04-02 17:57:55', 'User yusuf logged in at 2024-04-02 17:57:55'),
(34, 'Login', 'yusuf', '2024-04-02 17:59:30', 'User yusuf logged in at 2024-04-02 17:59:30'),
(35, 'Transaksi', 'yusuf', '2024-04-02 17:59:37', 'Transaksi pada tanggal 2024-04-02 17:59:37\nTotal Belanja: javax.swing.JTextField[,606,494,200x20,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@39dd9a5a,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=false,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=0,columnWidth=0,command=,horizontalAlignment=LEADING]\n'),
(36, 'Login', 'yusuf', '2024-04-02 18:00:39', 'User yusuf logged in at 2024-04-02 18:00:39'),
(37, 'Transaksi', 'yusuf', '2024-04-02 18:00:46', 'Transaksi pada tanggal 2024-04-02 18:00:46Total Belanja: javax.swing.JTextField[,606,494,200x20,layout=javax.swing.plaf.basic.BasicTextUI$UpdateHandler,alignmentX=0.0,alignmentY=0.0,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@192e0ce7,flags=296,maximumSize=,minimumSize=,preferredSize=,caretColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],disabledTextColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],editable=false,margin=javax.swing.plaf.InsetsUIResource[top=0,left=0,bottom=0,right=0],selectedTextColor=sun.swing.PrintColorUIResource[r=51,g=51,b=51],selectionColor=javax.swing.plaf.ColorUIResource[r=184,g=207,b=229],columns=0,columnWidth=0,command=,horizontalAlignment=LEADING]'),
(38, 'Login', 'yusuf', '2024-04-02 18:04:07', 'User yusuf logged in at 2024-04-02 18:04:07'),
(39, 'Transaksi', 'yusuf', '2024-04-02 18:04:15', 'Transaksi pada tanggal 2024-04-02 18:04:15'),
(40, 'Login', 'yusuf', '2024-04-02 18:06:01', 'User yusuf logged in at 2024-04-02 18:06:01'),
(41, 'Logout', 'yusuf', '2024-04-02 18:06:09', 'User yusuf logged out at 2024-04-02 18:06:09'),
(42, 'Login', 'yusuf', '2024-04-02 20:24:33', 'User yusuf logged in at 2024-04-02 20:24:33'),
(43, 'Transaksi', 'yusuf', '2024-04-02 20:24:47', 'Transaksi pada tanggal 2024-04-02 20:24:47'),
(44, 'Login', 'Mubarok', '2024-04-02 20:28:00', 'User Mubarok logged in at 2024-04-02 20:28:00'),
(45, 'Logout', 'Mubarok', '2024-04-02 20:28:03', 'User Mubarok logged out at 2024-04-02 20:28:03');

-- --------------------------------------------------------

--
-- Struktur dari tabel `barang`
--

CREATE TABLE `barang` (
  `kode` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `harga` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `barang`
--

INSERT INTO `barang` (`kode`, `nama`, `harga`) VALUES
(1, 'Chitato BBQ Normal', 10000),
(2, 'Oreo', 15000),
(3, 'Potabee Kentang Goreng', 12000),
(4, 'Cheetoz BBQ', 16000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `itemtransaksi`
--

CREATE TABLE `itemtransaksi` (
  `id` int(11) NOT NULL,
  `idTransaksi` int(11) NOT NULL,
  `kode` int(11) NOT NULL,
  `nama` varchar(256) NOT NULL,
  `harga` float NOT NULL,
  `jumlah` int(11) NOT NULL,
  `total` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `itemtransaksi`
--

INSERT INTO `itemtransaksi` (`id`, `idTransaksi`, `kode`, `nama`, `harga`, `jumlah`, `total`) VALUES
(39, 12, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(40, 12, 3, 'Potabee Kentang Goreng', 12000, 3, 36000),
(41, 13, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(42, 14, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(43, 15, 2, 'Oreo', 15000, 1, 15000),
(44, 16, 2, 'Oreo', 15000, 1, 15000),
(45, 17, 4, 'Cheetoz BBQ', 16000, 1, 16000),
(46, 18, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(47, 19, 4, 'Cheetoz BBQ', 16000, 1, 16000),
(48, 19, 3, 'Potabee Kentang Goreng', 12000, 1, 12000),
(49, 20, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(50, 20, 4, 'Cheetoz BBQ', 16000, 1, 16000),
(51, 21, 3, 'Potabee Kentang Goreng', 12000, 1, 12000),
(52, 22, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(53, 23, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(54, 24, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(55, 25, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(56, 26, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(57, 27, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(58, 28, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(59, 29, 1, 'Chitato BBQ Normal', 10000, 1, 10000),
(66, 30, 3, 'Potabee Kentang Goreng', 12000, 1, 12000),
(67, 31, 1, 'Chitato BBQ Normal', 10000, 1, 10000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `transaksi`
--

CREATE TABLE `transaksi` (
  `idTransaksi` int(15) NOT NULL,
  `user` varchar(256) NOT NULL,
  `tanggal` date NOT NULL,
  `waktu` time NOT NULL,
  `deskripsi` varchar(256) NOT NULL,
  `totalBelanja` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `transaksi`
--

INSERT INTO `transaksi` (`idTransaksi`, `user`, `tanggal`, `waktu`, `deskripsi`, `totalBelanja`) VALUES
(1, 'Username', '2024-04-01', '17:37:21', 'Transaksi pada tanggal 2024-04-01 17:37:21', 10000),
(2, 'Ucup', '2024-04-01', '19:06:55', 'Transaksi pada tanggal 2024-04-01 19:06:55', 10000),
(3, 'yusuf', '2024-04-01', '20:07:19', 'Transaksi pada tanggal 2024-04-01 20:07:19', 10000),
(4, 'yusuf', '2024-04-01', '20:11:24', 'Transaksi pada tanggal 2024-04-01 20:11:24', 25000),
(5, 'yusuf', '2024-04-01', '21:59:59', 'Transaksi pada tanggal 2024-04-01 21:59:59', 20000),
(6, 'yusuf', '2024-04-01', '22:01:26', 'Transaksi pada tanggal 2024-04-01 22:01:26', 20000),
(7, 'yusuf', '2024-04-01', '22:02:35', 'Transaksi pada tanggal 2024-04-01 22:02:35', 10000),
(8, 'yusuf', '2024-04-01', '22:15:45', 'Transaksi pada tanggal 2024-04-01 22:15:45', 10000),
(9, 'yusuf', '2024-04-01', '22:16:10', 'Transaksi pada tanggal 2024-04-01 22:16:10', 10000),
(10, 'yusuf', '2024-04-01', '22:21:03', 'Transaksi pada tanggal 2024-04-01 22:21:03', 10000),
(11, 'yusuf', '2024-04-01', '22:23:00', 'Transaksi pada tanggal 2024-04-01 22:23:00', 10000),
(12, 'yusuf', '2024-04-01', '22:24:25', 'Transaksi pada tanggal 2024-04-01 22:24:25', 46000),
(13, 'yusuf', '2024-04-02', '10:13:23', 'Transaksi pada tanggal 2024-04-02 10:13:23', 10000),
(14, 'yusuf', '2024-04-02', '10:14:32', 'Transaksi pada tanggal 2024-04-02 10:14:32', 10000),
(15, 'yusuf', '2024-04-02', '10:19:35', 'Transaksi pada tanggal 2024-04-02 10:19:35', 15000),
(16, 'yusuf', '2024-04-02', '10:23:22', 'Transaksi pada tanggal 2024-04-02 10:23:22', 15000),
(17, 'yusuf', '2024-04-02', '10:29:06', 'Transaksi pada tanggal 2024-04-02 10:29:06', 16000),
(18, 'yusuf', '2024-04-02', '10:34:46', 'Transaksi pada tanggal 2024-04-02 10:34:46', 10000),
(19, 'yusuf', '2024-04-02', '10:37:39', 'Transaksi pada tanggal 2024-04-02 10:37:39', 28000),
(20, 'yusuf', '2024-04-02', '11:16:19', 'Transaksi pada tanggal 2024-04-02 11:16:19', 26000),
(21, 'yusuf', '2024-04-02', '11:18:07', 'Transaksi pada tanggal 2024-04-02 11:18:07', 12000),
(22, 'yusuf', '2024-04-02', '11:19:46', 'Transaksi pada tanggal 2024-04-02 11:19:46', 10000),
(23, 'yusuf', '2024-04-02', '11:22:54', 'Transaksi pada tanggal 2024-04-02 11:22:54', 10000),
(24, 'yusuf', '2024-04-02', '14:30:54', 'Transaksi pada tanggal 2024-04-02 14:30:54', 10000),
(25, 'yusuf', '2024-04-02', '14:34:01', 'Transaksi pada tanggal 2024-04-02 14:34:01', 10000),
(26, 'yusuf', '2024-04-02', '15:52:33', 'Transaksi pada tanggal 2024-04-02 15:52:33', 10000),
(27, 'yusuf', '2024-04-02', '17:31:59', 'Transaksi pada tanggal 2024-04-02 17:31:59', 10000),
(28, 'yusuf', '2024-04-02', '17:33:04', 'Transaksi pada tanggal 2024-04-02 17:33:04', 10000),
(29, 'yusuf', '2024-04-02', '17:35:13', 'Transaksi pada tanggal 2024-04-02 17:35:13', 10000),
(30, 'yusuf', '2024-04-02', '18:04:15', 'Transaksi pada tanggal 2024-04-02 18:04:15', 12000),
(31, 'yusuf', '2024-04-02', '20:24:47', 'Transaksi pada tanggal 2024-04-02 20:24:47', 10000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(256) NOT NULL,
  `password` varchar(256) NOT NULL,
  `session` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id`, `username`, `password`, `session`) VALUES
(1, 'yusuf', '5f7d9db3064e83f947a81e4b4ea9215ca5ad25afb040297eab98d5e0317d2839', 0),
(2, 'Mubarok', 'df10e1d544daca2de18e6a660fe7d15709e5a392b524ed6586ca219d13f44c31', 0),
(3, 'Indira', 'e068900adbaa24d077c6347a3a890afb01b7c4a54e4776aee28758ffe79906ff', 0),
(4, 'abiyan', '78e9b76ce97fab306314915396fcaa0cbde2a95c6d76eb04bd6bbce9a03f4f23', 0);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `activity`
--
ALTER TABLE `activity`
  ADD PRIMARY KEY (`id`);

--
-- Indeks untuk tabel `barang`
--
ALTER TABLE `barang`
  ADD PRIMARY KEY (`kode`);

--
-- Indeks untuk tabel `itemtransaksi`
--
ALTER TABLE `itemtransaksi`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idTransaksi` (`idTransaksi`);

--
-- Indeks untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`idTransaksi`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `activity`
--
ALTER TABLE `activity`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT untuk tabel `barang`
--
ALTER TABLE `barang`
  MODIFY `kode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT untuk tabel `itemtransaksi`
--
ALTER TABLE `itemtransaksi`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT untuk tabel `transaksi`
--
ALTER TABLE `transaksi`
  MODIFY `idTransaksi` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT untuk tabel `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `itemtransaksi`
--
ALTER TABLE `itemtransaksi`
  ADD CONSTRAINT `itemtransaksi_ibfk_1` FOREIGN KEY (`idTransaksi`) REFERENCES `transaksi` (`idTransaksi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
