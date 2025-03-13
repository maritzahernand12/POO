package Ejercicio;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Escuela CES = new Escuela("Escuela Nacional Superior Técnica");
        // Ejemplo de estudiantes
        Estudiante alumno1 = new Estudiante(1, "Juan", 20);
        Estudiante alumno2 = new Estudiante(2, "Maria", 19);

        // Agregar los estudiantes iniciales
        CES.agregarEstudiante(alumno1);
        CES.agregarEstudiante(alumno2);

        Scanner sc = new Scanner(System.in);
        int op;

        do {
            menu();
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, ingresa un número válido.");
                sc.next();
            }
            op = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (op) {
                case 1:
                    int idm = CES.getEstudiantes().size() + 1;
                    System.out.print("Dame nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Dame edad: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor, ingresa una edad válida.");
                        sc.next();
                    }
                    int edad = sc.nextInt();
                    sc.nextLine();

                    CES.agregarEstudiante(new Estudiante(idm, nombre, edad));
                    System.out.println("Estudiante añadido con éxito.");
                    break;

                case 2:
                    System.out.print("Dame id de matrícula: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor, ingresa un número válido.");
                        sc.next();
                    }
                    int idModificar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Dame nuevo nombre: ");
                    String nuevoNombre = sc.nextLine();

                    System.out.print("Dame nueva edad: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor, ingresa una edad válida.");
                        sc.next();
                    }
                    int nuevaEdad = sc.nextInt();
                    sc.nextLine();

                    CES.modificarEstudiante(idModificar, nuevoNombre, nuevaEdad);
                    break;

                case 3:
                    System.out.print("Dame id de matrícula: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Por favor, ingresa un número válido.");
                        sc.next();
                    }
                    int idEliminar = sc.nextInt();
                    sc.nextLine();

                    CES.eliminarEstudiante(idEliminar);
                    break;

                case 4:
                    CES.imprimirEstudiantes();
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (op != 5);

        sc.close(); // Cerrar el scanner
    }

    // Método para mostrar el menú
    public static void menu() {
        System.out.println("\n--- Menú ---");
        System.out.println("1. Añadir alumno");
        System.out.println("2. Modificar alumno");
        System.out.println("3. Eliminar alumno");
        System.out.println("4. Imprimir alumnos");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
