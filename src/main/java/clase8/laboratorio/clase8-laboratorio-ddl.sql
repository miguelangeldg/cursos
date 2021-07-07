******************************************************************************
									DDL INICIAL
******************************************************************************

CREATE DATABASE IF NOT EXISTS personas;

USE personas;

CREATE TABLE IF NOT EXISTS director (
	id				INT NOT NULL AUTO_INCREMENT,
	nombre 			VARCHAR(30),
	apellido 		VARCHAR(20),
	tipoDocumento	VARCHAR(3),
	numeroDocumento	INT,
	fechaNacimiento	DATE, 
    fechaCargo 		DATE,
    sueldo			DOUBLE,
    carrera			VARCHAR(30),
	PRIMARY KEY(id)
);