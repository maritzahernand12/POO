package Examen;

import Recursos.Libro;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("J.K. Rowling", "Británica");

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "L001", autor1);
        Libro libro2 = new Libro("Harry Potter y la piedra filosofal", "L002", autor2);

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();

        // Prestar un libro
        biblioteca.prestarLibro("L001");
        biblioteca.mostrarLibrosDisponibles(); // Solo debería mostrar Harry Potter

        biblioteca.prestarLibro("L001");

        // Devolver el libro
        biblioteca.devolverLibro("L001");
        biblioteca.mostrarLibrosDisponibles(); // Ahora Cien años de soledad debería estar disponible otra vez
    }
}








