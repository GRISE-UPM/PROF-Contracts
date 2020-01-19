package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {

	CORRECT_DEGREE_COURSE("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE("MASTER", "Correct master course", 3),

	DEGREE_WITH_ZERO_CREDITS("DEGREE", "Incorrect degree course with 0 credits", 0),
	MASTER_WITH_ZERO_CREDITS("MASTER", "Incorrect master course with 0 credits", 0),

	DEGREE_WITH_SEVEN_CREDITS("DEGREE", "Incorrect degree course with 7 credits", 7),
	MASTER_WITH_SEVEN_CREDITS("MASTER", "Incorrect degree course with 7 credits", 7),

	DEGREE_COURSE_N1("DEGREE", "Correct degree course number 1", 2),
	DEGREE_COURSE_N2("DEGREE", "Correct degree course number 2", 2),
	DEGREE_COURSE_N3("DEGREE", "Correct degree course number 3", 2),
	DEGREE_COURSE_N4("DEGREE", "Correct degree course number 4", 2),
	DEGREE_COURSE_N5("DEGREE", "Correct degree course number 5", 2),
	DEGREE_COURSE_N6("DEGREE", "Correct degree course number 6", 2),
	DEGREE_COURSE_N7("DEGREE", "Correct degree course number 7", 2),
	DEGREE_COURSE_N8("DEGREE", "Correct degree course number 8", 4),
	DEGREE_COURSE_N9("DEGREE", "Correct degree course number 9", 4),
	DEGREE_COURSE_N10("DEGREE", "Correct degree course number 10", 2),
	DEGREE_COURSE_N11("DEGREE", "Correct degree course number 11", 6),
	DEGREE_COURSE_N12("DEGREE", "Correct degree course number 12", 6),
	DEGREE_COURSE_N13("DEGREE", "Correct degree course number 13", 6);

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
