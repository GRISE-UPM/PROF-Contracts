package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),

	ZERO_DEGREE_CREDITS ("DEGREE", "Incorrect degree course", 0),
	SEVEN_DEGREE_CREDITS ("DEGREE", "Incorrect degree course", 7),

	ZERO_MASTER_CREDITS ("MASTER", "Incorrect master course", 0),
	SEVEN_MASTER_CREDITS ("MASTER", "Incorrect master course", 7),

	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Correct degree course 1", 3),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course 2", 3),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course 3", 3),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course 4", 3),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course 5", 3),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course 6", 3),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course 7", 3),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course 8", 6),
	CORRECT_DEGREE_COURSE_9 ("DEGREE", "Correct degree course 9", 6),
	CORRECT_DEGREE_COURSE_10 ("DEGREE", "Correct degree course 10", 6),
	CORRECT_DEGREE_COURSE_11 ("DEGREE", "Correct degree course 11", 6),
	CORRECT_DEGREE_COURSE_12 ("DEGREE", "Correct degree course 12", 6),
	CORRECT_DEGREE_COURSE_13 ("DEGREE", "Correct degree course 13", 6);
	
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
