package es.upm.grise.profundizacion.contratos;

import org.junit.Test;

import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

import es.upm.grise.profundizacion.contratos.courses.Course;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERLevelCoursesOnly() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void degreeRegistrationCorrect() {

		Registration registration = new Registration();
		
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE2, 1));
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	

	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithA0CreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(INCORRECT_DEGREE_COURSE_0CR, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithA0CreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(INCORRECT_MASTER_COURSE_0CR, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithMoreThan6CreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(INCORRECT_DEGREE_COURSE_7CR, NUM_REGISTRATION);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithMoreThan6CreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(INCORRECT_MASTER_COURSE_7CR, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithA0Registration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;

		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithA0Registration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithMoreThan6Registration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithMoreThan6Registration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = InvariantError.class)
	public void registrationSumOfCoursesCannotBeMoreThan36Credits() {

		Registration registration = new Registration();
		
		// Add 10 subjects, with total amount of 38 credits
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE2, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE3, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE4, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE5, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE6, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE7, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE8, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE12, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE11, 1));
	}
	
	@Test(expected = InvariantError.class)
	public void registrationsCannotHaveMoreThanMaxNumberOfSubjects() {

		Registration registration = new Registration();
		
		// Add 11 subjects, with total amount of 36 credits
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE1, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE2, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE3, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE4, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE5, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE6, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE7, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE8, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE9, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE10, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE11, 1));
		
	}
	
	
	@Test(expected = PostconditionError.class)
	public void registrationFeeMustBePositivePostCondition() {
		
		// Add a class for testing a negative fee
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourseDoubleNegativeFee(CORRECT_DEGREE_COURSE, 1));
	}

}
