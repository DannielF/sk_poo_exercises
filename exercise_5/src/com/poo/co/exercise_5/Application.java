package com.poo.co.exercise_5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The program runs from here
 * Create different types of vehicles
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Application {

    /**
     * Print the params necessary to create a new object
     * and a few examples.
     */
    public static void printRequiredParams(){
        System.out.println("""
                        Que Vehiculo quieres crear: \s
                        Tenemos = bicicleta, moto, carro, camión or lancha. \s
                        Escribe el vehiculo a crear y sus respectivos parametros: \s
                        Escribre los siguientes parametos separados por un espacio.\s
                        tiene pasajeros{boleano}, numero pasajeros{entero}, numero ruedas{entero},
                        fecha placa{entero}, se desplaza por{texto}.
                        \s
                        Para crear una bicicleta agregas estos: tiene luces{boleano}, marca{texto}. \s
                        Para crear una moto agregas estos: antiguedad{entero}, cilindraje{entero}. \s
                        Para crear un carro agregas estos: es todo terreno{boleano}, color{texto}. \s
                        Para crear un camión agregas estos: peso carga{decimal}, tiene cuarto frio{boleano}. \s
                        Para crear un bote agregas estos: tipo bote{texto}, nombre{texto}. \s
                        \s
                        Ej bicicleta: bicicleta true 2 2 2011 tierra true shimano.\s
                        Ej carro: carro false 0 4 2005 tierra true verde. \s
                        Ej lancha: lancha true 4 0 2001 agua velero simba. \s
                        \s
                        """);
    }

    /**
     * Create vehicles with the user input, these vehicles are stored inside an ArrayList.
     * @param args command console
     */
    public static void main(String... args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Scanner optionUser = new Scanner(System.in);
        String optionSelected;

        do {
            System.out.println("""
                \s
                Bienvenido a creando vehiculos 🛸\s
                \s
                Elige la opción 1 si quieres crear un nuevo vehiculo. \s
                Elige la opción 2 si quieres ver la información de cada vehiculo. \s
                Elige la opción 3 para salir del programa. \s
                """);

            optionSelected = optionUser.nextLine();

            if ("1".equals(optionSelected)) {
                printRequiredParams();
                String vehicleSelect = optionUser.nextLine();
                String[] paramsVehicle = vehicleSelect.split("\\s+");

                String typeVehicle = paramsVehicle[0];
                boolean hasPassengers = Boolean.parseBoolean(paramsVehicle[1]);
                Integer numberPassengers = Integer.parseInt(paramsVehicle[2]);
                Integer numberWheels = Integer.parseInt(paramsVehicle[3]);
                Integer plateDate = Integer.parseInt(paramsVehicle[4]);
                String movesOver = paramsVehicle[5];

                if ("bicicleta".equals(typeVehicle)) {
                    boolean hasLights = Boolean.parseBoolean(paramsVehicle[6]);
                    String brand = paramsVehicle[7];
                    vehicles.add(new Bicycle(hasPassengers, numberPassengers, numberWheels, plateDate,
                            movesOver, hasLights, brand));

                }else if ("moto".equals(typeVehicle)) {
                    Integer antiquity = Integer.parseInt(paramsVehicle[6]);
                    Integer cylinder = Integer.parseInt(paramsVehicle[7]);
                    vehicles.add(new Bike(hasPassengers, numberPassengers, numberWheels, plateDate,
                            movesOver, antiquity, cylinder));

                }else if ("carro".equals(typeVehicle)) {
                    boolean isAllTerrain = Boolean.parseBoolean(paramsVehicle[6]);
                    String color = paramsVehicle[7];
                    vehicles.add(new Car(hasPassengers, numberPassengers, numberWheels, plateDate,
                            movesOver, isAllTerrain, color));

                }else if ("camion".equals(typeVehicle)) {
                    double weightLoad = Double.parseDouble(paramsVehicle[6]);
                    boolean hasColdRoom = Boolean.parseBoolean(paramsVehicle[7]);
                    vehicles.add(new Truck(hasPassengers, numberPassengers, numberWheels, plateDate,
                            movesOver, weightLoad, hasColdRoom));

                } else if ("lancha".equals(typeVehicle)) {
                    String typeBoat = paramsVehicle[6];
                    String name = paramsVehicle[6];
                    vehicles.add(new Boat(hasPassengers, numberPassengers, numberWheels, plateDate,
                            movesOver, typeBoat, name));
                }

            }else if ("2".equals(optionSelected)) {
                System.out.println("*** Lista de vehiculos ***");
                if(vehicles.isEmpty()){
                    System.out.println("No hay vehiculos aun, ve y crea vehiculos");
                }
                for (Vehicle vehicle: vehicles) {
                    System.out.println("---------------------");
                    vehicle.printDataVehicle();
                }
            }
        } while ("1".equals(optionSelected) || "2".equals(optionSelected));
    }
}
