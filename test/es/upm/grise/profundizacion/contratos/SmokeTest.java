package es.upm.grise.profundizacion.contratos;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_10;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_11;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_12;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_13;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_14;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_2;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_3;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_4;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_5;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_6;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_7;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_8;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_DEGREE_COURSE_9;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.CORRECT_MASTER_COURSE;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.SEVEN_DEGREE_CREDITS;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.SEVEN_MASTER_CREDITS;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.ZERO_DEGREE_CREDITS;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.ZERO_MASTER_CREDITS;

import org.junit.Test;

import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERLevelCoursesOnly() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAZeroCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(ZERO_DEGREE_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithMoreThanSixCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(SEVEN_DEGREE_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithAZeroCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(ZERO_MASTER_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithMoreThanSixCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new MasterCourse(SEVEN_MASTER_CREDITS, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAZeroNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;

		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithMoreThanSixNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithAZeroNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithMoreThanSixNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void correctRegistration() {

		Registration registration = new Registration();
		
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1));
	}
	
	@Test(expected = InvariantError.class)
	public void registrationCannotHaveMoreThanTenSubjects() {

		Registration registration = new Registration();
		
		// 35 ects 11 subjects
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_11, 1));
	}
	
	@Test(expected = InvariantError.class)
	public void registrationCannotHaveMoreThanThirtySixCredits() {

		Registration registration = new Registration();
		
		// 39 ects 10 subjects
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_11, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_12, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_13, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_14, 1));
	}
	
	@Test(expected = PostconditionError.class)
	public void registrationCannotHaveNegativeFee() {
		
		Registration registration = new Registration();
		registration.addCourse(new MasterCourseDoubleWithNegativeFee(CORRECT_DEGREE_COURSE, 1));
	}
}
