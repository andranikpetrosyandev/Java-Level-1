package com.classroom.week11.printer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        String folderPath = "/home/andranik/Desktop/";

        List<Runnable> runnables = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            runnables.add(new FilePrinterRunnable(folderPath + "asa-" + i + ".txt"));
        }


        for (Runnable runnable : runnables) {
            new Thread(runnable).start();

        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
