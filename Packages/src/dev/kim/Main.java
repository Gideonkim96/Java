package dev.kim;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Specify the size of the array
        int size = 10;

        // Create an array of random integers
        int[] array = generateRandomArray(size);

        // Print the original array
        System.out.println("Original array:");
        printArray(array);

        // Sort the array in descending order
        Arrays.sort(array);
        reverseArray(array);

        // Print the sorted array
        System.out.println("\nSorted array in descending order:");
        printArray(array);
    }

    // Method to generate an array of random integers
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Adjust the bound as needed

        }
        return array;
    }

    // Method to reverse the order of elements in the array
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // Method to print an array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}