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
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERLevelCoursesOnly() {
		
		int NUM_REGISTRATION = 1;
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithDEGREELevelCourses() {
		
		int NUM_REGISTRATION = 1;
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void degreeCoursesCannotHaveMoreThan6Credits() {
		
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(MORE_CREDITS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void degreeCoursesCannotHaveLessThan1Credits() {
		
		int NUM_REGISTRATION = 1;
		DegreeCourse degreeCourse = new DegreeCourse(LESS_CREDITS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void degreeCoursesCannotHaveMoreThan6Registrations() {
		
		int NUM_REGISTRATION = 7;
		DegreeCourse degreeCourse = new DegreeCourse(MORE_REGISTRATIONS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void degreeCoursesCannotHaveLessThan1Registrations() {
		
		int NUM_REGISTRATION = 0;
		DegreeCourse degreeCourse = new DegreeCourse(LESS_REGISTRATIONS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void masterCoursesCannotHaveMoreThan6Credits() {
		
		int NUM_REGISTRATION = 1;
		MasterCourse degreeCourse = new MasterCourse(MORE_CREDITS_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void masterCoursesCannotHaveLessThan1Credits() {
		
		int NUM_REGISTRATION = 1;
		MasterCourse degreeCourse = new MasterCourse(LESS_CREDITS_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void masterCoursesCannotHaveMoreThan6Registrations() {
		
		int NUM_REGISTRATION = 7;
		MasterCourse degreeCourse = new MasterCourse(MORE_REGISTRATIONS_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PreconditionError.class)
	public void masterCoursesCannotHaveLessThan1Registrations() {
		
		int NUM_REGISTRATION = 0;
		MasterCourse degreeCourse = new MasterCourse(LESS_REGISTRATIONS_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test (expected = PostconditionError.class)
	public void registrationCannotHaveMoreThan10Courses() {
		
		int NUM_REGISTRATION = 1;
		
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(COURSE_1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_6, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_7, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_8, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_9, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_10, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_11, NUM_REGISTRATION));
	}
	
	@Test (expected = PostconditionError.class)
	public void registrationCannotHaveMoreThan36Credit() {
		
		int NUM_REGISTRATION = 1;
		
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(COURSE_1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_6, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_7, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_8, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_9, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_10, NUM_REGISTRATION));
	}
	
	@Test
	public void registrationIsCorrect() {
		
		int NUM_REGISTRATION = 1;
		
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(COURSE_1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(COURSE_6, NUM_REGISTRATION));
	}
}
