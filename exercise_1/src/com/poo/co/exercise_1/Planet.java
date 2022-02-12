package com.poo.co.exercise_1;

import java.util.Objects;

/**
 * Create a planet with basic attribute
 * <p>Ej:
 *      Planet planet1 = new Planet();
 *      planet.id();
 * @version 1.0.0 02-12-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Planet {
    private Integer id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceFromSun;

    /**
     * Planet constructor
     * @param id  Int
     * @param name String
     * @param mass double
     * @param density double
     * @param diameter double
     * @param distanceFromSun double
     */
    public Planet(Integer id, String name, double mass, double density, double diameter, double distanceFromSun) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceFromSun = distanceFromSun;
    }

    /**
     * Getter
     * @return
     * Planet Id
     */
    public Integer Id() {
        return id;
    }

    /**
     * Setter
     * @param id int
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter
     * @return
     * Planet name
     */
    public String Name() {
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
     * Getter
     * @return
     * Planet mass
     */
    public double Mass() {
        return mass;
    }

    /**
     * Setter
     * @param mass double
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * Getter
     * @return
     * Planet density
     */
    public double Density() {
        return density;
    }

    /**
     * Setter
     * @param density double
     */
    public void setDensity(double density) {
        this.density = density;
    }

    /**
     * Getter
     * @return
     * Planet diameter
     */
    public double Diameter() {
        return diameter;
    }

    /**
     * Stter
     * @param diameter double
     */
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Getter
     * @return
     * Distance from the sun
     */
    public double DistanceFromSun() {
        return distanceFromSun;
    }

    /**
     * Setter
     * @param distanceFromSun double
     */
    public void setDistanceFromSun(double distanceFromSun) {
        this.distanceFromSun = distanceFromSun;
    }

    /**
     * Print data of the planet
     */
    public void printDataPlanet(){
        System.out.printf("id = %d "+"-- Nombre = %s%n", id, name);
        System.out.printf("Masa = %,.1f kg "+"-- Densidad %.2f g/cm3 %n", mass, density);
        System.out.printf("Diametro = %.3f km "+"-- Distancia al sol = %.1f millones/mil millones de km %n", diameter, distanceFromSun);
    }
}
