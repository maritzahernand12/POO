package Examen;

public class Persona {

    private String nombre;
    private String dni;

    // Constructor
    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni;
    }
}