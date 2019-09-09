package org.mylearningprojs.chapter3.beanNamingExamples.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Map;

public class AnnotatedBeanNaming {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/bean-annotation-naming.xml");
        ctx.refresh();

        Map<String,Musician> beans = ctx.getBeansOfType(Musician.class);

        beans.entrySet().stream().forEach(b -> System.out.println("id: " + b.getKey()));

        ctx.close();
    }
}
