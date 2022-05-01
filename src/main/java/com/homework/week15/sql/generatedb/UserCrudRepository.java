package com.homework.week15.sql.generatedb;

import java.sql.SQLException;

public class UserCrudRepository extends CrudRepository<User> {
    SqlGenerator sqlGenerator;

    public UserCrudRepository(SqlGenerator sqlGenerator) {
        super();
        this.sqlGenerator = sqlGenerator;
    }

    @Override
    public User save(User user) {

        try {
            getConnection().createStatement().executeUpdate(sqlGenerator.generateInsert(user));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }


}
