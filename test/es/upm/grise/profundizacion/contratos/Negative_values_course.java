package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.courses.Course;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public class Negative_values_course extends Course {
	
	final private static double credito = 30.50;

	public Negative_values_course(CourseData curso, int numRegistrations) {
		super(numRegistrations);
		this.courseData= curso;
	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return -1;
	}


}