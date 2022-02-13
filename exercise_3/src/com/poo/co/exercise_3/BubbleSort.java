package com.poo.co.exercise_3;

import java.util.Arrays;

/**
 * Algorithm bubble sort
 * EJ:
 *   BubbleSort obj = new BubbleSort();
 *   obj.bubbleSort(arr);
 * @version 1.0.0 02-13-2022
 * @author Daniel Granados
 * @since 1.0.0
 */
public class BubbleSort {

    /**
     * Order an array through bubble sort
     * @param arr double
     */
    void bubbleSort(double... arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
