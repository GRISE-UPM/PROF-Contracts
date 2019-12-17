package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),
	MORE_THAN_6_CREDITS_DEGREE_COURSE ("MATER", "More than 6 credits degree course", 8),
	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Correct degree course 1", 5),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Correct degree course 2", 5),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Correct degree course 3", 5),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Correct degree course 4", 5),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Correct degree course 5", 5),
	CORRECT_DEGREE_COURSE_6 ("DEGREE", "Correct degree course 6", 5),
	CORRECT_DEGREE_COURSE_7 ("DEGREE", "Correct degree course 7", 5),
	CORRECT_DEGREE_COURSE_8 ("DEGREE", "Correct degree course 8", 5),
	CORRECT_DEGREE_COURSE_9 ("DEGREE", "Correct degree course 9", 5),
	CORRECT_DEGREE_COURSE_10 ("DEGREE", "Correct degree course 10", 5),
	CORRECT_DEGREE_COURSE_11 ("DEGREE", "Correct degree course 11", 5);
	
	
	
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
