package org.mylearningprojs.chapter3.methodInjection.noXml;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBeanAnnotatedNoXml")
public class AbstractLookupDemoBeanAnnotatedNoXml implements DemoBeanAnnotatedNoXml {
    @Lookup("singerAnnotated")
    public SingerAnnotatedNoXml getMySinger() {
        return null;
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
