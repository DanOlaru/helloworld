package org.mylearningprojs.chapter3.beanNamingExamples.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BeanNamingTest {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/bean-naming-examples-xml.xml");
        ctx.refresh();

        List<String> beans = Arrays.asList(ctx.getBeanDefinitionNames());
        //beans.stream().forEach(b -> System.out.println(b + " "));

        Map<String,String> beansMap = ctx.getBeansOfType(String.class);
        beansMap.entrySet().stream().forEach(b -> System.out.println(b.getKey()));


        ctx.close();
    }
}
