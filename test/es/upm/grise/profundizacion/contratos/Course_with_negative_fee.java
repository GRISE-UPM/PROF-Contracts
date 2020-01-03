package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.courses.Course;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public class Course_with_negative_fee extends Course{
	final private static double feePerCredit = 27.33;
	
	public Course_with_negative_fee(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return -1;
	}

}
