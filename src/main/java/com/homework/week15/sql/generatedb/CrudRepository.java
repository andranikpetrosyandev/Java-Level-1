package com.homework.week15.sql.generatedb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class CrudRepository<T> {
    private Connection connection;

    public CrudRepository() {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:7432/aca", "postgres", null);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public abstract T save(T model);
}
