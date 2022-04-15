package com.classroom.week7.calculator;

public enum Operation {
    ADDITION{
        @Override
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    },
    SUBTRACTION{
        @Override
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLICATION{
        @Override
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVISION{
        @Override
        public double calculate(double num1, double num2) {
            return num1 / num2;
        }
    };

    public abstract double  calculate(double num1, double num2);

    public static  void main(String[] args) {
        System.out.println(Operation.ADDITION.calculate(10,49));
        System.out.println(Operation.DIVISION.calculate(10,49));
    }

}
