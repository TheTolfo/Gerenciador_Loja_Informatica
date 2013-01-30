-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 
-- Versão do Servidor: 5.5.24-log
-- Versão do PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `t5_final`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `Login` varchar(45) DEFAULT NULL,
  `Senha` varchar(45) DEFAULT NULL,
  `Frase` varchar(45) DEFAULT NULL,
  `Nome` varchar(70) DEFAULT NULL,
  `Endereco` varchar(200) DEFAULT NULL,
  `CEP` varchar(45) DEFAULT NULL,
  `Reputacao` int(10) unsigned DEFAULT NULL,
  `ADM` tinyint(1) DEFAULT NULL,
  `ADM_princ` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=5 ;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idCliente`, `Login`, `Senha`, `Frase`, `Nome`, `Endereco`, `CEP`, `Reputacao`, `ADM`, `ADM_princ`) VALUES
(1, 'TheTolfo', '123456', 'Oi', 'Robson Tolfo', 'Rua Ouro Preto nº152', '97105-290', 0, 1, 1),
(2, 'Ronai', '1999324', 'ola', 'Ronai Savegnago Ribeiro', 'Julio de Castilhos nº 1993', '97200000', 0, 1, 1),
(3, 'ADM', 'ADM', 'ADM', 'ADM', 'ADM', 'ADM', 0, 1, 0),
(4, 'ronaldo', 'ronaldo', 'ronaldo', 'ronaldo', 'ronaldo', 'ronaldo', 0, 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(45) DEFAULT NULL,
  `Descricao` varchar(255) DEFAULT NULL,
  `Quantia` int(10) unsigned DEFAULT NULL,
  `Preco` double unsigned DEFAULT NULL,
  `Desconto` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`idProduto`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`idProduto`, `Nome`, `Descricao`, `Quantia`, `Preco`, `Desconto`) VALUES
(1, 'Mouse Mousado', 'Mouse de 1600 dpi, com cabo de 2m e conexão usb.', 10, 5, 1),
(2, 'Teclado Tecladex', 'O melhor teclado do mundo', 56, 35.3, 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
