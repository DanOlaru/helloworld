package org.mylearningprojs.chapter3.beanNamingExamples.annotation;
import org.springframework.stereotype.Component;

@Component
public class Singer implements Musician {
    private String lyric = "We found a message in a bottle we were drinking";
    public void sing() {
        System.out.println(lyric);
    }

    public void makeSound () {
        System.out.println("Singer making sound");
    }
}