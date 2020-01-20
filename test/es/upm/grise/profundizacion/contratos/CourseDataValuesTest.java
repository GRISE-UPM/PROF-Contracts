package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {

	CORRECT_DEGREE_COURSE("DEGREE", "Correct degree course", 3),
	CORRECT_MASTER_COURSE("MASTER", "Correct master course", 3),

	INCORRECT_DEGREE_CREDITS("DEGREE", "Incorrect degree course", 0),
	INCORRECT_MASTER_CREDITS("MASTER", "Incorrect master course", 0),

	CORRECT_DEGREE_COURSE2("DEGREE", "Correct degree course 2", 3),
	CORRECT_DEGREE_COURSE3("DEGREE", "Correct degree course 3", 3),
	CORRECT_DEGREE_COURSE4("DEGREE", "Correct degree course 4", 3),
	CORRECT_DEGREE_COURSE5("DEGREE", "Correct degree course 5", 3),
	CORRECT_DEGREE_COURSE6("DEGREE", "Correct degree course 6", 3),
	CORRECT_DEGREE_COURSE7("DEGREE", "Correct degree course 7", 3),
	CORRECT_DEGREE_COURSE8("DEGREE", "Correct degree course 8", 3),
	CORRECT_DEGREE_COURSE9("DEGREE", "Correct degree course 9", 3),
	CORRECT_DEGREE_COURSE10("DEGREE", "Correct degree course 10", 3),
	CORRECT_DEGREE_COURSE11("DEGREE", "Correct degree course 11", 3),
	CORRECT_DEGREE_COURSE12("DEGREE", "Correct degree course 12", 10),
	CORRECT_DEGREE_COURSE13("DEGREE", "Correct degree course 13", 10),
	CORRECT_DEGREE_COURSE14("DEGREE", "Correct degree course 14", 10);

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
