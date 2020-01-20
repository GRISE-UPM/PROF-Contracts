package es.upm.grise.profundizacion.contratos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.java.contract.PostconditionError;
import com.google.java.contract.InvariantError;
import com.google.java.contract.PreconditionError;

import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.registration.Registration;

import static es.upm.grise.profundizacion.contratos.CourseDataValuesTest.*;

public class SmokeTest {

	/**
	 * A
	 * 
	 * Asignaturas con mas de 6 o menos de 1 creditos.
	 */
	@Test(expected = PreconditionError.class)
	public void correctCreditsDegree() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(INCORRECT_DEGREE_CREDITS, NUM_REGISTRATION);
	}

	/**
	 * A
	 * 
	 * Asignaturas con mas de 6 o menos de 1 creditos.
	 */
	@Test(expected = PreconditionError.class)
	public void correctCreditsMaster() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(INCORRECT_MASTER_CREDITS, NUM_REGISTRATION);
	}

	/**
	 * B
	 * 
	 * Alumno con mas de 6 o menos de 1 asignaturas.
	 */
	@Test(expected = PreconditionError.class)
	public void studentBetween1And6() {
		int NUM_REGISTRATION_INVALID = 7;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION_INVALID);
	}

	/**
	 * C
	 * 
	 * Matriculas de grado sin matriculas de master
	 */
	@Test(expected = PreconditionError.class)
	public void degreeCoursesCannotBeInstantiatedWithAMASTERLevelCourse() {
		int NUM_REGISTRATION = 1;
		new DegreeCourse(CORRECT_DEGREE_COURSE, NUM_REGISTRATION);
	}

	/**
	 * D
	 * 
	 * Matriculas de master sin matriculas de grado
	 */
	@Test
	public void masterCoursesCannotBeInstantiatedWithADEGREELevelCourse() {
		int NUM_REGISTRATION = 1;
		new MasterCourse(CORRECT_MASTER_COURSE, NUM_REGISTRATION);
	}

	/**
	 * E
	 * 
	 * Max 10 Registration
	 */
	@Test(expected = InvariantError.class)
	public void max10Registration() {
		Registration registration = new Registration();

		// 3 creditos each
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE2, 2);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE3, 3);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE4, 4);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE5, 5);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE6, 6);
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE7, 1);
		DegreeCourse degreeCourse8 = new DegreeCourse(CORRECT_DEGREE_COURSE8, 2);
		DegreeCourse degreeCourse9 = new DegreeCourse(CORRECT_DEGREE_COURSE9, 3);
		DegreeCourse degreeCourse10 = new DegreeCourse(CORRECT_DEGREE_COURSE10, 4);
		DegreeCourse degreeCourse11 = new DegreeCourse(CORRECT_DEGREE_COURSE11, 5);

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

	/**
	 * F
	 * 
	 * Max 10 Registration
	 */
	@Test(expected = InvariantError.class)
	public void max36Credits() {
		Registration registration = new Registration();

		// 3 creditos each
		DegreeCourse degreeCourse1 = new DegreeCourse(CORRECT_DEGREE_COURSE, 1);
		DegreeCourse degreeCourse2 = new DegreeCourse(CORRECT_DEGREE_COURSE2, 2);
		DegreeCourse degreeCourse3 = new DegreeCourse(CORRECT_DEGREE_COURSE3, 3);
		DegreeCourse degreeCourse4 = new DegreeCourse(CORRECT_DEGREE_COURSE4, 4);
		DegreeCourse degreeCourse5 = new DegreeCourse(CORRECT_DEGREE_COURSE5, 5);
		DegreeCourse degreeCourse6 = new DegreeCourse(CORRECT_DEGREE_COURSE6, 6);
		DegreeCourse degreeCourse7 = new DegreeCourse(CORRECT_DEGREE_COURSE7, 1);

		// 10 creditos each
		DegreeCourse degreeCourse12 = new DegreeCourse(CORRECT_DEGREE_COURSE12, 3);
		DegreeCourse degreeCourse13 = new DegreeCourse(CORRECT_DEGREE_COURSE13, 4);
		DegreeCourse degreeCourse14 = new DegreeCourse(CORRECT_DEGREE_COURSE14, 5);

		registration.addCourse(degreeCourse1);
		registration.addCourse(degreeCourse2);
		registration.addCourse(degreeCourse3);
		registration.addCourse(degreeCourse4);
		registration.addCourse(degreeCourse5);
		registration.addCourse(degreeCourse6);
		registration.addCourse(degreeCourse7);
		registration.addCourse(degreeCourse12);
		registration.addCourse(degreeCourse13);
		registration.addCourse(degreeCourse14);
	}

}
