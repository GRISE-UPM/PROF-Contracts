package es.upm.grise.profundizacion.contratos;


import es.upm.grise.profundizacion.contratos.courses.DegreeCourse;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Degree Subject", 1),
	CORRECT_DEGREE_COURSE_1 ("DEGREE", "Degree Subject 1", 1),
	CORRECT_DEGREE_COURSE_2 ("DEGREE", "Degree Subject 2", 1),
	CORRECT_DEGREE_COURSE_3 ("DEGREE", "Degree Subject 3", 1),
	CORRECT_DEGREE_COURSE_4 ("DEGREE", "Degree Subject 4", 1),
	CORRECT_DEGREE_COURSE_5 ("DEGREE", "Degree Subject 5", 1),
	
	CORRECT_MASTER_COURSE ("MASTER", "Master Subject", 1),
	CORRECT_MASTER_COURSE_1 ("MASTER", "Master Subject 1", 1),
	CORRECT_MASTER_COURSE_2 ("MASTER", "Master Subject 2", 1),
	CORRECT_MASTER_COURSE_3 ("MASTER", "Master Subject 3", 1),
	CORRECT_MASTER_COURSE_4 ("MASTER", "Master Subject 4", 1),
	CORRECT_MASTER_COURSE_5 ("MASTER", "Master Subject 5", 1),
	
	
	MORE_THAN_6_CREDITS_DEGREE("DEGREE", "Degree with more than 6 credits",7),
	
	
	CORRECT_DEGREE_COURSE_6CREDITS("DEGREE", "Degree Subject with 6 credits",6),
	CORRECT_DEGREE_COURSE_6CREDITS_1("DEGREE", "Degree Subject with 6 credits (1)",6),
	CORRECT_DEGREE_COURSE_6CREDITS_2("DEGREE", "Degree Subject with 6 credits (2)",6),
	
	CORRECT_MASTER_COURSE_6CREDITS("MASTER", "Master Subject with 6 credits",6),
	CORRECT_MASTER_COURSE_6CREDITS_1("MASTER", "Master Subject with 6 credits (1)",6),
	CORRECT_MASTER_COURSE_6CREDITS_2("MASTER", "Master Subject with 6 credits(2)",6);
	
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
