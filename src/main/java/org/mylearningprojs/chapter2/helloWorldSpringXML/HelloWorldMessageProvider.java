package org.mylearningprojs.chapter2.helloWorldSpringXML;

public class HelloWorldMessageProvider implements MessageProvider {
    @Override
    public String getMessage() {
        return "Hello World, yo!";
    }
}
