package com.poo.co.exercise_6;

/**
 *App class
 * @version 1.0.0 02-14-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Application {

    /**
     * The program runs from here,
     * print instructions.
     * @param args command line
     */
    public static void main(String[] args) {
        System.out.println("""
                \s
                Bienvenido al ejercicio # 4️⃣\s
                Introduce numeros que seran guardados en un vector\s
                si introduces un numero igual al anterior el programa se detendrá\s
                y te mostrará todos los número guardados en el vector.\s
                """);

        VectorMethod.vectorUserInput(10);
    }
}
