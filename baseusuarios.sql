-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-10-2020 a las 19:05:22
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `baseusuarios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `usuario` text NOT NULL,
  `auth` text NOT NULL,
  `nombre` text NOT NULL,
  `area` text NOT NULL,
  `ubicacion` text NOT NULL,
  `segmento` int(11) NOT NULL,
  `perfil` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `usuario`, `auth`, `nombre`, `area`, `ubicacion`, `segmento`, `perfil`) VALUES
(1, 'AndArt', 'qwerty', 'Andrea Arteaga Gonzalez', 'Comercial', 'Queretaro', 0, 0),
(2, 'EduardoE', 'ABC123', 'Eduardo Emmanuel Lopez Contreras', 'Sucursales', 'Monterrey', 1, 0),
(3, 'Gustavo_Moreno', '456098', 'Gustavo Moreno Rayon', 'Datos', 'Guadalajara', 2, 0),
(4, 'ENM', 'nkdk3Cs', 'Elisa Navarro Martinez', 'Banca digital', 'CDMX', 0, 1),
(5, 'augusto', 'password', 'Augusto Sanchez Contreras', 'Control', 'Veracruz', 1, 1),
(6, 'pacoG', 'franK', 'Francisco Gamboa Cardenas', 'Auditoria', 'Puebla', 2, 1),
(7, 'RaVen_1', 'pass123', 'Raymundo Venegas Rangel', 'Sucursales', 'Tlaxcala', 0, 2),
(8, 'katy', 'KatiaFlores', 'Katia Flores Estrada', 'Ventas', 'SLP', 1, 2),
(9, 'angelperea', '4ng3lPer', 'Angel Perea Lin', 'Cajeros', 'Nayarit', 2, 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
