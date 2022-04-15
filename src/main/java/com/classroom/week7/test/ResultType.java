package com.classroom.week7.test;

public enum ResultType {
    FAIL("execution is failed"),
    PASS("execution is pass");

    private String message;

    ResultType(String message){
        this.message = message;
    }

    public String getTestExecutionMessage(String testName){
        return testName + " " +message;
    }
}
