package com.poo.co.exercise_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Create a solar system with basic attributes
 * <p>You can add planets to the solar system
 * @version 1.0.0 02-12-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class SolarSystem {
    private String solarSystemName;
    private String sunName;
    private List<Planet> planets;

    /**
     * Solar system constructor
     * @param solarSystemName String
     * @param sunName String
     */
    public SolarSystem(String solarSystemName, String sunName) {
        this.solarSystemName = Objects.requireNonNull(solarSystemName);
        this.sunName = Objects.requireNonNull(sunName);
        this.planets = new ArrayList<>();
    }

    /**
     * Add a new planet to the solar system
     * @param planet Planet class
     */
    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    /**
     * Getter
     * @return
     * Solay system name
     */
    public String NameSolarSystem() {
        return solarSystemName;
    }

    /**
     * Setter
     * @param solarSystemName String
     */
    public void setSolarSystemName(String solarSystemName) {
        this.solarSystemName = solarSystemName;
    }

    /**
     * Getter
     * @return
     * Sun name
     */
    public String NameSun() {
        return sunName;
    }

    /**
     * Setter
     * @param sunName String
     */
    public void setSunName(String sunName) {
        this.sunName = sunName;
    }

    /**
     * Allow you to calculate gravitational force between two planets
     * <p>Giving two IDs, planetA and planetB
     */
    public void calculateGravitationalForce(){
        double constantGravitational = 6674e-11;
        double massPlanetA = 0;
        double massPlanetB = 0;
        double distanceSunPlanetA = 0;
        double distanceSunPlanetB = 0;

        System.out.println("Id de los planetas");
        Scanner inputIdPlanets = new Scanner(System.in);
        String idPlanets = inputIdPlanets.nextLine();
        String[] splitIdPlanets;
        splitIdPlanets = idPlanets.split("\\s+");
        Integer idPlanetA = Integer.parseInt(splitIdPlanets[0]);
        Integer idPlanetB = Integer.parseInt(splitIdPlanets[1]);

        for (Planet planet: planets) {
            Integer planetId = planet.Id();
            if (planetId.equals(idPlanetA)) {
                massPlanetA = planet.Mass();
                distanceSunPlanetA = planet.DistanceFromSun();
            }if (planetId.equals(idPlanetB)) {
                massPlanetB = planet.Mass();
                distanceSunPlanetB = planet.DistanceFromSun();
            }
        }

        int distancePlanetAtoB = ((int)distanceSunPlanetB * 1000000) - ((int)distanceSunPlanetA * 1000000);
        double gravitationalForceCalculated = (constantGravitational * massPlanetA * massPlanetB) /
                Math.pow(distancePlanetAtoB, 2);
        System.out.printf("Fuerza gravitational calculada = %,.1f Newtons %n", gravitationalForceCalculated);

    }

    /**
     * Print the data of the solar system
     * and the planets inside.
     */
    public void printDataSolarSystem(){
        System.out.printf("%n");
        System.out.printf("Nombre sistema solar = %s " + "-- Nombre del sol = %s%n", solarSystemName, sunName);
        for (Planet planet: planets) {
            System.out.println("----------------");
            planet.printDataPlanet();
        }
    }
}
