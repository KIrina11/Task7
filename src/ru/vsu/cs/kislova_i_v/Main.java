package ru.vsu.cs.kislova_i_v;

import static ru.vsu.cs.kislova_i_v.ArrayUtils.readIntArrayFromConsole;
import static ru.vsu.cs.kislova_i_v.calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements;

public class Main {

    public static void main(String[] args) {
        int[] array = readIntArrayFromConsole("Array of integers");
        int[] sortedArray = bubbleSortArray(array);

        int maxNumberDuplicateElements = calculateMaxNumberOfDuplicateElements(sortedArray);

        printArray(array);
        printResult(maxNumberDuplicateElements);
    }

    public static void printArray(int[] array) {
        System.out.print(" {");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i - 1] + ", ");
        }
        System.out.print(array[array.length - 1] + "} ");
    }

    public static int[] bubbleSortArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int value = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = value;
                }
            }
        }
        return array;
    }

    public static void printResult(int maxNumberDuplicateElements) {
        System.out.println(" The max number of duplicate elements = " + maxNumberDuplicateElements);
    }
}
