package org.mylearningprojs.chapter3.annotated;

import org.mylearningprojs.chapter2.decoupled.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired
//    public ConfigurableMessageProvider(@Value("FML Configurable message") String message) {
    public ConfigurableMessageProvider(String message) {

        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;}
}
