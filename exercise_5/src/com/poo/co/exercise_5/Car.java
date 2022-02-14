package com.poo.co.exercise_5;

/**
 * Create a car vehicle
 * Ej:
 *    Car honda = new Car(...args);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Car extends Vehicle{
    private boolean isAllTerrain;
    private String color;

    /**
     * Car constructor
     * @param hasPassengers    boolean
     * @param numberPassengers Integer
     * @param numberWheels     Integer
     * @param plateDate        Integer
     * @param movesOver        String
     * @param isAllTerrain boolean
     * @param color String
     */
    public Car(boolean hasPassengers, Integer numberPassengers, Integer numberWheels,
               Integer plateDate, String movesOver, boolean isAllTerrain, String color) {
        super(hasPassengers, numberPassengers, numberWheels, plateDate, movesOver);
        this.isAllTerrain = isAllTerrain;
        this.color = color;
    }

    /**
     * Getter
     * @return
     * Is all terrain - boolean
     */
    public boolean AllTerrain() {
        return isAllTerrain;
    }

    /**
     * Setter
     * @param allTerrain Boolean
     */
    public void setAllTerrain(boolean allTerrain) {
        isAllTerrain = allTerrain;
    }

    /**
     * Getter
     * @return
     * Color - String
     */
    public String Color() {
        return color;
    }

    /**
     * Setter
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Print data of the car
     */
    @Override
    void printDataVehicle() {
        System.out.println("Tipo carro \s");
        super.printDataVehicle();
        System.out.printf("Es todo terreno = %b"+" －O－ De color = %s%n", isAllTerrain, color);
    }
}
