Con respecto al apartado "g" no se puede dar una situaci�n posible en la que el valor del importe una asignatura pueda ser negativo: 

- Por una parte tenemos los grados donde el valor m�nimo que se nos devolvera es 0, mientras que por otro lado tenemos los m�sters cuyo valor de curso se basa en "feePerCredit * courseData.getCredits() * numRegistrations" por ello para que este valor fuera negativo ser�a necesario que variasemos la constante feePercredit, o que los cr�ditos o n�mero de registros fuera negativo ( lo cual no es viable porque hemos establecido condiciones para que no pase esto.)

- Una vez expuesto esto la soluci�n pasar�a por o modificar el c�digo para las pruebas o crear alg�n m�todo propio para que se diera esa situaci�n.

Con respecto al apartado "h" si no podemos generar importes negativos para asignaturas... no podemos dar esta situaci�n tampoco ya que la matr�cula es la suma de todos los precios de asignaturas.

