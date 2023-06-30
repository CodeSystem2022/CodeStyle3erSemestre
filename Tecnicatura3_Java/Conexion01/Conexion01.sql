-- Comenzamos con CRUD: create(insertar), read(leer), update(actualizar), delete(eliminar)
-- Listar los estudiantes (read)
SELECT * FROM estudiantes2022;
 -- Insertar estudiante
 INSERT INTO estudiantes2022 (nombre, apellido, telefono, email) VALUES ("Juan", "Perez", "1563856425", "juan@mail.com");
 
 -- Update (modificar)
 UPDATE estudiantes2022 SET nombre="Juan Carlos", apellido="Garcia" WHERE idestudiantes=1;
 
 -- Delete(eliminar)
 DELETE FROM estudiantes2022 WHERE idestudiantes=3;
 
 -- Para modificar el idestudiantes y comience en 1 
 ALTER TABLE estudiantes2022 AUTO_INCREMENT = 1;