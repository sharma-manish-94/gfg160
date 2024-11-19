package org.example;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = new int[]{1 ,2, 3, 6, 5, 4};
        new NextPermutation().nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    void nextPermutation(int[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        int pivot = n - 2;
        while (pivot >= 0 && arr[pivot] >= arr[pivot + 1]) {
            pivot--;
        }
        if (pivot >= 0) {
            int successor = n - 1;
            while (arr[successor] <= arr[pivot]) {
                successor--;
            }
            swap(arr, pivot, successor);
        }
        reverseArray(arr, pivot + 1, n - 1);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverseArray(int[] arr, int start, int end) {
        int left = start;
        int right = end;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
