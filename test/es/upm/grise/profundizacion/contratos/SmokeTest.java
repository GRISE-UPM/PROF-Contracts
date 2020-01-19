package es.upm.grise.profundizacion.contratos;

import org.junit.Test;

import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		final int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void testMasterCoursesCanBeInstantiatedWithMasterLevelCourseOnly() {
		new MasterCourse(CORRECT_MASTER_COURSE, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void testMasterCoursesCannotBeInstatiatedWithADegreeLevelCourse() {
		new MasterCourse(CORRECT_DEGREE_COURSE, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void testDegreeCourseWithMoreThanSixCredits() {
		new DegreeCourse(DEGREE_WITH_SEVEN_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void testDegreeCourseWithLessThanOneCredit() {
		new DegreeCourse(DEGREE_WITH_ZERO_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void testMasterCourseWithMoreThanSixCredits() {
		new MasterCourse(MASTER_WITH_SEVEN_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void testMasterCourseWithLessThanOneCredit() {
		new MasterCourse(MASTER_WITH_ZERO_CREDITS, 1);
	}
	
	@Test(expected = PreconditionError.class)
	public void testDegreeCourseMoreThanSixRegistrations() {
		new DegreeCourse(CORRECT_DEGREE_COURSE, 7);
	}
	
	@Test(expected = PreconditionError.class)
	public void testDegreeCourseLessThanOneRegistration() {
		new DegreeCourse(CORRECT_DEGREE_COURSE, 0);
	}
	
	@Test(expected = PreconditionError.class)
	public void testDegreeMasterMoreThanSixRegistration() {
		new MasterCourse(CORRECT_MASTER_COURSE, 7);
	}
	
	@Test(expected = PreconditionError.class)
	public void testDegreeMasterLessThanOneRegistration() {
		new MasterCourse(CORRECT_MASTER_COURSE, 0);
	}
	
	@Test
	public void testSuccessfulRegistration() {
		Registration registration = new Registration();	 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N1, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N2, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N3, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N4, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N5, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N6, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N7, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N8, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N9, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N10, 1));
	}
	
	@Test (expected = PostconditionError.class)
	public void testRegistrationMoreThanTenCourses() {
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N1, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N2, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N3, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N4, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N5, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N6, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N7, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N8, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N9, 1)); 
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N10, 1));
	}
	
	@Test (expected = PostconditionError.class)
	public void testRegistrationMoreThan36Credits() {
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N1, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N2, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N3, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N4, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N8, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N9, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N13, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N11, 1));
		registration.addCourse(new DegreeCourse(DEGREE_COURSE_N12, 1));
	}

}
