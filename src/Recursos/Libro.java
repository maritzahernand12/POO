package Recursos;

import Examen.Autor;

public class Libro {
    private String titulo;
    private String idLibro;
    private Autor autor;
    private boolean prestado;

    public Libro(String titulo, String idLibro, Autor autor) {
        this.titulo = titulo;
        this.idLibro = idLibro;
        this.autor = autor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIdLibro() {
        return idLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }


    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
        }
    }


    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no estaba prestado.");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", ID: " + idLibro + "\n" +
                "Autor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")\n" +
                "Estado: " + (prestado ? "Prestado" : "Disponible");
    }
}