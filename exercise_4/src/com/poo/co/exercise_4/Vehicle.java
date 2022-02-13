package com.poo.co.exercise_4;

import java.util.Objects;

/**
 * Create a vehicle with basic attributes
 * Ej:
 *   Vehicle carro = new Vehicle(...args);
 *   carro.setId(...args);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Vehicle {
    private Integer id;
    private boolean hasPassengers;
    private Integer numberPassengers;
    private Integer numberWheels;
    private Integer plateDate;
    private String movesOver;

    /**
     * Vehicle constructor
     * @param id Integer
     * @param hasPassengers boolean
     * @param numberPassengers Integer
     * @param numberWheels Integer
     * @param plateDate Integer
     * @param movesOver String
     */
    public Vehicle(Integer id, boolean hasPassengers, Integer numberPassengers, Integer numberWheels, Integer plateDate, String movesOver) {
        this.id = Objects.requireNonNull(id);
        this.hasPassengers = hasPassengers;
        this.numberPassengers = numberPassengers;
        this.numberWheels = numberWheels;
        this.plateDate = Objects.requireNonNull(plateDate);
        this.movesOver = Objects.requireNonNull(movesOver);

        if (!hasPassengers) {
            this.numberPassengers = 0;
        }
    }

    /**
     * Getter
     * @return
     * Id - Integer
     */
    public Integer Id() {
        return id;
    }

    /**
     * Setter
     * @param id Integer
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter
     * @return
     * Has passengers - boolean
     */
    public boolean HasPassengers() {
        return hasPassengers;
    }

    /**
     * Setter
     * @param hasPassengers boolean
     */
    public void setHasPassengers(boolean hasPassengers) {
        this.hasPassengers = hasPassengers;
    }

    /**
     * Getter
     * @return
     * Numeber of passengers - Integer
     */
    public Integer NumberPassengers() {
        return numberPassengers;
    }

    /**
     * Setter
     * @param numberPassengers Integer
     */
    public void setNumberPassengers(Integer numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * Getter
     * @return
     * Number of wheels - Integer
     */
    public Integer numberWheels() {
        return numberWheels;
    }

    /**
     * Setter
     * @param numberWheels Integer
     */
    public void setNumberWheels(Integer numberWheels) {
        this.numberWheels = numberWheels;
    }

    /**
     * Getter
     * @return
     * Plate date - Integer
     */
    public Integer PlateDate() {
        return plateDate;
    }

    /**
     * Setter
     * @param plateDate Integer
     */
    public void setPlateDate(Integer plateDate) {
        this.plateDate = plateDate;
    }

    /**
     * Getter
     * @return
     * Mover over - String
     */
    public String MovesOver() {
        return movesOver;
    }

    /**
     * Setter
     * @param movesOver String
     */
    public void setMovesOver(String movesOver) {
        this.movesOver = movesOver;
    }

    /**
     * Print data of each vehicle
     */
    void printDataVehicle(){
        System.out.printf("Id vehiculo = %d"+" －O－ Tiene pasajeros = %b%n", id, hasPassengers);
        System.out.printf("Numero de pasajeros = %d"+" －O－ Numero de ruedas = %d%n", numberPassengers, numberWheels);
        System.out.printf("Fecha de la placa = %d"+" －O－ Se desplaza por = %s%n", plateDate, movesOver);
    }
}
