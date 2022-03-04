package com.classroom.week8.scanner;

import java.util.Arrays;
import java.util.InputMismatchException;

public class IntScanner {
    private IntSupplier intSupplier;

    public IntScanner(IntSupplier intSupplier) {
        this.intSupplier = intSupplier;
    }

    public int[] get5SizedArray() {
        int[] array = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("please insert your " + i + " number");
            try {
                array[i] = intSupplier.get();
                i++;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }
        return array;


    }

    public int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i <= array.length; i++) {
            if (maxValue < array[i] && i != 0) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new IntScanner(new UserIntSupplier()).get5SizedArray()));
    }
}
