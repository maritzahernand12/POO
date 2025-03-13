package Ejercicio;

import java.util.LinkedList;
import java.util.List;

public class Escuela {
    private String nombre;
    private List<Estudiante> estudiantes = new LinkedList<>();

    public Escuela(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante nuevo) {
        estudiantes.add(nuevo);
        System.out.println("✅ Estudiante agregado con éxito: " + nuevo.getNombre() + " (Matrícula: " + nuevo.getIdMatricula() + ")");
    }

    public void imprimirEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("⚠ No hay estudiantes registrados.");
            return;
        }
        System.out.println("\n📋 Lista de estudiantes en " + nombre + ":");
        for (Estudiante aux : estudiantes) {
            System.out.println("📌 Matrícula: " + aux.getIdMatricula() + " | Nombre: " + aux.getNombre() + " | Edad: " + aux.getEdad());
        }
    }

    public void eliminarEstudiante(int idMatricula) {
        boolean eliminado = estudiantes.removeIf(est -> est.getIdMatricula() == idMatricula);
        if (eliminado) {
            System.out.println("🗑️ Estudiante con matrícula " + idMatricula + " eliminado con éxito.");
        } else {
            System.out.println("⚠ Estudiante con matrícula " + idMatricula + " no encontrado.");
        }
    }

    public void modificarEstudiante(int idMatricula, String nuevoNombre, int nuevaEdad) {
        Estudiante estudiante = buscarEstudiantePorMatricula(idMatricula);
        if (estudiante != null) {
            estudiante.setNombre(nuevoNombre);
            estudiante.setEdad(nuevaEdad);
            System.out.println("✅ Modificación realizada: Nuevo nombre: " + nuevoNombre + ", Nueva edad: " + nuevaEdad);
        } else {
            System.out.println("⚠ Estudiante con matrícula " + idMatricula + " no encontrado.");
        }
    }

    // Método para buscar estudiante por matrícula
    private Estudiante buscarEstudiantePorMatricula(int idMatricula) {
        return estudiantes.stream().filter(e -> e.getIdMatricula() == idMatricula).findFirst().orElse(null);
    }
}
