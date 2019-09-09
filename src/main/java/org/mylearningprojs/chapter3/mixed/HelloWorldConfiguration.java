package org.mylearningprojs.chapter3.mixed;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"org.mylearningprojs.chapter3.annotated"})
@Configuration
public class HelloWorldConfiguration {

}
