package org.mylearningprojs.chapter2.helloWorldSpringWAnno;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
