package es.upm.grise.profundizacion.contratos;

import org.junit.Test;

import com.google.java.contract.InvariantError;
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
		DegreeCourse degreeCourse = new DegreeCourse(GRADO_CORRECTO, NUM_REGISTRATION);
	}
	
	//APARTADO D
	
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(MASTER_CORRECTO, NUM_REGISTRATION);
	}

	
	@Test
	public void masterCoursesCanBeInstantiatedWithMASTERLevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		MasterCourse degreeCourse = new MasterCourse(MASTER_CORRECTO, NUM_REGISTRATION);
	}
	
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		 MasterCourse degreeCourse = new MasterCourse(GRADO_CORRECTO, NUM_REGISTRATION);
	}
	
	//APARTADO A
	@Test(expected = PreconditionError.class)
	public void asignaturaGradoMas6Creditos() {
		
		DegreeCourse incorrectCourse = new DegreeCourse(GRADO_INCORRECTO, 1);
		
		
	}
	
	@Test(expected = PreconditionError.class)
	public void asignaturaMasterMas6Creditos() {
		
		MasterCourse incorrectCourse = new MasterCourse(MASTER_INCORRECTO, 1);
		
	}
	
	//APARTADO B
	@Test(expected = PreconditionError.class)
	public void asignaturaMasDe6VecesGrado() {
		
		DegreeCourse incorrectCourse = new DegreeCourse(GRADO_CORRECTO, 8);
	}
	
	@Test(expected = PreconditionError.class)
	public void asignaturaMasDe6VecesMaster() {
		
		MasterCourse incorrectCourse = new MasterCourse(MASTER_CORRECTO, 8);
	}
	
	// APARTADO E
	@Test
	public void matriculaMenosDiezCursos() {
		
		Registration registration = new Registration();
		
		DegreeCourse degreecourse = new DegreeCourse(GRADO_CORRECTO, 1);
		registration.addCourse(degreecourse);
		
		assertEquals(1, registration.getNumberCourses());
		
	}
	
	
	@Test(expected = InvariantError.class)
	public void matriculaMasDeDiezCursos (){
		
		Registration registration = new Registration();
		
		DegreeCourse curso1 = new DegreeCourse(GRADO_CORRECTO, 1);
		DegreeCourse curso2 = new DegreeCourse(GRADO_CORRECTO1, 1);
		DegreeCourse curso3 = new DegreeCourse(GRADO_CORRECTO2, 1);
		DegreeCourse curso4 = new DegreeCourse(GRADO_CORRECTO3, 1);
		DegreeCourse curso5 = new DegreeCourse(GRADO_CORRECTO4, 1);
		DegreeCourse curso6 = new DegreeCourse(GRADO_CORRECTO5, 1);
		DegreeCourse curso7 = new DegreeCourse(GRADO_CORRECTO6, 1);
		DegreeCourse curso8 = new DegreeCourse(GRADO_CORRECTO7, 1);
		DegreeCourse curso9 = new DegreeCourse(GRADO_CORRECTO8, 1);
		DegreeCourse curso10 = new DegreeCourse(GRADO_CORRECTO9, 1);
		DegreeCourse curso11 = new DegreeCourse(GRADO_CORRECTO10, 1);
		
		registration.addCourse(curso1);
		registration.addCourse(curso2);
		registration.addCourse(curso3);
		registration.addCourse(curso4);
		registration.addCourse(curso5);
		registration.addCourse(curso6);
		registration.addCourse(curso7);
		registration.addCourse(curso8);
		registration.addCourse(curso9);
		registration.addCourse(curso10);
		registration.addCourse(curso11);
	}
	
	//APARTADO F
	@Test(expected = InvariantError.class)
	public void matriculaMasDe36Creditos() {
		Registration registration = new Registration();
		
		DegreeCourse curso1 = new DegreeCourse(GRADO_CORRECTO, 1);
		DegreeCourse curso2 = new DegreeCourse(GRADO_CORRECTO1, 1);
		DegreeCourse curso3 = new DegreeCourse(GRADO_CORRECTO2, 1);
		DegreeCourse curso4 = new DegreeCourse(GRADO_CORRECTO3, 1);
		DegreeCourse curso5 = new DegreeCourse(GRADO_CORRECTO4, 1);
		DegreeCourse curso6 = new DegreeCourse(GRADO_CORRECTO5, 1);
		DegreeCourse curso7 = new DegreeCourse(GRADO_CORRECTO6, 1);
		DegreeCourse curso8 = new DegreeCourse(GRADO_CORRECTO7, 1);
		DegreeCourse curso9 = new DegreeCourse(GRADO_CORRECTO8, 1);
		
		
		registration.addCourse(curso1);
		registration.addCourse(curso2);
		registration.addCourse(curso3);
		registration.addCourse(curso4);
		registration.addCourse(curso5);
		registration.addCourse(curso6);
		registration.addCourse(curso7);
		registration.addCourse(curso8);
		registration.addCourse(curso9);
	}
}
