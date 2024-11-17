package org.example;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10};
        SecondLargestElement secondLargestElement = new SecondLargestElement();
        System.out.println(secondLargestElement.getSecondLargest(arr));
    }
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int secondMax = -1;

        for (int j : arr) {
            if (max < j) {
                secondMax = max;
                max = j;
            } else if (max != j && secondMax < j) {
                secondMax = j;
            }
        }
        return (max != secondMax)? secondMax: -1;
    }
}
