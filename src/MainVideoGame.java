import Usuarios.VideoGame;

public class MainVideoGame {
    public static void main (String[] args) {
        VideoGame vg = new VideoGame("God of war", 25);
        vg.setName("God of war");
        // 4. Creamos la instancia VideoGame
        //vg.setName("God of war"); // llamamos a un Setter y le damos un nombre
        vg.setCategory("action");

        System.out.println(vg.getName());
        System.out.println(vg.getPrice());
        }
}

/*Enunciados del Ejercicio
* Crear la clase Video Game
* Con las propiedades:
    *name string
    * price double
    * category string
* Agregar Getters y Setters para todas las propiedades    */