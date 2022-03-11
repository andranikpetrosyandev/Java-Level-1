package com.classroom.week9.clone;

public class CloneMaker<T extends ConstructorClonable<T>> {
    public T printCloneAndPrint(T input) {
        T newCLoneObject = input.doClone();
        return newCLoneObject;
    }

    public static void main(String[] args) {
        CloneMaker<Car> carCloneMaker = new CloneMaker<>();
    }
}
