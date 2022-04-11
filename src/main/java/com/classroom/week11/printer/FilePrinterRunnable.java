package com.classroom.week11.printer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FilePrinterRunnable implements Runnable {

    private final String filePath;

    public FilePrinterRunnable(final String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {

        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("this file" + filePath + "not found");
        }

        for (int i = 0; i < 30_000_000; i++) {
            printWriter.println(i);
        }
        printWriter.close();
    }

}
