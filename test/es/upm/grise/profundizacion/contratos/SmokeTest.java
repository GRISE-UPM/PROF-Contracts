package es.upm.grise.profundizacion.contratos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.java.contract.*;

import es.upm.grise.profundizacion.contratos.courses.Course;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;
import es.upm.grise.profundizacion.contratos.values.CourseData;
import es.upm.grise.profundizacion.contratos.values.CourseDataValues;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {

	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERLevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithAdegreeLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeSubjectsCannotHaveMoreThanSixCredits() {
		DegreeCourse incorrectCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE, 1);
		
	}
	@Test(expected = PreconditionError.class)
	public void masterSubjectsCannotHaveMoreThanSixCredits() {
		MasterCourse incorrectCourse = new MasterCourse(INCORRECT_MASTER_COURSE, 1);
		
	}
	
	@Test(expected = PreconditionError.class)
	public void studentsCannotTakeASubjectMoreThanSixTimes() {
		
		//precondition is set in Course, if this works with DegreeCourse, it will also work with MasterCourse -> no need for another test using a MasterCourse.
		DegreeCourse incorrectCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 8);
	}
	
	@Test
	public void aTuitionCanHaveUpToTenCourses() {
		Registration registration = new Registration();
		
		DegreeCourse degreecourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(degreecourse);
		
		assertEquals(1, registration.getNumberCourses());
		
	}
	
	@Test(expected = InvariantError.class)
	public void aTuitionCannotHaveMoreThanTenCourses() {
		Registration registration = new Registration();
		
		DegreeCourse degreecourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		DegreeCourse degreecourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE1, 1);
		DegreeCourse degreecourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE2, 1);
		DegreeCourse degreecourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE3, 1);
		DegreeCourse degreecourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE4, 1);
		DegreeCourse degreecourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE5, 1);
		DegreeCourse degreecourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE6, 1);
		DegreeCourse degreecourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE7, 1);
		DegreeCourse degreecourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE8, 1);
		DegreeCourse degreecourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE9, 1);
		DegreeCourse degreecourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE10, 1);
		
		registration.addCourse(degreecourse1);
		registration.addCourse(degreecourse2);
		registration.addCourse(degreecourse3);
		registration.addCourse(degreecourse4);
		registration.addCourse(degreecourse5);
		registration.addCourse(degreecourse6);
		registration.addCourse(degreecourse7);
		registration.addCourse(degreecourse8);
		registration.addCourse(degreecourse9);
		registration.addCourse(degreecourse10);
		registration.addCourse(degreecourse11);
	}
	
	@Test(expected = InvariantError.class)
	public void aTuitionCannotHaveMoreThan36Credits() {
		Registration registration = new Registration();
		
		DegreeCourse degreecourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		DegreeCourse degreecourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE1, 1);
		DegreeCourse degreecourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE2, 1);
		DegreeCourse degreecourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE3, 1);
		DegreeCourse degreecourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE4, 1);
		DegreeCourse degreecourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE5, 1);
		DegreeCourse degreecourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE6, 1);
		DegreeCourse degreecourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE7, 1);
		
		registration.addCourse(degreecourse1);
		registration.addCourse(degreecourse2);
		registration.addCourse(degreecourse3);
		registration.addCourse(degreecourse4);
		registration.addCourse(degreecourse5);
		registration.addCourse(degreecourse6);
		registration.addCourse(degreecourse7);
		registration.addCourse(degreecourse8);
	}
	
	@Test(expected = PostconditionError.class)
	public void aSubjectsFeeCannotBeNegative() {
		//using a -2, when computing the fee in the getFee method, we will be multiplying by a negative number -> it will fail
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, -2);
	}
	
	@Test(expected = InvariantError.class)
	public void aTuitionsFeeCannotBeNegative() {
		Registration registration = new Registration();
		
		Course_with_negative_fee courseNegativeFee = new Course_with_negative_fee(CORRECT_DEGREE_COURSE, 1);
		
		registration.addCourse(courseNegativeFee);
	}

}
