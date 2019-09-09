package org.mylearningprojs.chapter3.beanNamingExamples.annotation;

import org.springframework.stereotype.Component;

@Component("PianistBean")
public class Pianist implements Musician {
    private String favComposer = "Rachmaninov";

    public void getFavComposer() {
        System.out.println(favComposer);
    }

    public void makeSound () {
        System.out.println("Singer making sound");
    }
}
