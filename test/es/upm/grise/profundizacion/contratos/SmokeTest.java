package es.upm.grise.profundizacion.contratos;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.java.contract.*;
import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {

	//Caso correcto: grado con asignatura de grado, entre 1 y 6 créditos, entre 1 y 6 registrations
	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	//a
	@Test(expected = PreconditionError.class)
	public void lasAsignaturasDebenTenerEntreUnoYSeisCreditos() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
				
		new DegreeCourse(MORE_THAN_6_CREDITS_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	//b
	@Test(expected = PreconditionError.class)
	public void alumnoSoloPuedeMatricularseEntreUnaYSeisVecesPorAsignatura() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION_INVALID = 7;
				
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION_INVALID);
	}
	
	//c
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	//d (se interpreta que se refiere a que una asignatura de grado no se puede instanciar en un curso de máster)
	@Test(expected = PreconditionError.class)
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	//e
	@Test
	public void matriculaCorrecta() {
		Registration registration = new Registration();
		
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		registration.addCourse(degreeCourse);
		
		assertEquals("Correcto: se ha incluido una asignatura", 1, registration.getNumberCourses());
	}
	
	@Test(expected = InvariantError.class)
	public void matriculaNoPuedeTenerMasDeDiezAsignaturas() {
		Registration registration = new Registration();
		
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1);
		DegreeCourse degreeCourse7= new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1);
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1);
		DegreeCourse degreeCourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1);
		DegreeCourse degreeCourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE_10, 1);
		DegreeCourse degreeCourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE_11, 1);
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
	
	//f
	@Test(expected = InvariantError.class)
	public void matriculaNoPuedeTenerMasDeTreintaYSeisCreditos() {
		Registration registration = new Registration();
		
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE_6, 1);
		DegreeCourse degreeCourse7= new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1);
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE_8, 1);
		registration.addCourse(degreeCourse1);
		registration.addCourse(degreeCourse2);
		registration.addCourse(degreeCourse3);
		registration.addCourse(degreeCourse4);
		registration.addCourse(degreeCourse5);
		registration.addCourse(degreeCourse6);
		registration.addCourse(degreeCourse7);
		registration.addCourse(degreeCourse8);
	}
	
	//g (ver changes.md)
	@Test(expected = PostconditionError.class)
	public void importeAsignaturaNoPuedeSerNegativo() {
		MasterCourse masterCourse = new MasterCourse(CORRECT_MASTER_COURSE, -1);
	}

	//h (ver changes.md)
	@Test(expected = InvariantError.class)
	public void importeMatriculaNoPuedeSerNegativo() {
		Registration registration = new Registration();
		
		NegativeCourse negativeCourse = new NegativeCourse(CORRECT_MASTER_COURSE, 1);
		
		registration.addCourse(negativeCourse);
	}
}
