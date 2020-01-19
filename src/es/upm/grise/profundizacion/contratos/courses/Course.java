package es.upm.grise.profundizacion.contratos.courses;

import es.upm.grise.profundizacion.contratos.values.CourseData;
import com.google.java.contract.Requires;
import com.google.java.contract.Ensures;

public abstract class Course implements Comparable <Course> {

	protected int numRegistrations;
	protected CourseData courseData;

	@Requires("numRegistrations >= 1 && numRegistrations <= 6 &&"
			+ "courseData.getCredits() >= 1 && courseData.getCredits() <= 6")
	@Ensures("getFee() >= 0")
	public Course(int numRegistrations, CourseData courseData) {
		this.numRegistrations = numRegistrations;
		this.courseData = courseData;
	}
	
	public String getLevel() {
		return courseData.getLevel();
	}
	
	public abstract double getFee();

	public String getName() {
		return courseData.getName();
	}
	
	public int getCredits() {
		return courseData.getCredits();
	}
	
	@Override
	public int compareTo(Course course) {
		return courseData.getName().compareTo(course.getName());
	}
	
}
