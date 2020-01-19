package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.courses.MasterCourse;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public class NegativeMasterCourse extends MasterCourse {

	public NegativeMasterCourse(CourseData course, int numRegistrations) {
		super(course, numRegistrations);
	}

	@Override
	public double getFee() {
		return super.getFee() * -1;
	}
}
	
