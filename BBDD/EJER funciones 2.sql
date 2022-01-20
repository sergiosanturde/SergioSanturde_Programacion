USE instituto;

/*SELECT nombre, reverse(nombre) FROM alumno;*/
/*SELECT concat_ws(nombre,apellido1,apellido2), reverse( concat_ws(nombre,apellido1,apellido2)) FROM alumno;*/
/*SELECT UPPER(concat_ws(nombre,apellido1,apellido2)), reverse(lower (concat_ws(nombre,apellido1,apellido2))) FROM alumno;*/
/*SELECT concat_ws(nombre,apellido1,apellido2),char_length(concat_ws(nombre,apellido1,apellido2)),length(concat_ws(nombre,apellido1,apellido2)) FROM alumno;*/
/*SELECT concat_ws('.',nombre,apellido1),concat(lower(concat_ws('.',nombre,apellido1)),'@iescelia.org') FROM alumno;*/
SELECT concat_ws('.',nombre,apellido1),concat(lower(concat_ws('.',nombre,apellido1)),'@iescelia.org'), concat(reverse(apellido1),year(fecha_nacimiento)) FROM alumno;