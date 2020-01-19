## Apartado g)

He utilizado la anotaci�n `@Ensure` para garantizar que tanto el master como el grado no tienen una tasa negativa, es decir, que `getFee()` retorna un valor mayor o igual a 0 (esto solo tendr�a sentido en los pa�ses n�rdicos pero no en Espa�a).

- Los grados devuelven un valor m�nimo de 0.
- Las maestr�as tienen un valor que se basa en la f�rmula `feePerCredit * courseData.getCredits() * numRegistrations`. Por esto, para que este valor sea negativo ser�a necesario que la constante `feePerCredit` sea negativa, o que los cr�ditos o n�mero de registros sea negativo (lo cual hemos establecido como imposible).

## Apartado h)

T�cnicamente, si no podemos generar importes negativos para las asignaturas de manera individual, esta premisa se transfiere a la matr�cula, puesto que el precio de una matr�cula no es m�s que la suma de los precios asociados a las asignaturas que la componen.
