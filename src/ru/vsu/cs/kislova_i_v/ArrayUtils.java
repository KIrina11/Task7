package ru.vsu.cs.kislova_i_v;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ArrayUtils {
    static int[] readIntArrayFromConsole(String arrayName) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                if (arrayName == null || arrayName.length() == 0) {
                    arrayName = "";
                } else {
                    arrayName = " " + arrayName;
                }
                System.out.printf("Input an array%s:%n", arrayName);
                String line = scanner.nextLine();
                return toIntArray(line);
            } catch (Exception e) {
                System.out.print("Error! Try entering the array again");
            }
        }
    }

    static int[] toIntArray(String str) {
        Scanner scanner = new Scanner(str);
        scanner.useLocale(Locale.ROOT);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        Integer[] arr = list.toArray(new Integer[0]);

        return toPrimitive(arr);
    }

    static int[] toPrimitive(Integer[] array) {
        if (array == null) {
            return null;
        }
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}