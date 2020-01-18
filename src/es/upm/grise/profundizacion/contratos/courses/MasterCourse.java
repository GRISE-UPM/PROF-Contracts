package es.upm.grise.profundizacion.contratos.courses;

import com.google.java.contract.Requires;
import com.google.java.contract.Ensures;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class MasterCourse extends Course {
	
	final private static double feePerCredit = 35.44;
	final private int MIN = 1;
	final private int MAX = 6;
	final private int MIN_FEE = 0;

	@Requires("\"MASTER\".equals(course.getLevel())"+
			  "&& course.getCredits() >= MIN && course.getCredits() <= MAX")
	@Ensures("getFee() >= MIN_FEE")
	public MasterCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}
	
	public double getFee() {
		return feePerCredit * courseData.getCredits() * numRegistrations;
	}
	
}
