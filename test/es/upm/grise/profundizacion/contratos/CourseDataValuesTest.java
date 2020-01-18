package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

//sobran la mitad de los cursos, pero se quedan ahi ya que los he hecho
//los que acaban en 6c tienen seis creditos, para pasar de los 36 facilmente
public enum CourseDataValuesTest implements CourseData {
	
	CORRECT_DEGREE_COURSE ("DEGREE", "Correct degree course", 5),
	CORRECT_DEGREE_COURSE1 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE2 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE3 ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE4 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE5 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE6 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE7 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE8 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE9 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE10 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE11 ("DEGREE", "Correct degree course", 1),
	CORRECT_DEGREE_COURSE126C ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE136C ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE146C ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE156C ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE166C ("DEGREE", "Correct degree course", 6),
	CORRECT_DEGREE_COURSE176C ("DEGREE", "Correct degree course", 6),


	CORRECT_MASTER_COURSE ("MASTER", "Correct master course", 3),
	CORRECT_MASTER_COURSE1 ("MASTER", "Correct master course", 5),	
	CORRECT_MASTER_COURSE2 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE3 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE4 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE5 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE6 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE7 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE8 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE9 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE10 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE11 ("MASTER", "Correct master course", 1),	
	CORRECT_MASTER_COURSE126C ("MASTER", "Correct master course", 6),	
	CORRECT_MASTER_COURSE136C ("MASTER", "Correct master course", 6),	
	CORRECT_MASTER_COURSE146C ("MASTER", "Correct master course", 6),	
	CORRECT_MASTER_COURSE156C ("MASTER", "Correct master course", 6),	
	CORRECT_MASTER_COURSE166C ("MASTER", "Correct master course", 6),	
	CORRECT_MASTER_COURSE176C ("MASTER", "Correct master course", 6),	
	CORRECT_MASTER_COURSE186C ("MASTER", "Correct master course", 6),	

	INCORRECT_7CREDITS_DEGREE_COURSE ("DEGREE", "InCorrect degree course", 7),
	INCORRECT_0CREDITS_DEGREE_COURSE ("DEGREE", "InCorrect degree course", 0),
	INCORRECT_7CREDITS_MASTER_COURSE ("MASTER", "InCorrect master course", 7),
	INCORRECT_0CREDITS_MASTER_COURSE ("MASTER", "InCorrect master course", 0);

	
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
