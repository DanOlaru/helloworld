package org.mylearningprojs.chapter3.beanNamingExamples.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasConfigDemo {

    @Configuration
    public static class AliasBeanConfig {
        @Bean
        public Singer singer() {
            return new Singer();
        }

        @Bean (name = {"pianist", "Liberace", "Daniel Barenboim" , "V. Horowitz"})
        public Pianist pianist() {
            return new Pianist();
        }
    }


    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AliasBeanConfig.class);

        Map<String, Musician> beans = ctx.getBeansOfType(Musician.class);

        beans.entrySet().stream().forEach(b ->
                System.out.println("id: " + b.getKey() + " \n aliases: " +
                        Arrays.toString(ctx.getAliases(b.getKey()))));

        ctx.close();
    }

}
