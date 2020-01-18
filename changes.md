# Document here the issues associated to items g) and h)

## Punto g)

Para asegurar que la matricula no es negativa en el grado y el master se ha añadido un "Ensures" en la clase "Course". De esta forma, indicando que tiene que ser igual o mayor que 0, resolvemos el problema.

## Punto h)

Para resolver este problema se ha creado una clase auxiliar "CourseDoubleNegativeFee" en la carpeta de testing. Esta extiende la clase "Course" sobrescribiendo la función "getFee()" devolviendo siempre el valor negativo -1.
