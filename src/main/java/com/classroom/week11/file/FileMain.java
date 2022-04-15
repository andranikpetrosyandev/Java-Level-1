package com.classroom.week11.file;

import netscape.javascript.JSObject;

import java.io.*;

public class FileMain {

    private final static String fileName = "/home/andranik/Desktop/asa-testtest.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address();
        address.setCountry("Armenia");
        address.setNumber(54);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);


        objectOutputStream.writeDouble(1);
        objectOutputStream.writeObject(address);

        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.readDouble();
        Address newAddress = (Address) objectInputStream.readObject();

        System.out.println(newAddress.getCountry());
        objectInputStream.close();
    }
}
