# Document here the issues associated to items g) and h)


Para el apartado g, habría que pedir al equipo encargado de diseñar el código que lo cambiase, para que se diera el caso de tener importes negativos. En el grado, el valor como mínimo va a ser cero; por lo cual nunca se podrá probar el caso de que fuese negativo. Mientras que en el máster, tampoco puede ser negativo, porque la constante *eePercredit* es positiva y los créditos/registros también lo son. Por lo tanto esta prueba no se puede llevar a cabo.

En el apartado h, ocurre lo mismo que en el g: no se podrá probar, porque nunca se dará esta condición. Es decir, si los sumandos (asignaturas) de una suma son positivos, el resultado será siempre positivo.