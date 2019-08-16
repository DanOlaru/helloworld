package org.mylearningprojs.helloWorldSimple;

import java.util.Properties;

public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;

    private MessageSupportFactory() {
        props = new Properties();

        try {
            //TODO: de ce nu gaseste acest fisier?
            props.load(this.getClass().getResourceAsStream("/msf.properties"));
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

//            rendererClass = "org.mylearningprojs.helloWorldSimple.StandardOutMessageRenderer";
//            providerClass = "org.mylearningprojs.helloWorldSimple.HelloWorldMessageProvider";

            renderer = (MessageRenderer) Class.forName(rendererClass).getConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return renderer;
    }
    public MessageProvider getMessageProvider() {
        return provider;
    }
}
