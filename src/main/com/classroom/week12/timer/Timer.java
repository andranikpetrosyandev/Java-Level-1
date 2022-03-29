package com.classroom.week12.timer;


import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Timer {

    private  boolean isRunning = true;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        System.setErr(new PrintStream("/home/andranik/Desktop/timer.txt"));


        Timer timer = new Timer();
        timer.start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("please input a number");
            int number = scanner.nextInt();
            if (number == -1) {
                timer.stop();
                break;
            }

        }
    }

    public void start() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (isRunning) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.err.println(i++);
                }
            }
        }).start();

    }

    public void stop() {
        isRunning = false;

    }
}
