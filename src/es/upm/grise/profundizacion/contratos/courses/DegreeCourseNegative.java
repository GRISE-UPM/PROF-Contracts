package es.upm.grise.profundizacion.contratos.courses;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class DegreeCourseNegative extends Course {

	final private static double fee = 27.33;

	public DegreeCourseNegative(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() {
		return -1;
	}
	
}
