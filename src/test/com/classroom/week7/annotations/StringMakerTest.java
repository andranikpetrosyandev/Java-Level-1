package com.classroom.week7.annotations;

import java.lang.annotation.Annotation;

import static org.junit.jupiter.api.Assertions.*;

class StringMakerTest {
    public static void main(String[] args) {
        StringMaker bad = StringMaker.ofBad();

        StringMaker good = StringMaker.ofGood();
        System.out.println(bad.getClass().getDeclaredAnnotations()[0].annotationType());

        StringMaker[] stringMakers = {bad,good};
        for (StringMaker stringMaker : stringMakers) {
            Annotation  declaredAnnotations = stringMaker.getClass().getDeclaredAnnotation(HIghPerformance.class);
            if(declaredAnnotations !=null){
                if(declaredAnnotations.annotationType() == HIghPerformance.class){
                System.out.println(stringMaker.make(1,10000).getTime());
            }
            }
        }

    }

}