package org.mylearningprojs.extraResearch.reflection;

import java.util.Arrays;

public class ReflectionExperiments {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle();

        Class myMotoClass = motorcycle.getClass();

        System.out.println("Class name: " + motorcycle.getClass());

        System.out.println("Number of fields: " + myMotoClass.getDeclaredFields().length);

        System.out.println("Declared fields: ");
        Arrays.stream(myMotoClass.getDeclaredFields())
                .forEach(f -> System.out.println(f.getName() + " || "));

        System.out.println();
        System.out.println("Number of methods: " + myMotoClass.getDeclaredMethods().length);
        System.out.println("Declared methods: ");
        Arrays.stream(myMotoClass.getDeclaredMethods())
            .forEach(m -> System.out.println(m.getName() + " || "));

        System.out.println();
        System.out.println("Fields [not declared]: ");
        System.out.println("Number of non-declared fields: " + myMotoClass.getFields().length);
        Arrays.stream(myMotoClass.getFields()).forEach(f -> System.out.println(f + " || "));
    }
}
