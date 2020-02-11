package es.upm.grise.profundizacion.contratos;

import org.junit.Test;

import com.google.java.contract.InvariantError;
import com.google.java.contract.PostconditionError;
import com.google.java.contract.PreconditionError;

import es.upm.grise.profundizacion.contratos.courses.CourseDouble_NegativeFee;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {
	
	int VALID_NUMBER = 1; // 1 <= registration <= 6 to be valid
	int INVALID_NUMBER = 7; // >= 7 INVALID
	int NEGATIVE_NUMBER = -1; //<=-1 INVALID

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER);
	}
	
	@Test
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, VALID_NUMBER);
	}
	
	// TEST CASO A//
	@Test
	(expected = PreconditionError.class)
	public void coursesMustHaveBetween1and6Credits() {
		// An exception is raised
		MasterCourse masterCourse = new MasterCourse(INCORRECT_CREDITS_MASTER_COURSE, VALID_NUMBER);
		// An excepcion is raised
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_CREDITS_DEGREE_COURSE, VALID_NUMBER);
	}
		
	// TEST CASO B//
	@Test
	(expected = PreconditionError.class)
	public void cannotEnrollLessThan1andMoreThan6Times() {
		// An exception is raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, INVALID_NUMBER);
		// An excepcion is raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, INVALID_NUMBER);
	}
	
	// TEST CASO C + D//
	@Test
	(expected = PreconditionError.class)
	public void cannotInstantiateClassWithDifferentCourse() {
		// An exception is raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER);
		// An excepcion is raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, VALID_NUMBER);
	}
	
	// TEST CASO E //
	@Test
	(expected = InvariantError.class)
	public void tuitionCanOnlyHave10CoursesMaximum() {
		Registration registration = new Registration();

		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
		// An excepcion is raised
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE, VALID_NUMBER));
	}
	
	// TEST CASO F //
	@Test
	(expected = InvariantError.class)
	public void tuitionCantBeMoreThan36credits() {
		Registration registration = new Registration();

		registration.addCourse(new DegreeCourse(DEGREE_COURSE_40ECTS, VALID_NUMBER));
	}
	
	// TEST CASO G //
	@Test
	(expected = PostconditionError.class)
	public void courseCostCannotBeNegative() {
		// An excepcion is raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, INVALID_NUMBER);
	}
	
	// TEST CASO H //
	@Test
	(expected = InvariantError.class)
	public void tuitionCannotHaveNegativePrice() {
		Registration registration = new Registration();

		registration.addCourse(new CourseDouble_NegativeFee(CORRECT_DEGREE_COURSE,VALID_NUMBER));
	}

}
