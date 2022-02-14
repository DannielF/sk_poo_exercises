package com.poo.co.exercise_5;

/**
 * Create a Bike vehicle
 * Ej:
 *    Bike suzuki = new Bike(...args);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Bike extends Vehicle{
    private Integer antiquity;
    private Integer cylinder;

    /**
     * Bike constructor
     *
     * @param hasPassengers    boolean
     * @param numberPassengers Integer
     * @param numberWheels     Integer
     * @param plateDate        Integer
     * @param movesOver        String
     * @param antiquity String
     * @param cylinder Integer
     */
    public Bike(boolean hasPassengers, Integer numberPassengers, Integer numberWheels,
                Integer plateDate, String movesOver, Integer antiquity, Integer cylinder) {
        super(hasPassengers, numberPassengers, numberWheels, plateDate, movesOver);
        this.antiquity = antiquity;
        this.cylinder = cylinder;
    }

    /**
     * Getter
     * @return
     * Antiquity - Integer
     */
    public Integer Antiquity() {
        return antiquity;
    }

    /**
     * Setter
     * @param antiquity Integer
     */
    public void setAntiquity(Integer antiquity) {
        this.antiquity = antiquity;
    }

    /**
     * Getter
     * @return
     * Cylinder - Integer
     */
    public Integer cylinder() {
        return cylinder;
    }

    /**
     * Setter
     * @param cylinder Boolean
     */
    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * Print data of the bike
     */
    @Override
    void printDataVehicle() {
        System.out.println("Tipo moto \s");
        super.printDataVehicle();
        System.out.printf("Antiguedad = %d"+" －O－ Cilindraje = %b c.c%n", antiquity, cylinder);
    }
}
