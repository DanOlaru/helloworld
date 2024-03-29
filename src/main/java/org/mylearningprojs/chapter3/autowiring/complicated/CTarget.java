package org.mylearningprojs.chapter3.autowiring.complicated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CTarget {
    private Foo fooOne;
    private Foo fooTwo;
    private Bar bar;
    public CTarget() {
    }
    public CTarget(Foo foo) {
        System.out.println("Target(Foo) called");
    }
    public CTarget(Foo foo, Bar bar) {
        System.out.println("Target(Foo, Bar) called");
    }
    public void setFooOne(Foo fooOne) {
        this.fooOne = fooOne;
        System.out.println("Property fooOne set");
    }
    public void setFooTwo(Foo foo) {
        this.fooTwo = foo;
        System.out.println("Property fooTwo set");
    }
    public void setBar(Bar bar) {
        this.bar = bar;
        System.out.println("Property bar set");
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/autowiring-example-complicated.xml");
        ctx.refresh();

        CTarget t = null;

        System.out.println("\nUsing byType:\n");
        t = (CTarget) ctx.getBean("targetByType");


        ctx.close();
    }
}
