package com.poo.co.exercise_5;

/**
 * Create a bicycle vehicle
 * Ej:
 *    Bicycle shimano = new Bicycle(...args);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Bicycle extends Vehicle{
    private boolean hasLights;
    private String brand;

    /**
     * Bicycle constructor
     * @param hasPassengers    boolean
     * @param numberPassengers Integer
     * @param numberWheels     Integer
     * @param plateDate        Integer
     * @param movesOver        String
     * @param hasLights boolean
     * @param brand String
     */
    public Bicycle(boolean hasPassengers, Integer numberPassengers, Integer numberWheels,
                   Integer plateDate, String movesOver, boolean hasLights, String brand) {
        super(hasPassengers, numberPassengers, numberWheels, plateDate, movesOver);
        this.hasLights = hasLights;
        this.brand = brand;
    }

    /**
     * Getter
     * @return
     * Has lights - boolean
     */
    public boolean hasLights() {
        return hasLights;
    }

    /**
     * Setter
     * @param hasLights boolean
     */
    public void setHasLights(boolean hasLights) {
        this.hasLights = hasLights;
    }

    /**
     * Getter
     * @return
     * Brand - String
     */
    public String brand() {
        return brand;
    }

    /**
     * Setter
     * @param brand String
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Print data of the bicycle
     */
    @Override
    void printDataVehicle() {
        System.out.println("Tipo bicicleta \s");
        super.printDataVehicle();
        System.out.printf("Tiene luces = %b"+" －O－ Marca = %s%n", hasLights, brand);
    }
}
