package org.example;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1};
        // output = {5, 6, 2, 3, 4, 1}
        new ReverseArray().reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length -1;
        while(i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
