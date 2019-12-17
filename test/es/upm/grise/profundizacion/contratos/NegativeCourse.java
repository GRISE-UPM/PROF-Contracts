package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.courses.Course;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public class NegativeCourse extends Course {

	final private static double feePerCredit = 35.44;

	public NegativeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return -1;
	}
}
