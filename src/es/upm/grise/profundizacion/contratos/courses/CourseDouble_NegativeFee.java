package es.upm.grise.profundizacion.contratos.courses;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class CourseDouble_NegativeFee extends Course {
	public CourseDouble_NegativeFee(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() { return -1; }
}
