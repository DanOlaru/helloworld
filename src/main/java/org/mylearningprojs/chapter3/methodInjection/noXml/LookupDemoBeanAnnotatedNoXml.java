package org.mylearningprojs.chapter3.methodInjection.noXml;

import org.mylearningprojs.chapter3.methodInjection.DemoBean;
import org.mylearningprojs.chapter3.methodInjection.Singer;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("lookupDemoBeanAnnotated")
public class LookupDemoBeanAnnotatedNoXml implements DemoBean {

    @Lookup("singerAnnotated")
    public Singer getMySinger() {
        return null; //overriden dynamically
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
