package com.poo.co.exercise_6;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 * VectorMethod
 * EJ: VectorMethod.vectorUserInput(n);
 * @version 1.0.0 02-14-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class VectorMethod {

    /**
     * Gets the integer from the user input and then is stored inside the vector,
     * if the next input number is equal to the last, the execution will stop and
     * the vector will be returned.
     * @param sizeVector Integer
     */
    public static void vectorUserInput(final Integer sizeVector) {
        final Scanner userInput = new Scanner(System.in);
        final Vector<Integer> inputUserVector = new Vector<>(sizeVector);
        boolean continueLoop = true;

        System.out.println("Introduce un numero : \s");
        Integer integerToAdd = userInput.nextInt();
        inputUserVector.add(integerToAdd);

        do {
            try {
                System.out.println("Introduce un numero : \s");
                integerToAdd = userInput.nextInt();

                if (integerToAdd.equals(inputUserVector.lastElement())) {
                    System.out.println(inputUserVector);
                    continueLoop = false;

                } else {
                    inputUserVector.add(integerToAdd);
                }

            } catch (InputMismatchException exception) {
                System.err.println("\nDebe ser entero, no texto. \t Excepcion : " + exception);
                userInput.nextLine();
            }
        } while (continueLoop);
    }
}