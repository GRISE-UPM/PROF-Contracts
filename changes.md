# Document here the issues associated to items g) and h)

El punto G no puede ser probado ya que la única forma de probarlo seria inyectar un número negativo en el cálculo de las tasas de un curso de Máster.

Para no tocar el código original se podría hacer con el numRegistrations, pero debido a que se nos pide que su valor tiene que estar entre 1 y 6 en todas las asignaturas nunca se podrá dar ese caso ya que fallaría por esa precondición que se evalúa a la hora de construir la clase Course.

Respecto al punto H, la única solución que se me ha ocurrido era la hacer un doble de test que heredase de DegreeCourse o MasterCourse y forzar que se devuelva un valor negativo en el método getFee(), lo he realizado con la clase MasterCourseWithNegativeFee.

