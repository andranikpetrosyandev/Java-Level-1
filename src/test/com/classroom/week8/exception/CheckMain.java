package com.classroom.week8.exception;

public class CheckMain {
    public static void main(String[] args) {
        try{
            throw new Exception();
        }catch (Exception e){
            e.getStackTrace();
        }
    }
}
