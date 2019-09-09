package org.mylearningprojs.chapter3;

import org.mylearningprojs.chapter2.decoupled.MessageProvider;
import org.mylearningprojs.chapter2.decoupled.MessageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context.xml");
//        ctx.load("classpath:spring/app-constructor-p.xml");

        ctx.refresh();

//        MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
//        messageRenderer.render();

        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());

        ctx.close();
    }
}
