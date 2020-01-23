package es.upm.grise.profundizacion.contratos.courses;

import es.upm.grise.profundizacion.contratos.values.CourseData;
import com.google.java.contract.Requires;
import com.google.java.contract.Ensures;

public abstract class Course implements Comparable <Course> {

	protected int numRegistrations;
	protected CourseData courseData;

	@Requires("course.getCredits() >= 1 && " +
			  "course.getCredits() <= 6 && " +
			  "numRegistrations >= 1 && " +
			  "numRegistrations <= 6")
	@Ensures("getFee() >= 0")
	public Course(CourseData course, int numRegistrations) {
		this.numRegistrations = numRegistrations;
		this.courseData = course;
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
