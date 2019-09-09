package org.mylearningprojs.chapter3.singletonPattern;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton.getMessage();

        //try to make a Singleton instance
        Singleton mySingle = new Singleton();
        Singleton myOtherSingle = new Singleton();

        System.out.print("Are they equal??? ");
        System.out.println(mySingle == myOtherSingle);

        System.out.println("the deets: #1:" + mySingle.toString() + " #2: " + myOtherSingle.toString());
    }

}
