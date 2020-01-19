# Document here the issues associated to items g) and h)
## Punto g)
- Se utiliza un @Ensures en el constructor de Course, de esta manera, se asegura que el importe siempre sea un valor positivo. No encuentro ninguna forma posible de probar esto con Tests de Junit, sin recurrir a modificar el código original.

## Punto h)
- Se utiliza de la misma forma un invariante en la clase de Registration para realizar dicha comprobación. De todas formas, en g) ya se comprueba que no existan asignaturas negativas, por lo cual, podría llegar a no ser necesario. Para probar con test, se ha recurrido a un Double de una clase Course que obtiene siempre -1 como Fee, para así comprobar lo que ocurriría en un supuesto en el que los "Courses" tuviean fees negativas.