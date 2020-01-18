package es.upm.grise.profundizacion.contratos;

import org.junit.Test;

import com.google.java.contract.PreconditionError;
import com.google.java.contract.InvariantError;


import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;
import es.upm.grise.profundizacion.contratos.courses.Course;
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
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	@Test(expected = PreconditionError.class)
	public void degreeCannotBeInstantiatedWithLessThan1Creddits() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_0CREDITS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCannotBeInstantiatedWithMoreThan6Creddits() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(INCORRECT_7CREDITS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCannotBeInstantiatedWithLessThan1Creddits() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(INCORRECT_0CREDITS_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCannotBeInstantiatedWithMoreThan6Creddits() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(INCORRECT_7CREDITS_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void degreeCannotBeInstantiatedWithNumRegistrationGreaterThan6() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
		
		// An exception is  raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCannotBeInstantiatedWithNumRegistrationGreaterThan6() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
		
		// An exception is  raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = InvariantError.class)
	public void registrationFailsWhenMoreThan10Courses() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE6, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE7, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE8, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE9, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE10, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE11, NUM_REGISTRATION));

	}
	
	@Test(expected = InvariantError.class)
	public void registrationFailsWhenMoreThan36Credits() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is  raised
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE126C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE136C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE146C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE156C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE166C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE176C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE186C, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_MASTER_COURSE1, NUM_REGISTRATION));


	}
	
	@Test
	public void todoCorrecto() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		Registration registration = new Registration();
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE1, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE2, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE3, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE4, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE5, NUM_REGISTRATION));
		registration.addCourse(new DegreeCourse(CORRECT_DEGREE_COURSE6, NUM_REGISTRATION));


	}

	
	//faltaria hacer test para comprobar que el fee es positivo, pero tal y como esta hecho el programa es imposible que sea negativo ahora mismo
}
