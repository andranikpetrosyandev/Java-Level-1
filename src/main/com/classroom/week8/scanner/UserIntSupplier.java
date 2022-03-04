package com.classroom.week8.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserIntSupplier implements IntSupplier {

    @Override
    public int get() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
