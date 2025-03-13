 class User {
    static String tableName = "user"; // Usando el Método estático luego
     // podemos crear usuarios en una bbdd

    // se ha creado una clase en java
     // 1 vamos a crear una nueva propiedad
     double id = Math.random();  // le estamos asignado una propiedad de id a nuestra
      // clase de usuario con un valor aleatorio
     String name; // 3 indico tipo y nombre a esta propiedad

      // CREAR UN METODO

     // METODO CONSTRUCTOR
     //Con este metodo puedo asignar valores inicialea a un objeto cuando lo estamos
     // creando a partir de una clase|

     User (String name) {
         this.name = name;
     }

      public void saludar () {
           System.out.println("Hola Mama! soy " + tableName); // estamos haciendo referencia
           // a una instancia de la clase de usuario
      }
      public static void guardar (User user) { //metodo publico y estatico para guardar usuarios

          System.out.println("Guardando usuario  " + user.name);

      }
      // 3 Me devueldo a Main.java
}
