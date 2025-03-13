import Usuarios.Permisos;
import Usuarios.User;
import Usuarios.VideoGame;

public class Main {
    public static void main(String[] args) {

        User u = new User("Isabellita");

        Permisos p = new Permisos();
        

// 4 creamos una nueva instancia de nuestra clase de User

        User  user = new User("Isabella");
        // 5 creo un segundo usuario y le asigno otro valor
        User user2 = new User("Ricardo");



     // 6 al imprimirlo veo que tengo propiedades distintas dependiendo de los usuarios que hemos creado

        //System.out.println(user.name);
        //System.out.println(user.id);
        // System.out.println(user2.name);
        //System.out.println(user2.id);




    }

}
// Cada vez que queremos crear un usuario nuevo y/o una nueva instancia de una clase tenemos que
// 1 Usar la palabra reservada de New, seguido del nombre de la clase
// 3 y eso se lo asignamos a una variable que nosotros le podemos dar el nombre
// que queramos, pero que por conveción va a ser igual al nombre de la clase
// pero con minúscula e indicando el tipo
// luego podemos acceder a sus propiedades usando la sintaxtis de .
// entonces tomamos la instancia del usuario, presionamos . y luego podemos
// acceder a la propiedad de estos objetos.


