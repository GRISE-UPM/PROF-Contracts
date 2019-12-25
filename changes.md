# Document here the issues associated to items g) and h)
En el apartado g) se nos pide realizar una prueba con el importe negativo de una asignatura, sin embargo, para el caso de las asignaturas de grado esto es imposible. tal y como se ha programado el m�todo **getfee()** de la clase **DegreeCourse**, el resultado siempre ser� "0" o "27,33". Por lo que unicamente nos queda la clase **MasterCourse** para poder realizar la prueba. Si analizamos el c�digo detenidamente, descubrimos que podemos producir un valor negativo si el n�mero de matr�culas que el alumno lleva de dicha asignatura es negativo (-1 por ejemplo) o si el n�mero de creditos de la asignatura es negativo tambi�n. 
Probando la primera opci�n, si intentamos poner dicho n�mero (numRegistrations) a -1, entramos en conflicto con el apartado b) que nos delimitaba dicha variable a un valor entre 1-6.

Probando por el otro camino, intentamos darle un valor negativo a los cr�ditos para que la funci�n **getCredits()** devuelva un valor negativo y de nuevo poder probar el apartado g). Pero nos encontramos con un conflicto en el apartado a) que nos delimita el n�mero de cr�ditos de cada asignatrua a un valor entre 1-6.


_Conclusi�n_: No se puede realizar un test para el apartado g) sin eliminar las precondiciones del apartado a) y/o b).


En el apartado h) nos ocurre algo parecido. Debido a que es imposible generar una prueba que introduzca un importe negativo en una asignatura, todas las asignaturas que se a�aden a la m�tricula siempre tienen un precio positivo. Por lo tanto, no podemos convertir el balance total de la matr�cula en un valor inferior a 0.


_Conclusi�n_: No se puede realizar un test para el apartado h) hasta que se hayan solventado los problemas del apartado g).
