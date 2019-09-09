package org.mylearningprojs.chapter3.methodInjection.noXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("standardLookupBeanAnnotatedNoXml")
public class StandardLookupDemoBeanAnnotatedNoXml implements DemoBeanAnnotatedNoXml {
    private SingerAnnotatedNoXml mySinger;

    @Autowired
    @Qualifier("singerAnnotated")
    public void setMySinger(SingerAnnotatedNoXml mySinger) {
        this.mySinger = mySinger;
    }

    @Override
    public SingerAnnotatedNoXml getMySinger() {
        return this.mySinger;
    }

    @Override
    public void doSomething() {
        mySinger.sing();
    }
}
