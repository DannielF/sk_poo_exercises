package com.poo.co.exercise_5;

/**
 * Create a Boat vehicle
 * Ej:
 *    Boat sail = new Boat(...args);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Boat extends Vehicle{
    private String typeBoat;
    private String name;

    /**
     * Boat constructor
     * @param hasPassengers    boolean
     * @param numberPassengers Integer
     * @param numberWheels     Integer
     * @param plateDate        Integer
     * @param movesOver        String
     * @param typeBoat String
     * @param name String
     */
    public Boat(boolean hasPassengers, Integer numberPassengers, Integer numberWheels,
                Integer plateDate, String movesOver, String typeBoat, String name) {
        super(hasPassengers, numberPassengers, numberWheels, plateDate, movesOver);
        this.typeBoat = typeBoat;
        this.name = name;
    }

    /**
     * Getter
     * @return
     * Type of boat - String
     */
    public String typeBoat() {
        return typeBoat;
    }

    /**
     * Setter
     * @param typeBoat String
     */
    public void setTypeBoat(String typeBoat) {
        this.typeBoat = typeBoat;
    }

    /**
     * Getter
     * @return
     * Name of the boat - String
     */
    public String name() {
        return name;
    }

    /**
     * Setter
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Print data of the boat
     */
    @Override
    void printDataVehicle() {
        System.out.println("Tipo lancha \s");
        super.printDataVehicle();
        System.out.printf("Tipo de lancha = %s"+" －O－ Nombre de la lancha = %s%n", typeBoat, name);
    }
}
