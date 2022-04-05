package com.classroom.week12.functional;

import com.classroom.week5.set.User;
import com.classroom.week7.ananymus.UserImpl;

import java.util.function.Function;

public interface UserMapper extends Function<User, UserImpl> {
    public static void main(String[] args) {
        UserMapper userMapper = null;
    }
}
