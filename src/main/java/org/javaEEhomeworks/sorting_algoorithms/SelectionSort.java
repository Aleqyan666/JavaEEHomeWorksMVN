package org.javaEEhomeworks.sorting_algoorithms;

public class SelectionSort {
    public void selectionSort(int [] array){
        for (int i = 0; i < array.length - 1; i++){
            int smallestIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[smallestIndex]){
                    smallestIndex = j;
                    int temp = array[smallestIndex];
                    array[smallestIndex] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
