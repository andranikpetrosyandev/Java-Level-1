package com.classroom.week5.Factory;

public class MyBoolean {

    private boolean value;
    private static MyBoolean trueMyBoolean = null;

    public MyBoolean(boolean value) {
        this.value = value;
    }

    public boolean isValue(){
        return value;
    }

    public static MyBoolean create(boolean value){
        if(value == true){
            if(trueMyBoolean == null){
                return new MyBoolean(true);
            }
            return trueMyBoolean;
        }
        return new MyBoolean(value);
    }
    public static void main(String[] args) {
        MyBoolean myBoolean2 = MyBoolean.create(true);
    }

}
