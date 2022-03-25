package com.exam.exam2;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileSourceUserRepository implements CrudRepository<User, String> {
    private static FileSourceUserRepository fileSourceUserRepository = null;
    private static final String filePath = "/home/andranik/IdeaProjects/NewLessons/src/main/com/exam/exam2/users.txt";


    private FileSourceUserRepository() {
    }

    public static FileSourceUserRepository getInstance() {
        if (fileSourceUserRepository == null) {
            fileSourceUserRepository = new FileSourceUserRepository();
        }

        return fileSourceUserRepository;
    }

    @Override
    public @Nullable User findById(String s) {
        User user = null;
        Scanner reader = null;
        try {
            reader = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file " + filePath + " not found");
        }
        reader.nextLine();
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            String[] splitUserInfo = data.split(",");
            if (splitUserInfo.length > 1) {
                if (splitUserInfo[0].equals(s)) {
                    user = new User(splitUserInfo[0], splitUserInfo[1], splitUserInfo[2]);
                }
            }
        }


        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();

        Scanner reader = null;
        try {
            reader = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file " + filePath + " not found");
        }
        reader.nextLine();
        reader.nextLine();
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            String[] splitUserInfo = data.split(",");
            if (splitUserInfo.length > 1) {
                users.add(new User(splitUserInfo[0], splitUserInfo[1], splitUserInfo[2]));
            }
        }

        return users;
    }
}
