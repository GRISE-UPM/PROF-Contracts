package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
 	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),

	DEGREE_COURSE_ERROR ("DEGREE", "Course del grado correcto", 9),
	MASTER_COURSE_ERROR ("MASTER", "Course del master correcto", 10),
	
	CORRECT_DEGREE_COURSE1  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE2  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE3  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE4  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE5  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE6  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE7  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE8  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE9  ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE10 ("DEGREE", "Correct degree course", 3),
	CORRECT_DEGREE_COURSE11 ("DEGREE", "Correct degree course", 3);
	
	/*
	CORRECT_MASTER_COURSE1  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE2  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE3  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE4  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE5  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE6  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE7  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE8  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE9  ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE10 ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE11 ("MASTER", "Correct master course", 3);*/

	
	
	private String level;
	private String name;
	private int credits;

	CourseDataValuesTest(String level, String name, int credits) {
		this.level = level;
		this.name = name;
		this.credits = credits;
	}
	
	public String getLevel() {
		return level;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}
	
}
