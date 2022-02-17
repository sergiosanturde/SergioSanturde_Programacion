/*1. Lista el código de los departamentos de los empleados que aparecen en la
tabla empleado, eliminando los códigos que aparecen repetidos.
 SELECT DISTINCT codigo_departamento FROM empleado;
2. Lista el código de los empleados junto al nif, pero el nif deberá aparecer en
dos columnas, una mostrará únicamente los dígitos del nif y la otra la letra.
select codigo, left(nif,8),right(nif,1) from empleado;
3. Lista el nombre de cada departamento y el valor del presupuesto actual del
que dispone. Para calcular este dato tendrá que restar al valor del
presupuesto inicial (columna presupuesto) los gastos que se han generado
(columna gastos). Tenga en cuenta que en algunos casos pueden existir
valores negativos. Utilice un alias apropiado para la nueva columna columna
que está calculando. select nombre,presupuesto-gastos as valor from departamento;
4. Devuelve una lista con el nombre y el presupuesto, de los 3 departamentos que
tienen mayor presupuesto. select nombre,presupuesto from departamento order by presupuesto DESC limit 3;
5. Devuelve una lista con el nombre y el gasto, de los 2 departamentos que tienen
menor gasto. select nombre,presupuesto from departamento order by presupuesto ASC limit 2;
6. Devuelve una lista con el nombre de los departamentos y el gasto, de aquellos
que tienen menos de 5000 euros de gastos. select nombre,gastos from departamento where gastos < 5000;
7. Devuelve una lista con el nombre de los departamentos que tienen un
presupuesto entre 100000 y 200000 euros. Utilizando el operador BETWEEN. select nombre from departamento where presupuesto between 100000 and 200000;
8. Devuelve una lista con el nombre de los departamentos, gastos y presupuesto,
de aquellos departamentos donde los gastos sean mayores que el presupuesto del
que disponen. select nombre,gastos,presupuesto from departamento where gastos > presupuesto;
9. Devuelve una lista con el nombre de los departamentos, gastos y presupuesto,
de aquellos departamentos donde los gastos sean iguales al presupuesto del que
disponen. select nombre,gastos,presupuesto from departamento where gastos < presupuesto;
10. Lista todos los datos de los empleados cuyo segundo apellido sea NULL.
 select * from empleado where apellido2 is null;
 11. Lista todos los datos de los empleados cuyo segundo apellido sea Díaz o Moreno.
Sin utilizar el operador IN  select * from empleado where apellido2 = 'Díaz' or apellido2 =  'Moreno';
 12. Lista todos los datos de los empleados cuyo segundo apellido sea Díaz  Moreno.
Utilizando el operador IN./*select * from empleado where apellido2 in ('Diaz','Moreno');
 13. Devuelve un listado con el código y el nombre del departamento, solamente de
aquellos departamentos que tienen empleados./*select departamento.codigo,departamento.nombre,codigo_departamento from departamento,empleado where codigo_departamento is not null;
 14. Devuelve un listado con los datos de los empleados que trabajan en el
departamento de Sistemas, Contabilidad o I+D. Ordena el resultado alfabéticamente.
 /*select * from empleado,departamento where departamento.nombre = 'Sistemas' OR 'Contabilidad' OR 'I+D' order by departamento.nombre ASC;
 15. Devuelve un listado donde sólo aparezcan aquellos empleados que no tienen
ningún departamento asociado. /*select * from empleado left join departamento on empleado.codigo_departamento = departamento.codigo where empleado.codigo_departamento is null;
 16. Devuelve un listado con los empleados que no tienen ningún departamento
asociado y los departamentos que no tienen ningún empleado asociado. Ordene el
listado alfabéticamente por el nombre del departamento.
  select * from empleado left join departamento on empleado.codigo_departamento = departamento.codigo where empleado.codigo_departamento is null union  select * from empleado right join departamento on empleado.codigo_departamento = departamento.codigo where empleado.codigo_departamento is null;
 17. Calcula el nombre del departamento y el presupuesto que tiene asignado, del
departamento con menor presupuesto. select nombre,min(presupuesto) from departamento ;
 18. Devuelve el nombre del departamento con mayor presupuesto y la cantidad que
tiene asignada. select nombre,presupuesto from departamento order by presupuesto desc limit 1;
19. Devuelve los nombres de los departamentos que no tienen empleados
asociados.select departamento.nombre from departamento left join empleado ON empleado.codigo_departamento = departamento.codigo where empleado.codigo is null;

 
