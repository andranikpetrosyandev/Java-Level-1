package com.classroom.week5.clone;

class ComputerTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Computer computer = new Computer(Brand.DELL);
        Computer clone = (Computer) computer.clone();
    }
}