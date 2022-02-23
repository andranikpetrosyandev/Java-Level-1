package com.classroom.week7.ananymus;

public class Main {
    public static void main(String[] args) {
        User user1 = new UserImpl("Name",15);
        User user2 = User.of("sdasd",23);
        User user3 = new User() {
            @Override
            public String getName() {
                return null;
            }

            @Override
            public int getAge() {
                return 0;
            }

        };
        System.out.println(user3.toString());
    }
}
