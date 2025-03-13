package Examen;

public class Usuario extends Persona {
    private int numeroUsuario;

    // Constructor
    public Usuario(String nombre, String dni, int numeroUsuario) {
        super(nombre, dni);
        this.numeroUsuario = numeroUsuario;
    }

    // Getter
    public int getNumeroUsuario() {
        return numeroUsuario;
    }


    @Override
    public String toString() {
        return super.toString() + ", Número de Usuario: " + numeroUsuario;
    }
}