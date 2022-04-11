package com.classroom.week11.file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrinterMain {

    private final static String fileName = "/home/andranik/Desktop/asa-testtest.txt";

    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.print(12);
        printWriter.close();
        System.out.println(System.currentTimeMillis() - start);
    }
}
