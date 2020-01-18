package es.upm.grise.profundizacion.contratos;

import org.junit.Test;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

public class SmokeTest {

	// a)
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAZeroCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		DegreeCourse degreeCourse = new DegreeCourse(ZERO_DEGREE_CREDITS, NUM_REGISTRATION);
	}

	// a)
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithMoreThanSixCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		DegreeCourse degreeCourse = new DegreeCourse(SEVEN_DEGREE_CREDITS, NUM_REGISTRATION);
	}

	// a)
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithAZeroCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		MasterCourse masterCourse = new MasterCourse(ZERO_MASTER_CREDITS, NUM_REGISTRATION);
	}

	// a)
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithMoreThanSixCreditsCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		MasterCourse masterCourse = new MasterCourse(SEVEN_MASTER_CREDITS, NUM_REGISTRATION);
	}

	// b)
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAZeroNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;

		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	// b)
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithMoreThanSixNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	// b)
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithAZeroNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 0;

		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	// b)
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithMoreThanSixNumRegistration() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	// c)
	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	// c)
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	// d)
	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERLevelCoursesOnly() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	// d)
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	// e) y f)
	@Test
	public void registration_OK() {

		Registration registration = new Registration();

		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1));
	}

	// e)
	@Test(expected = InvariantError.class)
	public void registrationCannotHaveMoreThanTenSubjects() {

		Registration registration = new Registration();

		// 11 subjects
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1));
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

	// f)
	@Test(expected = InvariantError.class)
	public void registrationCannotHaveMoreThanThirtySixCredits() {

		Registration registration = new Registration();

		// 39 ects
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_13, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_12, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_11, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1));
	}

	// g)
	@Test(expected = PostconditionError.class)
	public void courseCannotHaveNegativeFee() {

		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		CourseDoubleNegativeFee course = new CourseDoubleNegativeFee(CORRECT_DEGREE_COURSE, 1);
	}

	// h)
	@Test(expected = PostconditionError.class)
	public void registrationCannotHaveNegativeFee() {

		Registration registration = new Registration();
		registration.addCourse(new CourseDoubleNegativeFee(CORRECT_DEGREE_COURSE, 1));
	}

}
