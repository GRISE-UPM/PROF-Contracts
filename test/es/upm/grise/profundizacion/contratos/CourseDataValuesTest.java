package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),
	MORE_CREDITS_MASTER_COURSE ("MASTER", "Master course with more than 6 credits", 7),
	LESS_CREDITS_MASTER_COURSE ("MASTER", "Master course with less than 1 credit", 0),
	MORE_CREDITS_DEGREE_COURSE ("DEGREE", "Degree course with more than 6 credits", 7),
	LESS_CREDITS_DEGREE_COURSE ("DEGREE", "Degree course with less than 1 credit", 0),
	MORE_REGISTRATIONS_MASTER_COURSE ("MASTER", "Master course with more than 6 registrations", 7),
	LESS_REGISTRATIONS_MASTER_COURSE ("MASTER", "Master course with less than 1 registrations", 0),
	MORE_REGISTRATIONS_DEGREE_COURSE ("DEGREE", "Degree course with more than 6 registrations", 7),
	LESS_REGISTRATIONS_DEGREE_COURSE ("DEGREE", "Degree course with less than 1 registrations", 0),
	COURSE_1 ("DEGREE", "Course 1", 5),
	COURSE_2 ("DEGREE", "Course 2", 5),
	COURSE_3 ("DEGREE", "Course 3", 5),
	COURSE_4 ("DEGREE", "Course 4", 5),
	COURSE_5 ("DEGREE", "Course 5", 5),
	COURSE_6 ("DEGREE", "Course 6", 5),
	COURSE_7 ("DEGREE", "Course 7", 5),
	COURSE_8 ("DEGREE", "Course 8", 5),
	COURSE_9 ("DEGREE", "Course 9", 5),
	COURSE_10 ("DEGREE", "Course 10", 5),
	COURSE_11 ("DEGREE", "Course 11", 5);
	
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
