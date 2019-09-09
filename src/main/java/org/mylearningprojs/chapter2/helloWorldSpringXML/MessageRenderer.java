package org.mylearningprojs.chapter2.helloWorldSpringXML;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
