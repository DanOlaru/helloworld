package org.mylearningprojs.chapter3.annotated;

import org.mylearningprojs.chapter2.decoupled.MessageProvider;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World, yo!";
    }
}
