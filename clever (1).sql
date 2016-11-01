-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 14-Abr-2016 às 10:35
-- Versão do servidor: 5.5.45
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `clever`
--
CREATE DATABASE IF NOT EXISTS `clever` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `clever`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `id_cliente` int(11) NOT NULL,
  `nome_cliente` varchar(30) NOT NULL,
  `id_endereco` int(11) DEFAULT NULL,
  `observacao` varchar(255) DEFAULT NULL,
  `cell1` int(11) DEFAULT NULL,
  `cell2` int(11) DEFAULT NULL,
  `valor_limite_emprestimo` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `cliente`
--

TRUNCATE TABLE `cliente`;
--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `nome_cliente`, `id_endereco`, `observacao`, `cell1`, `cell2`, `valor_limite_emprestimo`) VALUES
(1, 'Silverio', 17, 'o senhor silverio nao paga sempre as dividas', 43456789, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente_perfil`
--

DROP TABLE IF EXISTS `cliente_perfil`;
CREATE TABLE IF NOT EXISTS `cliente_perfil` (
  `id_cliente_perfil` int(11) NOT NULL,
  `cadastrar_cliente` tinyint(1) NOT NULL,
  `excluir_cliente` tinyint(1) NOT NULL,
  `actualizar_cliente` tinyint(1) NOT NULL,
  `tela_cliente` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `cliente_perfil`
--

TRUNCATE TABLE `cliente_perfil`;
--
-- Extraindo dados da tabela `cliente_perfil`
--

INSERT INTO `cliente_perfil` (`id_cliente_perfil`, `cadastrar_cliente`, `excluir_cliente`, `actualizar_cliente`, `tela_cliente`) VALUES
(1, 1, 1, 1, 1),
(2, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `endereco`
--

DROP TABLE IF EXISTS `endereco`;
CREATE TABLE IF NOT EXISTS `endereco` (
  `id_endereco` int(11) NOT NULL,
  `avenida` varchar(25) NOT NULL,
  `bairro` varchar(25) NOT NULL,
  `quarteirao` int(11) DEFAULT NULL,
  `numero_casa` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `endereco`
--

TRUNCATE TABLE `endereco`;
--
-- Extraindo dados da tabela `endereco`
--

INSERT INTO `endereco` (`id_endereco`, `avenida`, `bairro`, `quarteirao`, `numero_casa`) VALUES
(1, 'sebastiao mabote', 'magoanine', 8, 8),
(2, 'mucungue', 'yuio;jlkh', 0, 56789),
(3, 'gfgjkhj', '457689', 16, 19),
(4, 'sebastiao mabote', 'magoanine', 8, 8),
(5, 'sebastiao mabote', 'magoanine', 8, 8),
(6, 'paulo samuel magaia', 'bagamoio', 16, 19),
(7, 'muchungue', 'Maotas', 0, 56789),
(8, 'angola', 'mafalala', 8, 6),
(9, 'muchungue', 'Maotas', 0, 56789),
(10, 'Joaquim Chissano', 'urbanizacao', 4, 24),
(11, 'marcos sebastiao mabote', 'magoanine', 5, 6),
(12, 'marcos sebastiao mabote', 'magoanine', 5, 6),
(13, 'paulo samuel magaia', 'bagamoio', 16, 19),
(14, 'paulo samuel magaia', 'bagamoio', 16, 19),
(15, 'muchungue', 'Maotas', 0, 56789),
(16, 'muchungue', 'Maotas', 0, 56789),
(17, 'paulo samuel magaia', 'bagamoio', 16, 19),
(18, 'muchungue', 'Maotas', 0, 56789);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
CREATE TABLE IF NOT EXISTS `fornecedor` (
  `id_fornecedor` int(11) NOT NULL,
  `nome_fornecedor` varchar(35) NOT NULL,
  `email` varchar(20) DEFAULT NULL,
  `id_endereco` int(11) NOT NULL,
  `cell1` int(11) DEFAULT NULL,
  `cell2` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `fornecedor`
--

TRUNCATE TABLE `fornecedor`;
--
-- Extraindo dados da tabela `fornecedor`
--

INSERT INTO `fornecedor` (`id_fornecedor`, `nome_fornecedor`, `email`, `id_endereco`, `cell1`, `cell2`) VALUES
(1, 'jacama', 'malanga@gmail.com', 18, 456789, 345467);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedor_perfil`
--

DROP TABLE IF EXISTS `fornecedor_perfil`;
CREATE TABLE IF NOT EXISTS `fornecedor_perfil` (
  `id_fornecedor_perfil` int(11) NOT NULL,
  `cadastrar_fornecedor` tinyint(1) NOT NULL,
  `excluir_fornecedor` tinyint(1) NOT NULL,
  `actualizar_fornecedor` tinyint(1) NOT NULL,
  `tela_fornecedor` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `fornecedor_perfil`
--

TRUNCATE TABLE `fornecedor_perfil`;
--
-- Extraindo dados da tabela `fornecedor_perfil`
--

INSERT INTO `fornecedor_perfil` (`id_fornecedor_perfil`, `cadastrar_fornecedor`, `excluir_fornecedor`, `actualizar_fornecedor`, `tela_fornecedor`) VALUES
(1, 1, 1, 1, 1),
(2, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_venda`
--

DROP TABLE IF EXISTS `item_venda`;
CREATE TABLE IF NOT EXISTS `item_venda` (
  `id_produto` int(11) NOT NULL,
  `id_venda` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `subtotal` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `item_venda`
--

TRUNCATE TABLE `item_venda`;
--
-- Extraindo dados da tabela `item_venda`
--

INSERT INTO `item_venda` (`id_produto`, `id_venda`, `quantidade`, `subtotal`) VALUES
(20, 10, 7, 3850),
(19, 13, 67, 29681),
(22, 13, 11, 550),
(20, 14, 3, 1650),
(22, 14, 1, 50),
(23, 14, 2, 80),
(7, 15, 2, 200),
(8, 17, 8, 71104),
(19, 17, 2, 886),
(20, 17, 3, 1650),
(23, 17, 4, 160),
(21, 18, 1, 20),
(7, 19, 8, 800),
(7, 20, 2, 200),
(8, 20, 21, 186648),
(20, 20, 21, 11550),
(7, 21, 5, 500),
(8, 21, 3, 26664),
(19, 21, 11, 4873),
(20, 21, 14, 7700),
(23, 21, 11, 440),
(7, 22, 2, 200),
(20, 22, 2, 1100),
(7, 23, 11, 1100),
(20, 23, 3, 1650),
(20, 24, 2, 1100),
(22, 24, 3, 150),
(23, 24, 20, 800),
(7, 28, 1, 100),
(8, 28, 8, 71104),
(19, 28, 4, 1772),
(20, 28, 2, 1100),
(22, 28, 5, 250),
(7, 30, 1, 100),
(7, 31, 1, 100),
(8, 31, 5, 44440),
(19, 31, 21, 9303),
(20, 31, 1, 550),
(21, 31, 12, 240),
(22, 31, 32, 1600),
(23, 31, 2, 80),
(7, 32, 12, 1200);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento_emprestimo`
--

DROP TABLE IF EXISTS `pagamento_emprestimo`;
CREATE TABLE IF NOT EXISTS `pagamento_emprestimo` (
  `id_pagamento` int(11) NOT NULL,
  `data_pagamento` datetime NOT NULL,
  `valor_pago` double NOT NULL,
  `troco` double NOT NULL,
  `id_venda` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `pagamento_emprestimo`
--

TRUNCATE TABLE `pagamento_emprestimo`;
--
-- Extraindo dados da tabela `pagamento_emprestimo`
--

INSERT INTO `pagamento_emprestimo` (`id_pagamento`, `data_pagamento`, `valor_pago`, `troco`, `id_venda`) VALUES
(2, '2015-12-21 10:19:35', 4000, 150, 10),
(3, '2015-12-29 11:59:58', 43666, 13435, 13),
(4, '2015-12-29 20:45:38', 2000, 220, 14),
(5, '2015-12-29 21:55:10', 200, 0, 15),
(6, '2015-12-30 19:32:31', 100000, 26200, 17),
(7, '2016-01-04 22:13:25', 21, 1, 18),
(8, '2016-01-04 22:19:05', 1000, 200, 19),
(9, '2016-01-05 07:56:03', 400000, 201602, 20),
(10, '2016-01-05 08:59:47', 50000, 9823, 21),
(11, '2016-01-05 09:14:51', 1300, 0, 22),
(12, '2016-01-05 15:28:29', 5000, 2250, 23),
(13, '2016-01-26 12:58:30', 2100, 50, 24),
(14, '2016-02-11 09:10:54', 89000, 14674, 28),
(15, '2016-02-11 21:35:04', 57000, 687, 31),
(16, '2016-03-14 09:44:01', 2000, 800, 32);

-- --------------------------------------------------------

--
-- Estrutura da tabela `perfil`
--

DROP TABLE IF EXISTS `perfil`;
CREATE TABLE IF NOT EXISTS `perfil` (
  `id_perfil` int(11) NOT NULL,
  `perfil_nome` varchar(45) NOT NULL,
  `id_usuario_perfil` int(11) NOT NULL,
  `id_produto_perfil` int(11) NOT NULL,
  `id_relatorio_perfil` int(11) NOT NULL,
  `id_vendas_perfil` int(11) NOT NULL,
  `id_fornecedor_perfil` int(11) NOT NULL,
  `id_cliente_perfil` int(11) NOT NULL,
  `perfil_tela` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `perfil`
--

TRUNCATE TABLE `perfil`;
--
-- Extraindo dados da tabela `perfil`
--

INSERT INTO `perfil` (`id_perfil`, `perfil_nome`, `id_usuario_perfil`, `id_produto_perfil`, `id_relatorio_perfil`, `id_vendas_perfil`, `id_fornecedor_perfil`, `id_cliente_perfil`, `perfil_tela`) VALUES
(1, 'Administrador', 1, 1, 1, 1, 1, 1, 1),
(2, 'Caixa', 2, 2, 2, 2, 2, 2, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `id_produto` int(11) NOT NULL,
  `nome_produto` varchar(30) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor_compra` double NOT NULL,
  `valor_venda` double NOT NULL,
  `estoque_max` int(11) NOT NULL,
  `estoque_min` int(11) NOT NULL,
  `unidade` varchar(15) NOT NULL,
  `desconto` double NOT NULL,
  `validade` date NOT NULL,
  `id_tipoProduto` int(11) NOT NULL,
  `codigo_barras` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `produto`
--

TRUNCATE TABLE `produto`;
--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id_produto`, `nome_produto`, `quantidade`, `valor_compra`, `valor_venda`, `estoque_max`, `estoque_min`, `unidade`, `desconto`, `validade`, `id_tipoProduto`, `codigo_barras`) VALUES
(7, 'castanhas', 90, 75, 100, 1000, 10, 'Kg', 0, '2015-11-05', 1, 34879),
(8, 'feijao', 169, 40, 60, 445, 6, 'Kg', 0, '2015-11-04', 1, 876543),
(19, 'massala', 139, 554, 443, 554, 44, 'Kg', 0, '2015-11-02', 1, 65),
(20, 'tomate', 100, 500, 550, 89, 10, 'Kg', 0, '2015-11-25', 1, 4443),
(21, 'mangas', 163, 15, 20, 100, 5, 'Kg', 0, '2015-12-30', 1, 10000),
(22, 'papaia', 100, 40, 50, 50, 10, 'Saco', 0, '2016-12-04', 2, 8878765),
(23, 'Cebola', 242, 30, 40, 1000, 20, 'Kg', 0, '2016-01-30', 1, 7777);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto_fornecedor`
--

DROP TABLE IF EXISTS `produto_fornecedor`;
CREATE TABLE IF NOT EXISTS `produto_fornecedor` (
  `id_produto` int(11) NOT NULL,
  `id_fornecedor` int(11) DEFAULT NULL,
  `auxiliar` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `produto_fornecedor`
--

TRUNCATE TABLE `produto_fornecedor`;
--
-- Extraindo dados da tabela `produto_fornecedor`
--

INSERT INTO `produto_fornecedor` (`id_produto`, `id_fornecedor`, `auxiliar`) VALUES
(20, NULL, 'Nulo'),
(21, 1, 'Nulo'),
(22, 1, 'Nulo'),
(23, NULL, 'Nulo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto_perfil`
--

DROP TABLE IF EXISTS `produto_perfil`;
CREATE TABLE IF NOT EXISTS `produto_perfil` (
  `id_produto_perfil` int(11) NOT NULL,
  `cadastrar_produto` tinyint(1) NOT NULL,
  `excluir_produto` tinyint(1) NOT NULL,
  `actualizar_produto` tinyint(1) NOT NULL,
  `tela_produto` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `produto_perfil`
--

TRUNCATE TABLE `produto_perfil`;
--
-- Extraindo dados da tabela `produto_perfil`
--

INSERT INTO `produto_perfil` (`id_produto_perfil`, `cadastrar_produto`, `excluir_produto`, `actualizar_produto`, `tela_produto`) VALUES
(1, 1, 1, 1, 1),
(2, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `relatorio_entrada`
--

DROP TABLE IF EXISTS `relatorio_entrada`;
CREATE TABLE IF NOT EXISTS `relatorio_entrada` (
  `id_r_entrada` int(11) NOT NULL,
  `quant_anterior_r` int(11) NOT NULL,
  `acrescimo` int(11) NOT NULL,
  `quantidade_posterior_r` int(11) NOT NULL,
  `data` datetime NOT NULL,
  `id_produto` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `relatorio_entrada`
--

TRUNCATE TABLE `relatorio_entrada`;
--
-- Extraindo dados da tabela `relatorio_entrada`
--

INSERT INTO `relatorio_entrada` (`id_r_entrada`, `quant_anterior_r`, `acrescimo`, `quantidade_posterior_r`, `data`, `id_produto`) VALUES
(2, 23, 23, 46, '2015-11-01 21:00:58', 7),
(3, 261, 87, 174, '2015-11-01 21:13:26', 8),
(12, 76, 76, 152, '2015-11-02 01:11:14', 19),
(13, 42, 19, 61, '2015-11-02 12:04:12', 7),
(14, 161, 100, 261, '2015-11-02 15:17:51', 7),
(15, 407, 130, 267, '2015-11-04 16:32:42', 7),
(16, 0, 60, 60, '2015-11-25 15:50:40', 20),
(17, 0, 30, 30, '2015-11-27 18:23:25', 21),
(18, 0, 30, 30, '2015-12-04 18:20:27', 22),
(19, 40, 5, 40, '2015-12-04 18:22:21', 22),
(20, 68, 50, 118, '2015-12-29 20:38:49', 20),
(21, 0, 300, 300, '2015-12-29 20:41:09', 23),
(22, 40, 40, 80, '2016-01-05 15:35:30', 22),
(23, 180, 90, 180, '2016-01-26 12:53:16', 21),
(24, 100, 50, 100, '2016-02-11 21:39:53', 20),
(25, 100, 100, 200, '2016-02-11 21:40:16', 22),
(26, 80, 80, 160, '2016-02-11 21:40:33', 19),
(27, 110, 80, 190, '2016-02-12 23:25:52', 7),
(28, 139, 69, 208, '2016-03-14 09:47:33', 19);

-- --------------------------------------------------------

--
-- Estrutura da tabela `relatorio_perfil`
--

DROP TABLE IF EXISTS `relatorio_perfil`;
CREATE TABLE IF NOT EXISTS `relatorio_perfil` (
  `id_relatorio_perfil` int(11) NOT NULL,
  `acederREntrada` tinyint(1) NOT NULL,
  `acederRSaida` tinyint(1) NOT NULL,
  `acederREstoque` tinyint(1) NOT NULL,
  `abaixo_prazo` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `relatorio_perfil`
--

TRUNCATE TABLE `relatorio_perfil`;
--
-- Extraindo dados da tabela `relatorio_perfil`
--

INSERT INTO `relatorio_perfil` (`id_relatorio_perfil`, `acederREntrada`, `acederRSaida`, `acederREstoque`, `abaixo_prazo`) VALUES
(1, 1, 1, 1, 1),
(2, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipoproduto`
--

DROP TABLE IF EXISTS `tipoproduto`;
CREATE TABLE IF NOT EXISTS `tipoproduto` (
  `id_tipoProduto` int(11) NOT NULL,
  `nome_tipo` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `tipoproduto`
--

TRUNCATE TABLE `tipoproduto`;
--
-- Extraindo dados da tabela `tipoproduto`
--

INSERT INTO `tipoproduto` (`id_tipoProduto`, `nome_tipo`) VALUES
(1, 'cereais'),
(2, 'conservas'),
(3, 'latas');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nome_usuario` varchar(30) NOT NULL,
  `sexo_usuario` varchar(15) NOT NULL,
  `imagem` blob NOT NULL,
  `username` varchar(15) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `id_endereco` int(11) NOT NULL,
  `cell1` int(11) DEFAULT NULL,
  `cell2` int(11) DEFAULT NULL,
  `id_perfil` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `usuario`
--

TRUNCATE TABLE `usuario`;
--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nome_usuario`, `sexo_usuario`, `imagem`, `username`, `senha`, `id_endereco`, `cell1`, `cell2`, `id_perfil`) VALUES
(3, 'xiquino', 'Masculino', '', 'camacho', '77', 10, 987887, 820033382, 2),
(4, 'Camal', 'Masculino', '', 'mana', '0000', 12, 6656565, 88776, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario_perfil`
--

DROP TABLE IF EXISTS `usuario_perfil`;
CREATE TABLE IF NOT EXISTS `usuario_perfil` (
  `id_usuario_perfil` int(11) NOT NULL,
  `cadastrar_usuario` tinyint(1) NOT NULL,
  `excluir_usuario` tinyint(1) NOT NULL,
  `actualizar_usuario` tinyint(1) NOT NULL,
  `tela_usuario` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `usuario_perfil`
--

TRUNCATE TABLE `usuario_perfil`;
--
-- Extraindo dados da tabela `usuario_perfil`
--

INSERT INTO `usuario_perfil` (`id_usuario_perfil`, `cadastrar_usuario`, `excluir_usuario`, `actualizar_usuario`, `tela_usuario`) VALUES
(1, 1, 1, 1, 1),
(2, 0, 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

DROP TABLE IF EXISTS `venda`;
CREATE TABLE IF NOT EXISTS `venda` (
  `id_venda` int(11) NOT NULL,
  `custo_total` double NOT NULL,
  `dataE_hora` datetime NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `venda`
--

TRUNCATE TABLE `venda`;
--
-- Extraindo dados da tabela `venda`
--

INSERT INTO `venda` (`id_venda`, `custo_total`, `dataE_hora`, `id_cliente`, `id_usuario`) VALUES
(10, 3850, '2015-12-21 10:19:11', 1, 4),
(13, 30231, '2015-12-29 11:59:10', 1, 4),
(14, 1780, '2015-12-29 20:45:10', 1, 4),
(15, 200, '2015-12-29 21:54:25', NULL, 4),
(17, 73800, '2015-12-30 19:32:19', 1, 4),
(18, 20, '2016-01-04 22:13:19', NULL, 4),
(19, 800, '2016-01-04 22:18:54', 1, 4),
(20, 198398, '2016-01-05 07:55:41', NULL, 4),
(21, 40177, '2016-01-05 08:59:31', NULL, 4),
(22, 1300, '2016-01-05 09:14:42', NULL, 3),
(23, 2750, '2016-01-05 15:28:12', NULL, 4),
(24, 2050, '2016-01-26 12:57:24', 1, 4),
(28, 74326, '2016-02-11 09:09:02', NULL, 4),
(30, 100, '2016-02-11 09:55:59', NULL, 4),
(31, 56313, '2016-02-11 21:34:37', NULL, 4),
(32, 1200, '2016-03-14 09:42:44', NULL, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas_perfil`
--

DROP TABLE IF EXISTS `vendas_perfil`;
CREATE TABLE IF NOT EXISTS `vendas_perfil` (
  `id_vendas_perfil` int(11) NOT NULL,
  `efetuar_venda` tinyint(1) NOT NULL,
  `definir_desconto` tinyint(1) NOT NULL,
  `fazer_pedidos` tinyint(1) NOT NULL,
  `fazer_cotacao` tinyint(1) NOT NULL,
  `definir_limite` tinyint(1) NOT NULL,
  `tela_venda` tinyint(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Truncate table before insert `vendas_perfil`
--

TRUNCATE TABLE `vendas_perfil`;
--
-- Extraindo dados da tabela `vendas_perfil`
--

INSERT INTO `vendas_perfil` (`id_vendas_perfil`, `efetuar_venda`, `definir_desconto`, `fazer_pedidos`, `fazer_cotacao`, `definir_limite`, `tela_venda`) VALUES
(1, 1, 1, 1, 1, 1, 1),
(2, 1, 1, 1, 1, 1, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`), ADD KEY `fk_cliente_endereco1_idx` (`id_endereco`);

--
-- Indexes for table `cliente_perfil`
--
ALTER TABLE `cliente_perfil`
  ADD PRIMARY KEY (`id_cliente_perfil`);

--
-- Indexes for table `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`id_endereco`);

--
-- Indexes for table `fornecedor`
--
ALTER TABLE `fornecedor`
  ADD PRIMARY KEY (`id_fornecedor`), ADD KEY `fk_fornecedor_endereco1_idx` (`id_endereco`);

--
-- Indexes for table `fornecedor_perfil`
--
ALTER TABLE `fornecedor_perfil`
  ADD PRIMARY KEY (`id_fornecedor_perfil`);

--
-- Indexes for table `item_venda`
--
ALTER TABLE `item_venda`
  ADD PRIMARY KEY (`id_venda`,`id_produto`), ADD KEY `fk_produto_has_venda_venda1_idx` (`id_venda`), ADD KEY `fk_produto_has_venda_produto1_idx` (`id_produto`);

--
-- Indexes for table `pagamento_emprestimo`
--
ALTER TABLE `pagamento_emprestimo`
  ADD PRIMARY KEY (`id_pagamento`), ADD KEY `fk_pagamento_emprestimo_venda1_idx` (`id_venda`);

--
-- Indexes for table `perfil`
--
ALTER TABLE `perfil`
  ADD PRIMARY KEY (`id_perfil`), ADD KEY `fk_perfil_usuario_perfil1_idx` (`id_usuario_perfil`), ADD KEY `fk_perfil_produto_perfil1_idx` (`id_produto_perfil`), ADD KEY `fk_perfil_relatorio_perfil1_idx` (`id_relatorio_perfil`), ADD KEY `fk_perfil_vendas_perfil1_idx` (`id_vendas_perfil`), ADD KEY `fk_perfil_fornecedor_perfil1_idx` (`id_fornecedor_perfil`), ADD KEY `fk_perfil_cliente_perfil1_idx` (`id_cliente_perfil`);

--
-- Indexes for table `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id_produto`), ADD UNIQUE KEY `nome_produto_UNIQUE` (`nome_produto`), ADD UNIQUE KEY `codigo_barras_UNIQUE` (`codigo_barras`), ADD UNIQUE KEY `id_produto_UNIQUE` (`id_produto`), ADD KEY `fk_produto_tipoProduto1_idx` (`id_tipoProduto`);

--
-- Indexes for table `produto_fornecedor`
--
ALTER TABLE `produto_fornecedor`
  ADD PRIMARY KEY (`id_produto`), ADD KEY `fk_produto_has_fornecedor_fornecedor1_idx` (`id_fornecedor`), ADD KEY `fk_produto_has_fornecedor_produto1_idx` (`id_produto`);

--
-- Indexes for table `produto_perfil`
--
ALTER TABLE `produto_perfil`
  ADD PRIMARY KEY (`id_produto_perfil`);

--
-- Indexes for table `relatorio_entrada`
--
ALTER TABLE `relatorio_entrada`
  ADD PRIMARY KEY (`id_r_entrada`), ADD KEY `fk_relatorio_entrada_produto1_idx` (`id_produto`);

--
-- Indexes for table `relatorio_perfil`
--
ALTER TABLE `relatorio_perfil`
  ADD PRIMARY KEY (`id_relatorio_perfil`);

--
-- Indexes for table `tipoproduto`
--
ALTER TABLE `tipoproduto`
  ADD PRIMARY KEY (`id_tipoProduto`), ADD UNIQUE KEY `nome_tipo_UNIQUE` (`nome_tipo`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`), ADD KEY `fk_usuario_endereco1_idx` (`id_endereco`), ADD KEY `fk_usuario_perfil1_idx` (`id_perfil`);

--
-- Indexes for table `usuario_perfil`
--
ALTER TABLE `usuario_perfil`
  ADD PRIMARY KEY (`id_usuario_perfil`);

--
-- Indexes for table `venda`
--
ALTER TABLE `venda`
  ADD PRIMARY KEY (`id_venda`), ADD KEY `fk_venda_cliente1_idx` (`id_cliente`), ADD KEY `fk_venda_usuario1_idx` (`id_usuario`);

--
-- Indexes for table `vendas_perfil`
--
ALTER TABLE `vendas_perfil`
  ADD PRIMARY KEY (`id_vendas_perfil`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `cliente_perfil`
--
ALTER TABLE `cliente_perfil`
  MODIFY `id_cliente_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `endereco`
--
ALTER TABLE `endereco`
  MODIFY `id_endereco` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `fornecedor`
--
ALTER TABLE `fornecedor`
  MODIFY `id_fornecedor` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `fornecedor_perfil`
--
ALTER TABLE `fornecedor_perfil`
  MODIFY `id_fornecedor_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `pagamento_emprestimo`
--
ALTER TABLE `pagamento_emprestimo`
  MODIFY `id_pagamento` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `perfil`
--
ALTER TABLE `perfil`
  MODIFY `id_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `produto`
--
ALTER TABLE `produto`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `produto_perfil`
--
ALTER TABLE `produto_perfil`
  MODIFY `id_produto_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `relatorio_entrada`
--
ALTER TABLE `relatorio_entrada`
  MODIFY `id_r_entrada` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT for table `relatorio_perfil`
--
ALTER TABLE `relatorio_perfil`
  MODIFY `id_relatorio_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tipoproduto`
--
ALTER TABLE `tipoproduto`
  MODIFY `id_tipoProduto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `usuario_perfil`
--
ALTER TABLE `usuario_perfil`
  MODIFY `id_usuario_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `venda`
--
ALTER TABLE `venda`
  MODIFY `id_venda` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=33;
--
-- AUTO_INCREMENT for table `vendas_perfil`
--
ALTER TABLE `vendas_perfil`
  MODIFY `id_vendas_perfil` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `cliente`
--
ALTER TABLE `cliente`
ADD CONSTRAINT `fk_cliente_endereco1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id_endereco`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `fornecedor`
--
ALTER TABLE `fornecedor`
ADD CONSTRAINT `fk_fornecedor_endereco1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id_endereco`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `item_venda`
--
ALTER TABLE `item_venda`
ADD CONSTRAINT `fk_produto_has_venda_produto1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `perfil`
--
ALTER TABLE `perfil`
ADD CONSTRAINT `fk_perfil_cliente_perfil1` FOREIGN KEY (`id_cliente_perfil`) REFERENCES `cliente_perfil` (`id_cliente_perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_perfil_fornecedor_perfil1` FOREIGN KEY (`id_fornecedor_perfil`) REFERENCES `fornecedor_perfil` (`id_fornecedor_perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_perfil_produto_perfil1` FOREIGN KEY (`id_produto_perfil`) REFERENCES `produto_perfil` (`id_produto_perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_perfil_relatorio_perfil1` FOREIGN KEY (`id_relatorio_perfil`) REFERENCES `relatorio_perfil` (`id_relatorio_perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_perfil_usuario_perfil1` FOREIGN KEY (`id_usuario_perfil`) REFERENCES `usuario_perfil` (`id_usuario_perfil`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fk_perfil_vendas_perfil1` FOREIGN KEY (`id_vendas_perfil`) REFERENCES `vendas_perfil` (`id_vendas_perfil`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `produto`
--
ALTER TABLE `produto`
ADD CONSTRAINT `fk_produto_tipoProduto1` FOREIGN KEY (`id_tipoProduto`) REFERENCES `tipoproduto` (`id_tipoProduto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `produto_fornecedor`
--
ALTER TABLE `produto_fornecedor`
ADD CONSTRAINT `fk_produto_has_fornecedor_fornecedor1` FOREIGN KEY (`id_fornecedor`) REFERENCES `fornecedor` (`id_fornecedor`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `relatorio_entrada`
--
ALTER TABLE `relatorio_entrada`
ADD CONSTRAINT `fk_relatorio_entrada_produto1` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `usuario`
--
ALTER TABLE `usuario`
ADD CONSTRAINT `fk_usuario_endereco1` FOREIGN KEY (`id_endereco`) REFERENCES `endereco` (`id_endereco`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_usuario_perfil1` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
ADD CONSTRAINT `fk_venda_cliente1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id_cliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
ADD CONSTRAINT `fk_venda_usuario1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
