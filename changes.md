# Document here the issues associated to items g) and h)

Para respetar las buenas practicas de testing, se ha evitado tocar el codigo original.

## CASO G ##

Para el caso G, se añadido un ENSURES a los constructores de DEGREE y MASTER para asegurarse de que no pueda existir un importe de matricula que sea negativo.

## CASO H ##

Para este caso, la forma mas facil de resolverlo sin tener que tocar el codigo original es creando una clase nueva CourseDouble_NegativeFee que extiende de Course. Esta clase va a devolver siempre un getFee negativo -1.

Es la unica manera de probarlo, ya que con el caso G estabamos evitando precisamente que se pudiera dar esta condicion.