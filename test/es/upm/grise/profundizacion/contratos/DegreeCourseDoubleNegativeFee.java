package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public class DegreeCourseDoubleNegativeFee extends DegreeCourse {

	public DegreeCourseDoubleNegativeFee(CourseData course, int numRegistrations) {
		super(course, numRegistrations);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return -1;
	}
	

}
