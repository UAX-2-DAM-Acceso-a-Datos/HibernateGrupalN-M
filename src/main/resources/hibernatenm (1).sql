-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2022 a las 08:57:29
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hibernatenm`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `repuestos`
--

CREATE TABLE `repuestos` (
  `id` int(10) UNSIGNED NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `repuestos`
--

INSERT INTO `repuestos` (`id`, `nombre`, `descripcion`) VALUES
(1, 'Repuesto', 'Repuetoprueba'),
(2, 'Repuesto', 'Repuetoprueba'),
(3, 'Repuesto', 'Repuetoprueba'),
(4, 'Repuesto', 'Repuetoprueba');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos`
--

CREATE TABLE `vehiculos` (
  `matricula` varchar(100) NOT NULL,
  `modelo` varchar(100) NOT NULL,
  `marca` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vehiculos`
--

INSERT INTO `vehiculos` (`matricula`, `modelo`, `marca`) VALUES
('123456', '306', 'Peugeot'),
('234556', '306', 'peugeot');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculos_repuestos`
--

CREATE TABLE `vehiculos_repuestos` (
  `matricula` varchar(100) NOT NULL,
  `id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vehiculos_repuestos`
--

INSERT INTO `vehiculos_repuestos` (`matricula`, `id`) VALUES
('123456', 1),
('234556', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `repuestos`
--
ALTER TABLE `repuestos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vehiculos`
--
ALTER TABLE `vehiculos`
  ADD PRIMARY KEY (`matricula`);

--
-- Indices de la tabla `vehiculos_repuestos`
--
ALTER TABLE `vehiculos_repuestos`
  ADD PRIMARY KEY (`matricula`,`id`),
  ADD KEY `id` (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `repuestos`
--
ALTER TABLE `repuestos`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `vehiculos_repuestos`
--
ALTER TABLE `vehiculos_repuestos`
  ADD CONSTRAINT `vehiculos_repuestos_ibfk_1` FOREIGN KEY (`id`) REFERENCES `repuestos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `vehiculos_repuestos_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `vehiculos` (`matricula`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
