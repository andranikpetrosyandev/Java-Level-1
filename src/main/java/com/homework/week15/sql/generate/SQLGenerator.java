package com.homework.week15.sql.generate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SQLGenerator {

    private List<Field> modelFields = new ArrayList<>();
    private String queryString = "";
    private String fieldNamesForSqlQuery = "";
    private String fieldValuesForSqlQuery = "";

    public String generateInsert(Model model) {
        getFields(model);
        queryString += "Insert into " + getTableName(model) + " ( ";
        executeFieldNamesAndValues(model);
        queryString += fieldNamesForSqlQuery + ") values ( " + fieldValuesForSqlQuery + " );";
        return queryString;
    }

    private void executeFieldNamesAndValues(Model model) {
        Iterator<Field> iterator = modelFields.iterator();

        while (iterator.hasNext()) {
            Field currentField = iterator.next();
            fieldNamesForSqlQuery += " " + currentField.getAnnotation(Column.class).name() + " " + ((iterator.hasNext()) ? "," : " ");
            try {
                fieldValuesForSqlQuery += " " + getFieldValues(model, currentField.getName()).get(model) + ((iterator.hasNext()) ? "," : " ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
    }

    private String getTableName(Model model) {
        return model.getClass().getDeclaredAnnotation(Table.class).name();
    }

    private void getFields(Model model) {
        for (Field declaredField : model.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(Column.class)) {
                modelFields.add(declaredField);
            }
        }
    }

    private Field getFieldValues(Model model, String name) {
        Field field = null;
        Field[] declaredFields = model.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.getName() == name) {
                field = declaredField;
            }
        }
        return field;
    }


}
