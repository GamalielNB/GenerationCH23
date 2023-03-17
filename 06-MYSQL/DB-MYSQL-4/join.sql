-- INNER JOIN
-- t.students t.countries

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students
ORDER BY course_code;
SELECT * FROM courses;
SELECT * FROM modules;

-- encontrar a que pais pertenece
SELECT
 students.idStudent AS "ID",
 students.name, 
 students.last_name,
 countries.name, 
 countries.code
FROM students -- Tabla A
INNER JOIN countries -- Tabla B
ON
students.nationality= countries.idCountries; -- PK = FK

-- encontramos que tipo de ID tiene la raza

SELECT
 students.IdType_id AS "ID",
 students.name AS "Nombre", 
 students.last_name AS "Apellido",
idtypes.name AS "Tipos de ID de registro"
FROM students -- Tabla A
INNER JOIN idtypes -- Tabla B
ON
idtypes.id_idTypes = students.idType_id;


-- Abreviaciones (cambiar el encabezado de la tabla)

SELECT
 t1.name, 
 t2.name, 
 t2.code
FROM students t1 -- Tabla A
INNER JOIN countries t2 -- Tabla B
ON
t1.nationality= t2.idCountries; -- PK = FK

-- Encontrar estudiantes que esten registrados en un curso
-- Nombre de estudiante, id, apellido, curso al que pertenecen

SELECT
students.name,
students.last_name,
students.idStudent,
courses_has_students.course_code
FROM students
INNER JOIN courses_has_students
ON
courses_has_students.students_id_student= students.idStudent;

-- Hacer 2 uniones
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

-- agrupar

SELECT 
t1.course_code AS "Codigo de curso",
t2.code AS "Codigo de curso",
t2.name AS "Curso"
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code =t2.code
GROUP BY t2.code;


-- Encontrar estudiantes que sean del pais 125

SELECT name, last_name, nationality FROM students
WHERE nationality = 125;


-- contar estudiantes que pertenezcan la curso JAVA-1

SELECT COUNT(DISTINCT students_id_student) AS "Total de estudiantes en cursos de JAVA"
FROM courses_has_students
WHERE course_code LIKE '%JAVA-1';

-- estudiantes por modulo

/*
SELECT
t4.name AS 'modulo',
count(t1.idStudent) AS 'Numero de estudiantes'
FROM students t1
JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
JOIN courses t3
ON t2.course_code = t3.code
JOIN modules t4
ON t3.module_code = t4.code
group by t4.code
order by count(t1.idStudent);
*/

SELECT m.name AS modulo,
	COUNT(DISTINCT chs.students_id_student) AS cantidad_alumnos
FROM courses_has_students chs
INNER JOIN courses c 
ON chs.course_code = c.code

INNER JOIN generation.modules m 
ON c.module_code = m.code

GROUP BY m.name;


-- Encontrar estudiantes SIN curso



SELECT s.name, s.last_name, 
	COUNT(chs.course_code) AS cantidad_cursos
FROM students s
LEFT JOIN courses_has_students chs 
ON 
s.idStudent = chs.students_id_student AND s.IdType_id = chs.students_id_type_id
WHERE chs.course_code IS NULL
GROUP BY s.idStudent, s.name, s.last_name;

SELECT COUNT(*) AS cantidad_estudiantes_sin_curso
FROM generation.students
WHERE idStudent NOT IN (SELECT DISTINCT students_id_student FROM generation.courses_has_students);


