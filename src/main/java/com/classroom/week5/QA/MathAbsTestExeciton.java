package com.classroom.week5.QA;

public class MathAbsTestExeciton  extends TestExecution{

     public MathAbsTestExeciton() {
        super("Math Function");
    }

    @Override
    public Result execute() {

        if(Math.abs(-12) < 123213){
            return Result.FAIL;
        }else{
            return Result.PASS;
        }
    }
}
