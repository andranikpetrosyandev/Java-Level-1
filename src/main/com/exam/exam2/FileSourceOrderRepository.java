package com.exam.exam2;

import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FileSourceOrderRepository implements CrudRepository<Order, Integer> {

    private static final String filePath = "/home/andranik/IdeaProjects/NewLessons/src/main/com/exam/exam2/orders.txt";
    private final CrudRepository<User, String> userRepository;

    public FileSourceOrderRepository(CrudRepository<User, String> userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public @Nullable Order findById(Integer orderId) {
        Order order = null;
        Scanner reader = null;
        try {
            reader = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file " + filePath + " not found");
        }
        reader.nextLine();

        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            String[] splitOrderInfo = data.split(",");
            if (splitOrderInfo.length > 3) {
                if (orderId.equals(Integer.parseInt(splitOrderInfo[0]))) {
                    order = new Order(Integer.parseInt(splitOrderInfo[0]), splitOrderInfo[1], Integer.parseInt(splitOrderInfo[2]), userRepository.findById(splitOrderInfo[3]));
                }
            }
        }
        return order;
    }

    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();

        Scanner reader = null;
        try {
            reader = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("file " + filePath + " not found");
        }
        reader.nextLine();
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            String[] splitOrderInfo = data.split(",");
            if (splitOrderInfo.length > 1) {
                orders.add(new Order(Integer.parseInt(splitOrderInfo[0]), splitOrderInfo[1], Integer.parseInt(splitOrderInfo[2]), FileSourceUserRepository.getInstance().findById(splitOrderInfo[3])));
            }
        }

        return orders;
    }


    public List<Order> findAllByUserId(String userId) {
        List<Order> orders = new ArrayList<>();
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
            String[] splitOrderInfo = data.split(",");
            if (splitOrderInfo[3].equals(userId)) {
                orders.add(new Order(Integer.parseInt(splitOrderInfo[0]), splitOrderInfo[1], Integer.parseInt(splitOrderInfo[2]), FileSourceUserRepository.getInstance().findById(splitOrderInfo[3])));
            }
        }
        return orders;
    }
}
