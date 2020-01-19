Con respecto al apartado "g" no se puede dar una situación posible en la que el valor del importe una asignatura pueda ser negativo: 

- Por una parte tenemos los grados donde el valor mínimo que se nos devolvera es 0, mientras que por otro lado tenemos los másters cuyo valor de curso se basa en "feePerCredit * courseData.getCredits() * numRegistrations" por ello para que este valor fuera negativo sería necesario que variasemos la constante feePercredit, o que los créditos o número de registros fuera negativo ( lo cual no es viable porque hemos establecido condiciones para que no pase esto.)

- Una vez expuesto esto la solución pasaría por o modificar el código para las pruebas o crear algún método propio para que se diera esa situación.

Con respecto al apartado "h" si no podemos generar importes negativos para asignaturas... no podemos dar esta situación tampoco ya que la matrícula es la suma de todos los precios de asignaturas.

