package es.upm.grise.profundizacion.contratos;

import org.junit.Ignore;
import org.junit.Test;

import com.google.java.contract.InvariantError;
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
	
	
	//Apartado a)
	@Test(expected = PreconditionError.class)
	public void entreUnoYSeisCreditos() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
				
		new DegreeCourse(MORE_THAN_6_CREDITS_DEGREE, NUM_REGISTRATION);
	}
	
	//Apartado b)
	@Test(expected = PreconditionError.class)
	public void entreUnaySeisMatriculasPorAginatura() {
			
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 7;
					
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	
	//Apartado c) 
	@Test(expected = PreconditionError.class)
	public void noSePuedeCrearUnObjetoGradoConUnaAsignaturaDeMaster() {
		
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
		
		// An exception is not raised
		DegreeCourse degreeCourse = new DegreeCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}
	
	
	//Apartado d)
	@Test(expected = PreconditionError.class)
	public void noSePuedeCrearUnObjetoMasterConUnaAsignaturaDeGrado() {
			
		// 1 <= registration <= 6 to be valid
		int NUM_REGISTRATION = 1;
			
		// An exception is not raised
		MasterCourse masterCourse = new MasterCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}
	
	/*Apartado e): Para este apartado he tenido que poner todas las asignaturas a 1 credito, ya que sino, la excepcion saltaba por
	 Sobrepasar el limite de creditos en lugar del limite de asignaturas.
	*/
	@Test(expected = InvariantError.class)
	public void noMasDe10AsignaturasPorMatricula() {
		Registration matricula = new Registration();
		
		DegreeCourse asignaturaDeGrado1 = new DegreeCourse(CORRECT_DEGREE_COURSE_1, 1);
		DegreeCourse asignaturaDeGrado2 = new DegreeCourse(CORRECT_DEGREE_COURSE_2, 1);
		DegreeCourse asignaturaDeGrado3 = new DegreeCourse(CORRECT_DEGREE_COURSE_3, 1);
		DegreeCourse asignaturaDeGrado4 = new DegreeCourse(CORRECT_DEGREE_COURSE_4, 1);
		DegreeCourse asignaturaDeGrado5 = new DegreeCourse(CORRECT_DEGREE_COURSE_5, 1);
		MasterCourse asignaturaDeMaster6 = new MasterCourse(CORRECT_MASTER_COURSE_1, 1);
		MasterCourse asignaturaDeMaster7 = new MasterCourse(CORRECT_MASTER_COURSE_2, 1);
		MasterCourse asignaturaDeMaster8 = new MasterCourse(CORRECT_MASTER_COURSE_3, 1);
		MasterCourse asignaturaDeMaster9 = new MasterCourse(CORRECT_MASTER_COURSE_4, 1);
		MasterCourse asignaturaDeMaster10 = new MasterCourse(CORRECT_MASTER_COURSE_5, 1);
		matricula.addCourse(asignaturaDeGrado1);
		matricula.addCourse(asignaturaDeGrado2);
		matricula.addCourse(asignaturaDeGrado3);
		matricula.addCourse(asignaturaDeGrado4);
		matricula.addCourse(asignaturaDeGrado5);
		matricula.addCourse(asignaturaDeMaster6);
		matricula.addCourse(asignaturaDeMaster7);
		matricula.addCourse(asignaturaDeMaster8);
		matricula.addCourse(asignaturaDeMaster9);
		matricula.addCourse(asignaturaDeMaster10);
		
		//excepcion aqui (10+1)
		matricula.addCourse(new MasterCourse(CORRECT_MASTER_COURSE, 1));
	}
	
	//Apartado f): Para este caso de prueba he creado asignaturas con el maximo numero de creditos posible (6) a fin de llegar rapido al limite superior.
	@Test(expected = InvariantError.class)
	public void noMasDe36CreditosPorMatricula() {
		Registration matricula = new Registration();
		
		DegreeCourse asignaturaDeGrado1 = new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS, 1);
		DegreeCourse asignaturaDeGrado2 = new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_1, 1);
		DegreeCourse asignaturaDeGrado3 = new DegreeCourse(CORRECT_DEGREE_COURSE_6CREDITS_2, 1);

		MasterCourse asignaturaDeMaster4 = new MasterCourse(CORRECT_MASTER_COURSE_6CREDITS, 1);
		MasterCourse asignaturaDeMaster5 = new MasterCourse(CORRECT_MASTER_COURSE_6CREDITS_1, 1);
		MasterCourse asignaturaDeMaster6 = new MasterCourse(CORRECT_MASTER_COURSE_6CREDITS_2, 1);

		matricula.addCourse(asignaturaDeGrado1);
		matricula.addCourse(asignaturaDeGrado2);
		matricula.addCourse(asignaturaDeGrado3);
		matricula.addCourse(asignaturaDeMaster4);
		matricula.addCourse(asignaturaDeMaster5);
		matricula.addCourse(asignaturaDeMaster6);

		//6 x 6 = 36 creditos 
		
		//excepcion aqui (36+1)
		matricula.addCourse(new MasterCourse(CORRECT_MASTER_COURSE, 1));
	}
	
	//Apartado g): Leer changes.md
	@Ignore
	@Test(expected = PostconditionError.class)
	public void importeDeAsignaturaNoNegativo() {
		
	}
	
	
	//Apartado h): Leer changes.md
	@Ignore
	@Test(expected = InvariantError.class)
	public void importeDeMatriculaNoNegativo() {
		Registration registration = new Registration();
		
	}
		
		

}
