package org.example;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 1};
        int d = 9;
        rotateArr(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateArr(int arr[], int d) {
        d = d % arr.length;
        int[] temp = new int[d];
        for(int i = 0; i< d; i++) {
            temp[i] = arr[i];
        }
        int k = 0;
        for(int i = d; i< arr.length; i++) {
            arr[k++] = arr[i];
        }
        for(int i = 0; i< d;i++) {
            arr[k++] = temp[i];
        }
    }
}
