package org.mylearningprojs.helloWorldSimple;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World, yo!";
    }
}