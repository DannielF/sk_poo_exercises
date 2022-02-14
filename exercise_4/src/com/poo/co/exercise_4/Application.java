package com.poo.co.exercise_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The program runs from here
 * Create vehicles to store them inside the garage
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Application {

    /**
     * Print instructions to run the programs
     * Create vehicles with the user input
     * @param args command console
     */
    public static void main(String[] args) {

        Garage newGarage = new Garage();
        Scanner optionUser = new Scanner(System.in);
        String optionSelected;

        do {
            System.out.println("""
                    \s
                    Bienvenido a creando vehiculos - ejercicio 4 \s
                    \s
                    Elige la opción 1 si quieres crear un nuevo vehiculo. \s
                    Elige la opción 2 si quieres ver la información de cada vehiculo. \s
                    Elige la opción 3 para salir del programa. \s
                    """);

            optionSelected = optionUser.nextLine();

            if ("1".equals(optionSelected)) {
                System.out.println("""
                        Cada vehiculo tiene las siguientes caracteristicas:\s
                        id, tiene pasajeros, numero de pasajeros, numero de ruedas, fecha de la placa,
                        se desplaza por. \s
                        \s
                        Ej: 1 true 2 2 2020 tierra\s
                        Ej: 2 false 0 0 2003 aire\s
                        \s""");

                Scanner inputVehicle = new Scanner(System.in);
                ArrayList<Object> paramsVehicle = new ArrayList<Object>();

                String[] dataTypes = {"Integer", "Boolean", "Integer", "Integer", "Integer", "String"};
                String[] infoValues = {"Id", "Tiene pasajeros", "Numero de pasajeros", "Numero de ruedas",
                        "Fecha de la placa", "Se desplaza por"};

                int dataTypesLen = dataTypes.length;
                for (int i = 0; i < dataTypesLen; i++) {
                    System.out.println(infoValues[i]+" :");
                    switch (dataTypes[i]) {
                        case "Integer" -> paramsVehicle.add(inputVehicle.nextInt());
                        case "Boolean" -> paramsVehicle.add(inputVehicle.nextBoolean());
                        case "String" -> paramsVehicle.add(inputVehicle.next());
                    }
                }
                newGarage.addVehicle(new Vehicle((int)paramsVehicle.get(0), (boolean)paramsVehicle.get(1),
                        (int)paramsVehicle.get(2), (int)paramsVehicle.get(3), (int)paramsVehicle.get(4),
                        (String) paramsVehicle.get(5)));

            } else if ("2".equals(optionSelected)) {
                newGarage.printDataGarage();
            }



        } while ("1".equals(optionSelected) || "2".equals(optionSelected));
    }
}
