package com.homework.week15.sql.generatedb;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserCrudRepositoryIntegrationTest {

    @Test
    public void test() {
        User user = new User("andranik", 12);
        UserCrudRepository userCrudRepository = new UserCrudRepository(new SqlGenerator());
        userCrudRepository.save(user);
        ResultSet rs = null;
        try {
            rs = userCrudRepository.getConnection().createStatement().executeQuery("SELECT * FROM users");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (rs.next()) {
                Assertions.assertEquals(user.getName(), rs.getString("full_name"));
                Assertions.assertEquals(String.valueOf(user.getAge()), rs.getString("age"));
            }
        } catch (SQLException e) {

        }

    }

}