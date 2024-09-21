package principal;

import modelo.Alumno;
import modelo.Curso;
import modelo.Profesor;

public class Main {
    public static void main(String[] args) {

        // Crear un profesor
        Profesor profesor = new Profesor("Juan Pérez", 12345, "Matemáticas");

        // Crear un curso con el profesor
        Curso curso = new Curso(profesor);

        // Crear alumnos asociados al profesor
        Alumno alumno1 = new Alumno("Carlos Gómez", 54321, profesor, "Fútbol");
        Alumno alumno2 = new Alumno("Ana Martínez", 67890, profesor, "Lectura");
        Alumno alumno3 = new Alumno("María López", 98765, profesor, "Música");

        // Añadir los alumnos al curso
        curso.addAlumno(alumno1);
        curso.addAlumno(alumno2);
        curso.addAlumno(alumno3);

        // Imprimir la información del curso
        System.out.println(curso);
    }
}