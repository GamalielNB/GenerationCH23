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
ORDER BY department;

-- GROUP BY
SELECT * FROM employee
GROUP BY salary;

-- in

SELECT * FROM  employee
WHERE employee_id IN (1,3,7,8,5);

-- BETWEEN 
SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- BETWEEN NOT
SELECT * FROM employee
WHERE salary  NOT BETWEEN 200000 AND 500000;

-- limit filtra solo los x resultados 
SELECT * FROM employee
LIMIT 5;

-- limit + offset (excluye los X primeros resultados
SELECT * FROM employee
LIMIT 5 OFFSET 3;

-- like
SELECT * FROM employee
WHERE last_name LIKE '%A';

SELECT * FROM employee
WHERE last_name LIKE 'B%';

-- Actualizar dato

UPDATE employee
	SET salary = 300000
    WHERE employee_id = 1;
    
UPDATE employee
	SET join_date = "2021-12-12"
    WHERE employee_id =3;
    
SELECT * FROM employee
ORDER BY department;
    

INSERT INTO employee (first_name, last_name, salary, join_date, department)
VALUES ("Gamaliel", "Naranjo", 1000000, "2023-03-03", "CEO");

SELECT * FROM employee
ORDER BY salary;

-- MIN
SELECT MIN(salary) FROM employee;
SELECT MAX(last_name) FROM employee;

-- AVG
SELECT AVG(salary) FROM employee;

-- SUM
SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), AVG(salary) FROM employee;

-- COUNT
SELECT COUNT(DISTINCT(salary)) FROM employee;



    
    