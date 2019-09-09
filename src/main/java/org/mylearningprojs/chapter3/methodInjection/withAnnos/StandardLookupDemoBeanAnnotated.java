package org.mylearningprojs.chapter3.methodInjection.withAnnos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("standardLookupBeanAnnotated")
public class StandardLookupDemoBeanAnnotated implements DemoBeanAnnotated {
    private SingerAnnotated mySinger;

    @Autowired
    @Qualifier("singerAnnotated")
    public void setMySinger(SingerAnnotated mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public SingerAnnotated getMySinger() {
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
