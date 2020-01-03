package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
 	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),
 	ERRONEOUS_DEGREE_COURSE ("DEGREE", "More than 6 credits degree course", 10),
 	ERRONEOUS_MASTER_COURSE ("MASTER", "More than 6 credits master course", 9),
 	CORRECT_DEGREE_COURSE0 ("DEGREE", "Correct degree course", 5),
 	CORRECT_DEGREE_COURSE1 ("DEGREE", "Correct degree course", 4),
 	CORRECT_DEGREE_COURSE2 ("DEGREE", "Correct degree course", 3),
 	CORRECT_DEGREE_COURSE3 ("DEGREE", "Correct degree course", 2),
 	CORRECT_DEGREE_COURSE4 ("DEGREE", "Correct degree course", 1),
 	CORRECT_DEGREE_COURSE5 ("DEGREE", "Correct degree course", 2),
 	CORRECT_DEGREE_COURSE6 ("DEGREE", "Correct degree course", 3),
 	CORRECT_DEGREE_COURSE7 ("DEGREE", "Correct degree course", 4),
 	CORRECT_DEGREE_COURSE8 ("DEGREE", "Correct degree course", 5),
 	CORRECT_DEGREE_COURSE9 ("DEGREE", "Correct degree course", 6),
 	CORRECT_DEGREE_COURSE10 ("DEGREE", "Correct degree course", 6),
 	CORRECT_DEGREE_COURSE11 ("DEGREE", "Correct degree course", 5);
	
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
