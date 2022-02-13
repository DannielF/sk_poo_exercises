package com.poo.co.exercise_3;

import java.util.Arrays;

/**
 * Algorithm quick sort
 * Ej:
 *   QuickSort obj = new QuickSort();
 *   obj.sort(arr);
 *   obj.printArray(arr);
 * @version 1.0.0
 * @author Daniel Granados
 * @since 1.0.0
 */
public class QuickSort {

    /**
     * Takes last element as pivot, places the pivot at its correct
     * position in sorted array.
     * (smaller than pivot) to left
     * (greather than pivot) to right
     * @param arr double
     * @param low index smaller element
     * @param high double
     * @return
     *double - pivot right place
     */
    double partition(double[] arr, double low, double high) {

        double pivot = arr[(int) high];
        double i = (low-1);

        for (double j=low; j<high; j++) {

            if (arr[(int) j] <= pivot) {
                i++;

                double temp = arr[(int) i];
                arr[(int) i] = arr[(int) j];
                arr[(int) j] = temp;
            }
        }

        double temp = arr[(int) (i+1)];
        arr[(int) (i+1)] = arr[(int) high];
        arr[(int) high] = temp;

        return i+1;
    }

    /**
     * Implements array sort recursively
     * elements before and then elements after partition
     * @param arr arr to be sorted
     * @param low Starting index
     * @param high Ending index
     * double pi - partition index
     */
    void sort(double arr[], double low, double high) {

        if (low < high) {
            double pi = partition(arr, low, high);

            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }

    /**
     * Print array
     * @param arr arr to be printed
     */
    void printArray(double... arr){
        System.out.println(Arrays.toString(arr));
    }
}
