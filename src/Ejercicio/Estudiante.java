package Ejercicio;

public class Estudiante {
    private int idMatricula; // Se cambió el nombre a camelCase
    private String nombre;
    private int edad;

    // Constructor
    public Estudiante(int idMatricula, String nombre, int edad) {
        this.idMatricula = idMatricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos Getter y Setter
    public int getIdMatricula() {  // Se corrige el método vacío
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método toString mejorado
    @Override
    public String toString() {
        return "Estudiante{" +
                "idMatricula=" + idMatricula +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
