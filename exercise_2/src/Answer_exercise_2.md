## Respuesta al ejercicio 2
    
    Si es posible ejecutar un programa que contenga clases con varios metodos main.

### Determinando el punto de acceso
    
    Al menos una clase debe contener metodo main publico asi el JVM puede iniciar la clase como hilo principal.

    Solo el metodo main con un solo string array como parametro es considerado como un punto de entrada. 
    JVM solo busca el metodo main con un string array como argumento, en orden para ejecutar otros metodos main.
    necesitas llamarlos desde adentro del public stativ void main(String[] args).

### Ejemplo en Java
```Java
class GFG {
    
    // Method 1
    // Main driver method
    public static void main(int i)
    {
        // Print statement for method 1
        System.out.println(i);
    }
     
    // Method 2
    // Main driver method
    public static void main(String s)
    {
        // Print statement for method 2
        System.out.println(s);
    }
     
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
    // Calling above 2 main methods
        main(1);
        main("hi");
    }
}
```