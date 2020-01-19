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
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeSubjectsCanNotHaveLessThanSixCredits() {
		DegreeCourse incorrectCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE_1, 1);
		
	}
	@Test(expected = PreconditionError.class)
	public void masterSubjectsCanNotHaveLessThanSixCredits() {
		MasterCourse incorrectCourse = new MasterCourse(INCORRECT_MASTER_COURSE_1, 1);
		
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeSubjectsCanNotHaveMoreThanSixCredits() {
		DegreeCourse incorrectCourse = new DegreeCourse(INCORRECT_DEGREE_COURSE, 1);
		
	}
	@Test(expected = PreconditionError.class)
	public void masterSubjectsCanNotHaveMoreThanSixCredits() {
		MasterCourse incorrectCourse = new MasterCourse(INCORRECT_MASTER_COURSE, 1);
		
	}
	
	@Test(expected = PreconditionError.class)
	public void studentsCannotRegisterASubjectMoreThanSixTimes() {
		
		DegreeCourse incorrectCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 7);
	}
	
	@Test
	public void TuitionNeedToHaveLessThanTenCourses() {
		Registration registration = new Registration();
		
		DegreeCourse degreecourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(degreecourse);
		
		assertEquals(1, registration.getNumberCourses());
		
	}
	
	@Test(expected = InvariantError.class)
	public void TuitionCannotHaveMoreThanTenCourses() {
		Registration registration = new Registration();
		
		DegreeCourse degreecourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(degreecourse1);
		DegreeCourse degreecourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1);
		registration.addCourse(degreecourse2);
		DegreeCourse degreecourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1);
		registration.addCourse(degreecourse3);
		DegreeCourse degreecourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1);
		registration.addCourse(degreecourse4);
		DegreeCourse degreecourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1);
		registration.addCourse(degreecourse5);
		DegreeCourse degreecourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1);
		registration.addCourse(degreecourse6);
		DegreeCourse degreecourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1);
		registration.addCourse(degreecourse7);
		DegreeCourse degreecourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1);
		registration.addCourse(degreecourse8);
		DegreeCourse degreecourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1);
		registration.addCourse(degreecourse9);
		DegreeCourse degreecourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1);
		registration.addCourse(degreecourse10);
		DegreeCourse degreecourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1);
		registration.addCourse(degreecourse11);
	}
	
	@Test(expected = InvariantError.class)
	public void TuitionCannotHaveMoreThanThirtySixCredits() {
		Registration registration = new Registration();
		
		DegreeCourse degreecourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(degreecourse1);
		DegreeCourse degreecourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1);
		registration.addCourse(degreecourse2);
		DegreeCourse degreecourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1);
		registration.addCourse(degreecourse3);
		DegreeCourse degreecourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1);
		registration.addCourse(degreecourse4);
		DegreeCourse degreecourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1);
		registration.addCourse(degreecourse5);
		DegreeCourse degreecourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1);
		registration.addCourse(degreecourse6);
		DegreeCourse degreecourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1);
		registration.addCourse(degreecourse7);
	}
	
	@Test(expected = PostconditionError.class)
	public void FeeCannotBeNegative() {
		Registration registration = new Registration();
		registration.addCourse(new NegativeMasterCourse(CORRECT_DEGREE_COURSE, 1));
	}
			

}
