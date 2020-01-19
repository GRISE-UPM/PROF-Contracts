package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 6),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 6),
	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_9 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE_10 ("DEGREE", "Correct degree course", 6),
	INCORRECT_DEGREE_COURSE ("DEGREE", "More than 6 credits degree course", 8),
	INCORRECT_MASTER_COURSE ("MASTER", "More than 6 credits master course", 8),
	INCORRECT_DEGREE_COURSE_1 ("DEGREE", "Less than 6 credits degree course", 0),
	INCORRECT_MASTER_COURSE_1 ("MASTER", "Less than 6 credits master course", 0);
	
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
