package com.homework.week15.sql.generate;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SQLGenerator {


    public String generateInsert(Model model) {
        String queryString = "";
        getFields(model);
        queryString += "Insert into " + getTableName(model) + " ( ";

        queryString += executeFieldName(model) + ") values ( " + executeFieldValues(model) + " );";
        return queryString;
    }

    private String executeFieldName(Model model) {
        Iterator<Field> iterator = getFields(model).iterator();
        String fieldNamesForSqlQuery = "";
        while (iterator.hasNext()) {
            Field currentField = iterator.next();
            fieldNamesForSqlQuery += " " + currentField.getAnnotation(Column.class).name() + " " + ((iterator.hasNext()) ? "," : " ");


        }
        return fieldNamesForSqlQuery;
    }

    private String executeFieldValues(Model model) {
        Iterator<Field> iterator = getFields(model).iterator();
        String fieldValuesForSqlQuery = "";
        while (iterator.hasNext()) {
            Field currentField = iterator.next();
            try {
                fieldValuesForSqlQuery += " '" + getFieldValue(model, currentField.getName()).get(model) + ((iterator.hasNext()) ? "'," : "' ");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return fieldValuesForSqlQuery;
    }

    private String getTableName(Model model) {
        return model.getClass().getDeclaredAnnotation(Table.class).name();
    }

    private List<Field> getFields(Model model) {
        List<Field> modelFields = new ArrayList<>();
        for (Field declaredField : model.getClass().getDeclaredFields()) {
            if (declaredField.isAnnotationPresent(Column.class)) {
                modelFields.add(declaredField);
            }
        }
        return modelFields;
    }

    private Field getFieldValue(Model model, String name) {
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
