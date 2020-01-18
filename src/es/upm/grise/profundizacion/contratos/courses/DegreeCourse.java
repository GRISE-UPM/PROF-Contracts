package es.upm.grise.profundizacion.contratos.courses;

//import static org.junit.Assert.assertArrayEquals;

import com.google.java.contract.Requires;
import com.google.java.contract.Ensures;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;
	final private int MIN = 1;
	final private int MAX = 6;
	final private int MIN_FEE = 0;

	@Requires("\"DEGREE\".equals(course.getLevel())" +
			  "&& course.getCredits() >= MIN && course.getCredits() >= MAX"+
			  "&& numRegistrations >= MIN && numRegistrations <= MAX")
	@Ensures("getFee() >= MIN_FEE")
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
