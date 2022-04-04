package com.classroom.week12.lambda;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> list = List.of("string1", "string2");


        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        Map<String, String> map = Map.of("asdas", "Asdas", "asdasd", "asdasd");
        map.forEach((s, s2) -> {

        });
    }
}
