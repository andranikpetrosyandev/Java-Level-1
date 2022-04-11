package com.classroom.week5.QA;

public class Main {
    public static void main(String[] args){
        TestExecution[] tests = {new MaxTestExecution(),new MathAbsTestExeciton(), new MinTestExecution()};
        runTextExecutions(tests);
    }

    public static void runTextExecutions( TestExecution [] executions){

        for (TestExecution execution : executions) {
            execution.start();
        }

    }
}
