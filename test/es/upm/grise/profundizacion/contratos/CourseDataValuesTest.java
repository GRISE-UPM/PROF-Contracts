package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public enum CourseDataValuesTest implements CourseData {
	
	GRADO_CORRECTO("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO ("MASTER", "Correct master course", 3),
	GRADO_INCORRECTO("DEGREE", "Curso correcto", 20),
	MASTER_INCORRECTO ("MASTER", "Correct master course", 6),
	GRADO_CORRECTO1("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO1 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO2("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO2 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO3("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO3 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO4("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO4 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO5("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO5 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO6("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO6 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO7("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO7 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO8("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO8 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO9("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO9 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO10("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO10 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO11("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO11 ("MASTER", "Correct master course", 3),
	GRADO_CORRECTO12("DEGREE", "Curso correcto", 5),
	MASTER_CORRECTO12 ("MASTER", "Correct master course", 3);;
	
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
