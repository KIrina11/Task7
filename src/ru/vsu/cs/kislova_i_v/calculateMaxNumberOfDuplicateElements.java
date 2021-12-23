package ru.vsu.cs.kislova_i_v;

public class calculateMaxNumberOfDuplicateElements {

    static int calculateMaxNumberOfDuplicateElements(int[] array) {
        int numberOfDuplicateElements = 0;
        int maxNumberOfDuplicateElements = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    numberOfDuplicateElements++;
                }
            }
            if (maxNumberOfDuplicateElements < numberOfDuplicateElements) {
                maxNumberOfDuplicateElements = numberOfDuplicateElements;
            }
            numberOfDuplicateElements = 0;
        }
        return maxNumberOfDuplicateElements;
    }
}
