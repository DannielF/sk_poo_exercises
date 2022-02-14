package com.poo.co.exercise_5;

/**
 * Create a truck vehicle
 * Ej:
 *    Truck NHR = new Truck(...args);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Truck extends Vehicle{
    private double weightLoad;
    private boolean hasColdRoom;

    /**
     * Truck constructor
     * @param hasPassengers    boolean
     * @param numberPassengers Integer
     * @param numberWheels     Integer
     * @param plateDate        Integer
     * @param movesOver        String
     * @param weightLoad double
     * @param hasColdRoom boolean
     */
    public Truck(boolean hasPassengers, Integer numberPassengers, Integer numberWheels,
                 Integer plateDate, String movesOver, double weightLoad, boolean hasColdRoom) {
        super(hasPassengers, numberPassengers, numberWheels, plateDate, movesOver);
        this.weightLoad = weightLoad;
        this.hasColdRoom = hasColdRoom;
    }

    /**
     * Getter
     * @return
     * Load - double
     */
    public double load() {
        return weightLoad;
    }

    /**
     * Setter
     * @param weightLoad double
     */
    public void setWeightLoad(double weightLoad) {
        this.weightLoad = weightLoad;
    }

    /**
     * Getter
     * @return
     * Has cold room - boolean
     */
    public boolean hasColdRoom() {
        return hasColdRoom;
    }

    /**
     * Setter
     * @param hasColdRoom boolean
     */
    public void setHasColdRoom(boolean hasColdRoom) {
        this.hasColdRoom = hasColdRoom;
    }

    /**
     * Print data of the truck
     */
    @Override
    void printDataVehicle() {
        System.out.println("Tipo camión \s");
        super.printDataVehicle();
        System.out.printf("Peso de la carga = %f"+" －O－ Tiene cuarto frio = %b%n", weightLoad, hasColdRoom);
    }
}
