package com.poo.co.exercise_1;

import java.util.Scanner;

/**
 * The program runs from here
 * Print solar system info
 * Allow you to calculate gravitational force between two planets
 * @version 1.0.0 02-12-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Application {

    /**
     * Print program instructions
     */
    public static void printInstructions(){
        System.out.println("""
                \s
                *** Bienvenido al sistema solar *** \s
                Aqui puedes conocer los planetas del sistema solar \s
                y calcular la atracción gravitatoria entre \s
                dos cuerpos del sistema. \s
                \s
                * Elige la opción 1 para calcular la fuerza gravitacional entre dos planetas
                luego digita el id de los planetas separados por espacio. \s
                \s
                * Elige la opción 2 para salir del programa.
                """);
    }

    /**
     * Entry point
     * @param args command console
     */
    public static void main(String[] args) {

        SolarSystem milkyWay = new SolarSystem("MilkyWay", "Aios");
        milkyWay.addPlanet(
                new Planet(1,"Tierra", 5972e24, 5.51, 12.742, 149.6));
        milkyWay.addPlanet(
                new Planet(2, "Marte", 6.39e23, 3.93, 6.779, 227.9));
        milkyWay.addPlanet(
                new Planet(3, "Jupiter", 1898e27, 1.33, 139.820, 778.5));
        milkyWay.addPlanet(
                new Planet(4, "Saturno", 5683e26, 687, 116.460, 1434));
        milkyWay.addPlanet(
                new Planet(5, "Urano", 8681e25, 1.27, 50.724, 2871));
        milkyWay.addPlanet(
                new Planet(6, "Neptuno", 1024e26, 1.64, 49.244, 4495));

        printInstructions();
        milkyWay.printDataSolarSystem();

        Scanner optionUser = new Scanner(System.in);
        String optionSelected;

        do {
            System.out.println("\n Digita tu opción: \n");
            optionSelected = optionUser.nextLine();
            if (!"2".equals(optionSelected)) {
                milkyWay.calculateGravitationalForce();
            }

        } while ("1".equals(optionSelected));
    }
}
