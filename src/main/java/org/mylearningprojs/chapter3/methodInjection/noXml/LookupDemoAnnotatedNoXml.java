package org.mylearningprojs.chapter3.methodInjection.noXml;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemoAnnotatedNoXml {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/method-injection-annotated-xml.xml");
        ctx.refresh();

        DemoBeanAnnotatedNoXml abstractBean = ctx.getBean("abstractLookupBeanAnnotated", DemoBeanAnnotatedNoXml.class);
        DemoBeanAnnotatedNoXml standardBean = ctx.getBean("standardLookupBeanAnnotated", DemoBeanAnnotatedNoXml.class);

        displayInfo("abstractLookupBean",abstractBean);
        displayInfo("standardLookupBean",standardBean);

        ctx.close();
    }

    public static void displayInfo(String beanName, DemoBeanAnnotatedNoXml bean) {
        SingerAnnotatedNoXml singer1 = bean.getMySinger();
        SingerAnnotatedNoXml singer2 = bean.getMySinger();

        System.out.println(" " + beanName + " : Singer Instances the Same? "
                + (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++) {
            SingerAnnotatedNoXml singer = bean.getMySinger();
            singer.sing();
        }
        stopWatch.stop();

        System.out.println("100000 gets took "
                + stopWatch.getTotalTimeMillis() + " ms");
    }
}
