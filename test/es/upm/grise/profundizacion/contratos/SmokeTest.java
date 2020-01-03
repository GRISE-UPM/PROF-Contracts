package es.upm.grise.profundizacion.contratos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;
import com.google.java.contract.*;

public class SmokeTest {
	
	//Asignaturas
		DegreeCourse degreeCourse0 = new DegreeCourse(CORRECT_DEGREE_COURSE0, 1);
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE1, 1);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE2, 1);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE3, 1);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE4, 1);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE5, 1);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE6, 1);
		DegreeCourse degreeCourse7= new DegreeCourse(CORRECT_DEGREE_COURSE7, 1);
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE8, 1);
		DegreeCourse degreeCourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE9, 1);
		DegreeCourse degreeCourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE10, 1);
		DegreeCourse degreeCourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE11, 1);
	

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
	
	@Test(expected = PreconditionError.class)
 	public void asignaturasCarreraConCreditosInorrectos() {

 		//Deben tener entre 1 y 6
 		int NUM_REGISTRATION = 1;

 		new DegreeCourse(ERRONEOUS_DEGREE_COURSE , NUM_REGISTRATION);
 	}
	
	
 	@Test(expected = InvariantError.class)
 	public void creditosSuperioresALoPermitido() {
 		Registration registration = new Registration();
 		
 		registration.addCourse(degreeCourse1);
 		registration.addCourse(degreeCourse2);
 		registration.addCourse(degreeCourse3);
 		registration.addCourse(degreeCourse4);
 		registration.addCourse(degreeCourse5);
 		registration.addCourse(degreeCourse6);
 		registration.addCourse(degreeCourse7);
 		registration.addCourse(degreeCourse8);
 		registration.addCourse(degreeCourse9);
 	}

	@Test(expected = PreconditionError.class)
 	public void asignaturasCarreraConCreditosCorrectos() {

 		// 1 <= registration <= 6 to be valid
 		int NUM_REGISTRATION_INVALID = 9;

 		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION_INVALID);
 	}

	@Test(expected = PreconditionError.class)
 	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {

 		// 1 <= registration <= 6 to be valid
 		int NUM_REGISTRATION = 1;

 		// An exception is not raised
 		MasterCourse cursoMaster = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
 	}
	
	@Test(expected = PreconditionError.class)
 	public void masterCoursesCanBeInstantiatedWithAMASTERLevelCoursesOnly() {

 		// 1 <= registration <= 6 to be valid
 		int NUM_REGISTRATION = 1;

 		// An exception is not raised
 		MasterCourse cursoMaster = new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
 	}
	
 	@Test
 	public void creditosDeMatriculaBuenos() {
 		Registration registro = new Registration();

 		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
 		registro.addCourse(degreeCourse);

 		assertEquals( 1, registro.getNumberCourses());
 	}
 	
 	@Test(expected = InvariantError.class)
 	public void matriculaValoresNegativos() {
 		Registration registration = new Registration();

 		Negative_values_course curso_negativo = new Negative_values_course(CORRECT_MASTER_COURSE, 1);

 		registration.addCourse(curso_negativo);
 	}

 	@Test(expected = InvariantError.class)
 	public void masDeLasAsignaturasPermitidas() {
 		Registration registration = new Registration();

 		registration.addCourse(degreeCourse0);
 		registration.addCourse(degreeCourse1);
 		registration.addCourse(degreeCourse2);
 		registration.addCourse(degreeCourse3);
 		registration.addCourse(degreeCourse4);
 		registration.addCourse(degreeCourse5);
 		registration.addCourse(degreeCourse6);
 		registration.addCourse(degreeCourse7);
 		registration.addCourse(degreeCourse8);
 		registration.addCourse(degreeCourse9);
 		registration.addCourse(degreeCourse10);
 		registration.addCourse(degreeCourse11);
 		
 	}


 	@Test(expected = PostconditionError.class)
 	public void asignaturaValoresNegativos() {
 		MasterCourse cursoMaster = new MasterCourse(CORRECT_MASTER_COURSE, -1);
 	}
}
