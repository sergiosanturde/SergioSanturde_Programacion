USE instituto;

/*SELECT fecha_nacimiento,day(fecha_nacimiento),month(fecha_nacimiento),year(fecha_nacimiento) FROM alumno;*/
/*SELECT fecha_nacimiento,dayname(fecha_nacimiento),monthname(fecha_nacimiento) FROM alumno;*/
/*SELECT fecha_nacimiento,datediff(now(),fecha_nacimiento) FROM alumno;*/
/*SELECT fecha_nacimiento,datediff(now(),fecha_nacimiento) FROM alumno;*/
SELECT fecha_nacimiento, round(datediff(now(),fecha_nacimiento)/365.25)   FROM alumno;


