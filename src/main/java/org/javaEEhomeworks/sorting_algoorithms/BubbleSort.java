package org.javaEEhomeworks.sorting_algoorithms;

public class BubbleSort {
    public void bubbleSort(int [] myArray){
        for (int i = 0; i <= myArray.length; i++){
            for (int j = 0; j <= myArray.length - i; j++){
                if (myArray[j] > myArray[i+1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
    }
}
