package org.example;

import java.util.Arrays;

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        new ZerosToEnd().pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    void pushZerosToEnd(int[] arr) {
        int j = 0;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] != 0){
                if(i != j){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
