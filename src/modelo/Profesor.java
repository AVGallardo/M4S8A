package modelo;

import interfaz.InterfacePersona;

public class Profesor extends Persona implements InterfacePersona {
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, int identificador, String especialidad) {
        super(nombre, identificador);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + getNombre() + '\'' +
                ", identificador='" + getIdentificador() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    @Override
    public void read() {
        System.out.println("Leyendo desde profesor");
    }

    @Override
    public void doTask() {
        System.out.println("Haciendo desde profesor");
    }
}
