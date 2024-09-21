package modelo;

import interfaz.InterfacePersona;

public class Alumno extends Persona implements InterfacePersona {
    private Profesor profesor;
    private String hobby;

    public Alumno() {
    }

    public Alumno(String nombre, int identificador, Profesor profesor, String hobby) {
        super(nombre, identificador);
        this.profesor = profesor;
        this.hobby = hobby;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                ", nombre='" + getNombre() + '\'' +
                ", identificador='" + getIdentificador() + '\'' +
                ", profesor=" + profesor +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    @Override
    public void read() {
        System.out.println("Leyendo desde Alumno");
    }

    @Override
    public void doTask() {
        System.out.println("Haciendo desde Alumno");
    }
}
