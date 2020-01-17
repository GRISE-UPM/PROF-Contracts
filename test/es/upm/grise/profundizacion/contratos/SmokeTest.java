package es.upm.grise.profundizacion.contratos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourseNegative;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourseNegative;
import es.upm.grise.profundizacion.contratos.registration.Registration;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;
import com.google.java.contract.*;

public class SmokeTest {

	//Asignaturas grado
	
	DegreeCourse courseDegree1= new DegreeCourse(CORRECT_DEGREE_COURSE1, 3);
	DegreeCourse courseDegree2= new DegreeCourse(CORRECT_DEGREE_COURSE2, 3);
	DegreeCourse courseDegree3= new DegreeCourse(CORRECT_DEGREE_COURSE3, 3);
	DegreeCourse courseDegree4= new DegreeCourse(CORRECT_DEGREE_COURSE4, 3);
	DegreeCourse courseDegree5= new DegreeCourse(CORRECT_DEGREE_COURSE5, 3);
	DegreeCourse courseDegree6= new DegreeCourse(CORRECT_DEGREE_COURSE6, 3);
	DegreeCourse courseDegree7= new DegreeCourse(CORRECT_DEGREE_COURSE7, 3);
	DegreeCourse courseDegree8= new DegreeCourse(CORRECT_DEGREE_COURSE8, 3);
	DegreeCourse courseDegree9= new DegreeCourse(CORRECT_DEGREE_COURSE9, 3);
	DegreeCourse courseDegree10= new DegreeCourse(CORRECT_DEGREE_COURSE10,3);
	DegreeCourse courseDegree11= new DegreeCourse(CORRECT_DEGREE_COURSE11, 3);
	
	
	//Asignaturas del master
	
	/*MasterCourse masterCourse1= new MasterCourse(CORRECT_MASTER_COURSE1, 3);
	MasterCourse masterCourse2= new MasterCourse(CORRECT_MASTER_COURSE2, 3);
	MasterCourse masterCourse3= new MasterCourse(CORRECT_MASTER_COURSE3, 3);
	MasterCourse masterCourse4= new MasterCourse(CORRECT_MASTER_COURSE4, 3);
	MasterCourse masterCourse5= new MasterCourse(CORRECT_MASTER_COURSE5, 3);
	MasterCourse masterCourse6= new MasterCourse(CORRECT_MASTER_COURSE6, 3);
	MasterCourse masterCourse7= new MasterCourse(CORRECT_MASTER_COURSE7, 3);
	MasterCourse masterCourse8= new MasterCourse(CORRECT_MASTER_COURSE8, 3);
	MasterCourse masterCourse9= new MasterCourse(CORRECT_MASTER_COURSE9, 3);
	MasterCourse masterCourse10= new MasterCourse(CORRECT_MASTER_COURSE10, 3);
	MasterCourse masterCourse11= new MasterCourse(CORRECT_MASTER_COURSE11, 3);*/
	
	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected =PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 2;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
 	public void masterCoursesCannotBeInstantiatedDegree() {

 		// 1 <= registration <= 6 to be valid
 		int NUM_REGISTRATION = 1;

 		// An exception is not raised
 		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
 	}
	
	@Test(expected = PreconditionError.class)
 	public void masterCoursesCanBeInstantiatedWithMASTER() {

 		// 1 <= registration <= 6 to be valid
 		int NUM_REGISTRATION = 1;

 		// An exception is not raised
 		MasterCourse cursoMaster = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
 	}
	
	@Test(expected =PreconditionError.class)
	public void testCreditsFail() {
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
				
	    // An exception is not raised
		new DegreeCourse(DEGREE_COURSE_ERROR, NUM_REGISTRATION);
	}
	
	@Test
 	public void creditsCorrect() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
 		Registration registro = new Registration();

 		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
 		registro.addCourse(degreeCourse);

 		assertEquals( 1, registro.getNumberCourses());
 	}
	
	@Test(expected = PreconditionError.class)
 	public void numberRegistrationInvalid() {

 		// 1 <= registration <= 6 to be valid
 		int NUM_REGISTRATION_INVALID = 9;

 		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION_INVALID);
 	}
	
	@Test(expected = InvariantError.class)
 	public void limitCreditsFail() {
 		Registration registration = new Registration();
 		
 		registration.addCourse(courseDegree1);
 		registration.addCourse(courseDegree2);
 		registration.addCourse(courseDegree3);
 		registration.addCourse(courseDegree4);
 		registration.addCourse(courseDegree5);
 		registration.addCourse(courseDegree6);
 		registration.addCourse(courseDegree7);
 		registration.addCourse(courseDegree8);
 		registration.addCourse(courseDegree9);
 	}
	
	
	@Test(expected = InvariantError.class)
 	public void limitDegreeCoursesFail() {
 		Registration registration = new Registration();

 		registration.addCourse(courseDegree1);
 		registration.addCourse(courseDegree2);
 		registration.addCourse(courseDegree3);
 		registration.addCourse(courseDegree4);
 		registration.addCourse(courseDegree5);
 		registration.addCourse(courseDegree6);
 		registration.addCourse(courseDegree7);
 		registration.addCourse(courseDegree8);
 		registration.addCourse(courseDegree9);
 		registration.addCourse(courseDegree10);
 		registration.addCourse(courseDegree11); 		
 	}
	
	
	@Test(expected = PostconditionError.class)
 	public void masterCourseNevativeNum_Registration() {
		
		// 1 <= registration <= 6 to be valid
		 int NUM_REGISTRATION = -1;
		 		
 		MasterCourse cursoMaster = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
 	}
	

 	@Test(expected = InvariantError.class)
 	public void matriculaValoresNegativos() {
 		Registration registration = new Registration();

 		MasterCourseNegative cursoNegative = new MasterCourseNegative(CORRECT_MASTER_COURSE, 1);

 		registration.addCourse(cursoNegative);
 	}
	
	
}
