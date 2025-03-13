package Recursos;

public class Categorias extends Base {     // CLASE
    public Categorias(String name) {
        super(name);
        System.out.println("Soy categorías");

    }

    @Override
    public String toString() {
        return this.name;
    }
    public String miMetodo () {
        return "Chao Mundo";
    }
}
