package Recursos;

public class Base {

    public String name; /* PROPIEDADES (1ro se agregan las propiedades y
     luego el CONSTRUCTOR

    vamos a crear un CONSTRUCTOR */

    public Base(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    // Setters
    public void setName() {
        this.name = name;
    }

    public String miMetodo () {
        return "Hola Mundo";
    }
}
