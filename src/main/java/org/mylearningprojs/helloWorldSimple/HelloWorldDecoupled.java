package org.mylearningprojs.helloWorldSimple;

public class HelloWorldDecoupled {

    //implementation #1
    /*public static void main(String... args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }*/

    //implementation #2
    public static void main(String... args) {
        MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();

        mr.setMessageProvider(mp);
        mr.render();
    }
}
