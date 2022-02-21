package com.classroom.week5.QA;

public class MaxTestExecution extends TestExecution{

    public MaxTestExecution(){
        super("Max Function");
    }

    @Override
    public Result execute() {
        int max = Math.max(9,99);

        if(max == 99){
            return Result.PASS;
        }else{
            return Result.FAIL;
        }
    }
}
