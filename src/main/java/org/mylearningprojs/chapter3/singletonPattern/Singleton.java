package org.mylearningprojs.chapter3.singletonPattern;

public class Singleton {
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }

    public static void getMessage() {
        System.out.println("FML!");
    }
}
