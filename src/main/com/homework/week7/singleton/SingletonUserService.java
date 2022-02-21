package com.homework.week7.singleton;

public class SingletonUserService {
    private static SingletonUserService singletonUserService=null;

    private SingletonUserService(){

    }

    public static SingletonUserService getInstance(){
        if(singletonUserService == null) {
            singletonUserService = new SingletonUserService();
        }

        return singletonUserService;
    }

}
