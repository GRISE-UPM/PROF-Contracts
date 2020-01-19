package es.upm.grise.profundizacion.contratos;

import org.junit.Test;
import es.upm.grise.profundizacion.contratos.courses.*;
import es.upm.grise.profundizacion.contratos.registration.*;
import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

import com.google.java.contract.*;

public class SmokeTest {

	// 0a.) Matricula correcta en Grado 
	@Test
	public void matriculaCorrectaGrado() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 4;

		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	// No se ha eliminado esta por ser la que se daba. Es redundante ya que tenemos
		//	la de matriculaCorrectaGrado (pero se queria mantener por ser originial del archivo)
	@Test
	public void degreeCoursesCanBeInstantiatedWithDEGREELevelCoursesOnly() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	// 0b.) Matricula correcta en Master 
	@Test
	public void matriculaCorrectaMaster() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 2;

		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	
	// a.) Las asignaturas deben tener entre 1 y 6 ECTS. 
	@Test(expected = PreconditionError.class)
	public void asignaturasEntreUnoySeisCreditos() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;

		new DegreeCourse(INCORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	// b.) Un alumno puede matricularse entre 1 y 6 veces en la misma asignatura como máximo. 
	@Test(expected = PreconditionError.class)
	public void asignaturasEntreUnoySeisIntentos() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;

		// An exception is not raised
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	// c.) No se puede instanciar una clase DegreeCourse con una asignatura de master. 
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	
	// d.) No se puede instanciar una clase MasterCourse con una asignatura de grado. 
	@Test(expected = PreconditionError.class)
	public void masterNoPuedeTenerAsignaturaDeGrado() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	// e.) Una matrícula puede contener 10 asignaturas como máximo. 
	@Test(expected = InvariantError.class)
	public void matriculaMaximoDiezAsignaturas() {
		
		Registration registration = new Registration();

		// 11 Asignaturas con 35 creditos
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1); // 1 ECTS
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE_2, 2); // 2 ECTS
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 3); // 2 ECTS
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 4); // 2 ECTS
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 5); // 3 ECTS
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE_6, 6); // 3 ECTS
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE_7, 1); // 3 ECTS
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE_8, 2); // 4 ECTS
		DegreeCourse degreeCourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE_9, 3); // 5 ECTS
		DegreeCourse degreeCourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE_10, 4); // 5 ECTS
		DegreeCourse degreeCourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE_11, 5); // 5 ECTS
		
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
	
	
	// f.) Una matrícula no puede contener más de 36 ECTS. 
	@Test(expected = InvariantError.class)
	public void matriculaMaximoTreintaSeisCreditos() {
		
		Registration registration = new Registration();

		// 10 Asignaturas con 38 creditos
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1); // 2 ECTS
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 2); // 2 ECTS
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 3); // 3 ECTS
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE_6, 4); // 3 ECTS
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE_7, 5); // 3 ECTS
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE_8, 6); // 4 ECTS
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE_9, 1); // 5 ECTS
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE_10, 2); // 5 ECTS
		DegreeCourse degreeCourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE_11, 3); // 5 ECTS
		DegreeCourse degreeCourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE_12, 4); // 6 ECTS
		
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
	}
	
	// g.) El importe de una asignatura no puede ser negativo. 
	@Test(expected = PostconditionError.class)
	public void importeAsignaturaNegativo() {

		new MasterCourse(CORRECT_MASTER_COURSE, -1); // Comentado en changes.md
	}
	
	
	// h.) El importe de la matrícula no puede ser negativo. 
	@Test(expected = PostconditionError.class)
	public void importeMatriculaNegativa() {

		Registration registration = new Registration();
		
		MasterCourse masterCourse1 = new MasterCourse(CORRECT_MASTER_COURSE, -1); // Comentado en changes.md
		MasterCourse masterCourse2 = new MasterCourse(CORRECT_MASTER_COURSE, -2); // Comentado en changes.md
		
		registration.addCourse(masterCourse1);
		registration.addCourse(masterCourse2);
	}
}
