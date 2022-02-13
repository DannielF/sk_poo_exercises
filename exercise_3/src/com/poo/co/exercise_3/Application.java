package com.poo.co.exercise_3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Program to create a random array,
 * the user selects the method to sort the array
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class Application {

    /**
     * Print the instructions of
     * the program
     */
    public static void printInstructions(){
        System.out.println("""
                \s
                Bienvenido a nuestro reto ejercicio 3 (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ \s
                Sigue las siguientes instrucciones para usar correctamente el programa \s
                \s
                Opción 1 para ordenarlo por el algoritmo de la burbuja. \s
                Opción 2 para ordenarlo por el algoritmo quick sort. \s
                Opción 3 para salir del programa.""");
    }

    /**
     * Create an array of random numbers
     * @return Random array
     */
    public static double[] generateArrayRealNumber(){
        double[] realNumbersArray = new double[10];
        for (int i = 0; i < 10; i++) {
            realNumbersArray[i] = (int) (Math.random() * 20);
        }
        return realNumbersArray;
    }

    /**
     * The program runs from here
     * Print the array and then asks the user to select the method
     * to sort the array
     * @param args command console
     */
    public static void main(String[] args) {

        printInstructions();

        Scanner userInput = new Scanner(System.in);
        String optionSelected;

        do {
            double[] newArrayRealNumbers = generateArrayRealNumber();
            System.out.println("\nArray actual: \n");
            System.out.println(Arrays.toString(newArrayRealNumbers));

            System.out.println("\nDigita una opción: ");
            optionSelected = userInput.next();

            if ("1".equals(optionSelected)) {
                System.out.print("Metodo burbuja = ");
                BubbleSort bsArray = new BubbleSort();
                bsArray.bubbleSort(newArrayRealNumbers);

            } else if ("2".equals(optionSelected)) {
                System.out.print("Metodo ordenamiento = ");
                QuickSort qsArray = new QuickSort();
                double arrLen = newArrayRealNumbers.length;
                qsArray.sort(newArrayRealNumbers, 0, arrLen - 1);
                qsArray.printArray(newArrayRealNumbers);
            }

        } while (3 > Integer.parseInt(optionSelected));
    }
}
