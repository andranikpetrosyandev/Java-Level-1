package com.homework.week7.singleton;


class SingletonUserServiceTest {
    public static void main(String[] args) {
        SingletonUserService service = SingletonUserService.getInstance();
        SingletonUserService service1 = SingletonUserService.getInstance();
        SingletonUserService service2 = SingletonUserService.getInstance();
        SingletonUserService service3 = SingletonUserService.getInstance();


        System.out.println(service == service1);
        System.out.println(service1 == service2);
        System.out.println(service2 == service3);
    }

}