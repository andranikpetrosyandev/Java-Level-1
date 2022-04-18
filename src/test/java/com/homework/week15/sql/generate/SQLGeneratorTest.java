package com.homework.week15.sql.generate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQLGeneratorTest {

    @Test
    public void testUserSqlGenerator() {
        User user = new User("test user", 30);
        SQLGenerator sqlGenerator = new SQLGenerator();
        Assertions.assertEquals("Insert into users (  full_name , age  ) values (  'test user', '30'  );", sqlGenerator.generateInsert(user));
        Assertions.assertEquals("Insert into users (  full_name , age  ) values (  'test user', '30'  );", sqlGenerator.generateInsert(user));
    }

}