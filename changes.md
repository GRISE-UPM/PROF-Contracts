## Apartado g)

He utilizado la anotación `@Ensure` para garantizar que tanto el master como el grado no tienen una tasa negativa, es decir, que `getFee()` retorna un valor mayor o igual a 0 (esto solo tendría sentido en los países nórdicos pero no en España).

- Los grados devuelven un valor mínimo de 0.
- Las maestrías tienen un valor que se basa en la fórmula `feePerCredit * courseData.getCredits() * numRegistrations`. Por esto, para que este valor sea negativo sería necesario que la constante `feePerCredit` sea negativa, o que los créditos o número de registros sea negativo (lo cual hemos establecido como imposible).

## Apartado h)

Técnicamente, si no podemos generar importes negativos para las asignaturas de manera individual, esta premisa se transfiere a la matrícula, puesto que el precio de una matrícula no es más que la suma de los precios asociados a las asignaturas que la componen.
