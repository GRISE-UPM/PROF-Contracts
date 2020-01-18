package es.upm.grise.profundizacion.contratos;

import es.upm.grise.profundizacion.contratos.courses.Course;
import es.upm.grise.profundizacion.contratos.values.CourseData;

public class CourseDoubleNegativeFee extends Course {

    public CourseDoubleNegativeFee( CourseData course, int numRegistrations) {
        super(course, numRegistrations);
        this.courseData = course;
    }

    @Override
    public double getFee() {
        return -1;
    }
}
