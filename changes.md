# Document here the issues associated to items g) and h)

Apartado g) El importe de una asignatura no puede ser negativo.
	En el grado, sin tocar el código, no se puede dar. Esto es debido a que siempre el valor que nos devuelve mínimo es 0.
	En el máster, sin tocar el código, se podría dar. Esto es debido a que el fee se calcula multiplicando el precio del crédito por el número de créditos matriculados por el número de veces que te has matriculado.
		Por lo tanto, en caso de que una o las tres variables que participan en esa fórmula fuese negativo el fee sería negativo. 
			Sin embargo, esto no es posible ya que los tres valores lógicamente tienen que ser positivos, por lo que nunca se daría. Además estan los apartados a y b que no se deben de incumplir.
				En las pruebas se ha pasado un número de veces de matriculas negativo para que se diese este caso y poder probarlo.
				
				
Apartado h) El importe de la matrícula no puede ser negativo.
	Ocurre exactamente lo mismo que en el caso anterior pero a gran escala. Habría que poner todas las asignaturas para que la suma del total
		fuese negativo de forma que la matrícula final fuese un valor negativo. (Es exactamente mismo razonamiento que en g)
		En las pruebas se ha pasado un asignaturas con importe negativo para que se diese este caso y poder probarlo.
		
		
Por otra parte, a pesar de muchos intentos no he sido capaz de configurar Cofoja usando Maven. 