package org.mylearningprojs.chapter3.xml;

import org.mylearningprojs.chapter2.decoupled.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    public ConfigurableMessageProvider (String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
