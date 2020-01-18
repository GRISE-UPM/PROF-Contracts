package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),
	INCORRECT_DEGREE_COURSE ("XDEGREE", "Correct degree course", 5),
	
	INCORRECT_CREDITS_DEGREE_COURSE ("DEGREE", "Incorrect number of credits for course", 7),
	INCORRECT_CREDITS_MASTER_COURSE ("MASTER", "Incorrect number of credits for course", 0),
	DEGREE_COURSE_40ECTS ("DEGREE", "Incorrect ECTS credits for course", 40);
	//MASTER_COURSE_40ECTS ("MASTER", "Incorrect ECTS credits for course", 40);
	
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
