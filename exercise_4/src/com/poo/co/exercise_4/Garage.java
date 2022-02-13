package com.poo.co.exercise_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Garage for the vehicles
 * Ej:
 *   Garage obj = new Garage();
 *   obj.addVehicle(new Vehicle(...args));
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Garage{
    private List<Vehicle> newVehicle;

    /**
     * Garage constructor
     * ArrayList of vehicles
     */
    public Garage() {
        this.newVehicle = new ArrayList<>();
    }

    /**
     * Add a new vehicle in the garage
     * @param vehicle Vehicle
     */
    public void addVehicle(Vehicle vehicle){
        newVehicle.add(vehicle);
    }

    /**
     * Print data of the vehicle inside the garage
     */
    public void printDataGarage(){

        System.out.println("Lista de vehiculos: \n");

        if (newVehicle.isEmpty()) {
            System.out.println("Aun no hay vehiculos en el garaje \n" +
                               "Que esperas, ve y agrega uno. \n");
        }

        for (Vehicle vehicle: newVehicle) {
            System.out.println("------------------");
            vehicle.printDataVehicle();
        }
    }
}
