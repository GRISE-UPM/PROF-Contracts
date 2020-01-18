package es.upm.grise.profundizacion.contratos.courses;

import static org.junit.Assert.assertArrayEquals;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;

	@Requires("\"DEGREE\".equals(course.getLevel()) && "+
	"course.getCredits()>=1  && "+
	"course.getCredits()<=6")
	@Ensures("getFee()>=0")
	//el ensure no parece necesario pero bueno
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
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
