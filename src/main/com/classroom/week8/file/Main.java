package com.classroom.week8.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File("/home/andranik/IdeaProjects/NewLessons/src/main/com/classroom/week8/file/text.txt")
        );

        System.out.println(scanner.nextLine());
    }
}
