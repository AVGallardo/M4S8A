package modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Profesor profesor;
    private List<Alumno> alumnos;

    public Curso(Profesor profesor) {
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "profesor=" + profesor +
                ", alumnos=" + alumnos +
                '}';
    }
}
