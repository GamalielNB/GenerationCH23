-- Selecciona todo de una tabla
SELECT * FROM users;

-- Seleccionar solo una columna

SELECT first_name FROM users;


-- renombrar columna
ALTER TABLE pets;

-- Insertar datos a tabla pets
INSERT INTO pets 
(first_name, fav_food, `type`, users_idusers)
VALUES
("Griselo", "Fresas", "Nejo", 1),
("Nicky", "Chilaquiles", "Doggo", 2),
("Pepperoni", "Huesitos de manzanas", "Doggo", 3),
("Pepe", "Semillas de girasol", "Cotorro",3);

-- Filtrar por FK para identificar a owners

SELECT * FROM pets
WHERE users_idusers = 3;

-- actividad equipo: Agregar al menos un usuario y 1 mascota por equipo

-- Usuario

INSERT INTO `users`
(first_name, last_name, fav_food)
VALUES
("Emilio", "Santos", "Tacos de guiso"),
("Gamaliel", "Naranjo", "Aguachile "),
("Brandon", "Moreles", "Tacos al vapor"),
('Raúl', 'Martínez', 'Sushi');

INSERT into `pets`
(first_name, fav_food, `type`, users_idusers )
VALUES
('Sam', 'Huesos','perro', 4),
("Concreto", "Sobre de res", "Neko", 5 ),
("Yuni", "bytes", "cat", 6),
('Bachi', 'Come todo pero secuestraba rocas', 'Lomito', 7);

