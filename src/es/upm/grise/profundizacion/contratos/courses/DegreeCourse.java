package es.upm.grise.profundizacion.contratos.courses;

import com.google.java.contract.Requires;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;

	@Requires("\"DEGREE\".equals(course.getLevel())")
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(course, numRegistrations);
		this.courseData = course;
	}
	
	@Override
	public double getFee() {
		if (numRegistrations == 1)
			return 0;
		else
			return fee;
	}
	
}
