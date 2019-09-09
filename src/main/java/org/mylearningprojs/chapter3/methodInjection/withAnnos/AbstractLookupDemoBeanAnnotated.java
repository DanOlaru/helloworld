package org.mylearningprojs.chapter3.methodInjection.withAnnos;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("abstractLookupBeanAnnotated")
public class AbstractLookupDemoBeanAnnotated implements DemoBeanAnnotated {
    @Lookup("singerAnnotated")
    public SingerAnnotated getMySinger() {
        return null;
    }

    @Override
    public void doSomething() {
        getMySinger().sing();
    }
}
