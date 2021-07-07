USE autos;

-- CREAMOS LA CONSULTA PREPARADA
PREPARE INSERTAR FROM "INSERT INTO familiar 
(patenteNumero, patenteActiva, marca, categoria, color, encendido)
VALUES  (?, ?, ?, ?, ?, ?);";

-- SETEAMOS LAS VARIABLES 
SET @patenteNumero  = 'ABC-001';
SET @patenteActiva = 1;
SET @marca = 'Audi';
SET @categoria = 'SEDAN';
SET @Color = 'ROJO';
SET @encendido =  6;

-- EJECUTAR LA CONSULTA PREPARADA
EXECUTE INSERTAR USING @patenteNumero, @patenteActiva, @marca, @categoria, @Color, @encendido;

-- SETEAMOS LAS VARIABLES 
SET @patenteNumero  = 'ZXM-901';
SET @patenteActiva = 1;
SET @marca = 'Ford';
SET @categoria = 'COMPACTO';
SET @Color = 'NEGRO';
SET @encendido =  4;

-- EJECUTAR LA CONSULTA PREPARADA
EXECUTE INSERTAR USING @patenteNumero, @patenteActiva, @marca, @categoria, @Color, @encendido;

