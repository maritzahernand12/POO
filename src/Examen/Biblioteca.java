package Examen;

import Recursos.Libro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    // Constructor
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }


    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }


    public void prestarLibro(String idLibro) {
        for (Libro libro : libros) {
            if (libro.getIdLibro().equals(idLibro)) {
                if (!libro.isPrestado()) {
                    libro.prestar();
                    return;
                } else {
                    System.out.println("El libro ya está prestado.");
                    return;
                }
            }
        }
        System.out.println("Libro no encontrado.");
    }


    public void devolverLibro(String idLibro) {
        for (Libro libro : libros) {
            if (libro.getIdLibro().equals(idLibro)) {
                if (libro.isPrestado()) {
                    libro.devolver();
                    return;
                } else {
                    System.out.println("El libro no estaba prestado.");
                    return;
                }
            }
        }
        System.out.println("Libro no encontrado.");
    }


    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println("- " + libro.getTitulo() + " (ID: " + libro.getIdLibro() + ")");
            }
        }
    }
}
