******************************************************************************
								DDL INICIAL
******************************************************************************

CREATE DATABASE IF NOT EXISTS autos;

USE autos;

CREATE TABLE IF NOT EXISTS familiar (
	patenteNumero 	VARCHAR(15) NOT NULL,
	patenteActiva 	BOOLEAN DEFAULT 1,
	marca 			VARCHAR(100) NOT NULL,
	categoria 		VARCHAR(100) NOT NULL,
	color 			VARCHAR(50),	
    encendido	    BOOLEAN DEFAULT 1,    
	PRIMARY KEY(patenteNumero)
);


******************************************************************************
									INSERT
******************************************************************************


USE autos;

INSERT INTO familiar (patenteNumero, patenteActiva, marca, categoria, color, encendido)
VALUES  ('ABC-001', 1, 'Audi', 'SEDAN', 'MARRON', 1);


INSERT INTO familiar VALUES  ('ABC-002', 1, 'Ford', 'Compacto', 'NEGRO', 1);


INSERT INTO familiar (patenteNumero, patenteActiva, marca, categoria, color, encendido)
VALUES  
('ABC-003', 1, 'TATA', 		'SEDAN', 'AMARILLO', 	1),
('ABC-004', 0, 'Mercedez', 	'SEDAN', 'AZUL', 		0),
('ABC-005', 0, 'Ferrari', 	'SEDAN', 'ROJO', 		0),
('ABC-006', 1, 'Fiat', 		'SEDAN', 'VERDE', 		1);



******************************************************************************
								SELECT
******************************************************************************


USE auto;

SELECT * FROM familiar;

SELECT patenteNumero, patenteActiva, marca, categoria, color, encendido FROM familiar;

SELECT * FROM familiar WHERE patenteActiva = 1;

SELECT patenteNumero, patenteActiva, marca, categoria, color, encendido FROM familiar
WHERE encendido = 1 AND categoria = 'SEDAN';



******************************************************************************
								UPDATE
******************************************************************************


USE auto;

UPDATE familiar SET patenteActiva = 0;

UPDATE familiar SET patenteActiva = 1 WHERE patenteActiva = 0;

UPDATE familiar SET patenteActiva = 0, encendido = 0 WHERE patenteActiva = 1;



******************************************************************************
								DELETE
******************************************************************************


USE auto;

DELETE FROM familiar WHERE patenteActiva <> 0;

DELETE FROM familiar;

