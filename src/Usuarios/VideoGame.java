package Usuarios;

import java.text.NumberFormat;

public class VideoGame { // 1. Creamos la clase video game
    // 2 En este archivo agregamos las propiedades

    /* Array que debe tener las siguientes categorias
     * action, rpg, adventure y racing
     * Estas categorias debe colocarlas dentro de una propiedad static*/

    /*Cuando vayamos a crear una clase de la instancia VideoGame tenemos que
     * pasarle el nombre y el precio, y si el precio es menor que 10 tienes q
     * asignarle el valor de 10 al precio*/



    static String[] categories = {"action", "rpg", "adventure", "racing"}; /* luego de crear
    este array voy a set category*/


    String name;
    double price;
    String category;


    // 3 Creamos los getters y los setters para cada propiedad (metodos)

    // getter

    /*Seguimos con el ejercicio 4
     * Creamos el metodo constructor*/

    // Ejercicio 4

    public VideoGame(String name, double price) {
        this.name = name;
        if (price < 10) {
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.price);
    }

    public String getCategory() {
        return this.category.toUpperCase() + ".";
    }


    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        boolean inInList = false;

        for(String c:VideoGame.categories) {
            /*Cuando queremos hacer referencia a propiedades
        estaticas de una clase dentro de la misma clase tenemos que utilizar el mismo
        nombre de la clase */

            if (c.equals(category)) { //Creamos un fore para recorrer el array
                inInList = true;
                break; // termino la iteracion del for

            }
        }

        if(inInList) {
            this.category = category;
        } else {
            System.out.println("No está :(");
        }
        // creado esto vamos a MainVideoGame.java para probar la implementación
    }

}
