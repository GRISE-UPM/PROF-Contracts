package es.upm.grise.profundizacion.contratos.courses;


import es.upm.grise.profundizacion.contratos.values.CourseData;

public class MasterCourseNegative extends Course {
	
	final private static double feePerCredit = 35.44;
	

	public MasterCourseNegative(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return -1;
	}
	
}
