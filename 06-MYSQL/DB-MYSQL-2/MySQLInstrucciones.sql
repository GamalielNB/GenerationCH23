-- Seleccionar base de datos

USE business;

-- Ver todos los registros de una tabla
SELECT * FROM employee;

-- Alias

SELECT last_name AS "Apellido" FROM employee;

-- Alias ++

SELECT 
employee_id AS "ID",
first_name AS "Nombre",
last_name AS "Apellido",
department AS "Deparatamento"

FROM employee;

-- Filtrar por nombre BUSCAR Monika
SELECT	* FROM employee 
WHERE first_name = "Monika";

-- Doble filtro

SELECT * FROM employee
WHERE salary = 500000;

SELECT * FROM employee
WHERE NOT first_name = "Barrack";

-- Filtrar por doble negación

SELECT * FROM employee
WHERE NOT first_name = "Santiado" AND NOT first_name = "Ian";

SELECT * FROM employee
WHERE salary >= 200000;

-- Ordenamiento
-- ORDER BY
-- Por default el ordenamiento es ascendente ASC

SELECT * FROM employee
ORDER BY department DESC;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;