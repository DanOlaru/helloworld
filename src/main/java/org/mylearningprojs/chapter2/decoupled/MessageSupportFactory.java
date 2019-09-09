package org.mylearningprojs.chapter2.decoupled;

import java.io.InputStream;
import java.util.Properties;

public class MessageSupportFactory {
    //nu are sens sa faci un bloc static doar pt initializarea fieldului instance, poti faci asta 'in place' la declarare
    private static MessageSupportFactory instance = new MessageSupportFactory();

    private Properties props;
    private MessageRenderer renderer;
    private MessageProvider provider;


    private MessageSupportFactory() {
        props = new Properties();

        try {
            //TODO: de ce nu gaseste acest fisier?
            //aveai 2 greseli
            //1. iti lipsea getClassLoader()
            //2. aveai proprietatile scrise gresit, e necesar ca mereu cheia si valoarea sa fie pe acelasi rand (key=value)
            InputStream inStream = getClass().getClassLoader().getResourceAsStream("msf.properties");
            props.load(inStream);
            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

//            rendererClass = "org.mylearningprojs.chapter2.decoupled.StandardOutMessageRenderer";
//            providerClass = "org.mylearningprojs.chapter2.decoupled.HelloWorldMessageProvider";
            renderer = (MessageRenderer) Class.forName(rendererClass).getConstructor().newInstance();
            provider = (MessageProvider) Class.forName(providerClass).getConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
