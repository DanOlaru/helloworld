package org.mylearningprojs.chapter3.methodInjection.withAnnos;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class LookupDemoAnnotated {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/method-injection-annotated-xml.xml");
        ctx.refresh();

        DemoBeanAnnotated abstractBean = ctx.getBean("abstractLookupBeanAnnotated", DemoBeanAnnotated.class);
        DemoBeanAnnotated standardBean = ctx.getBean("standardLookupBeanAnnotated", DemoBeanAnnotated.class);

        displayInfo("abstractLookupBean",abstractBean);
        displayInfo("standardLookupBean",standardBean);

        ctx.close();
    }

    public static void displayInfo(String beanName, DemoBeanAnnotated bean) {
        SingerAnnotated singer1 = bean.getMySinger();
        SingerAnnotated singer2 = bean.getMySinger();

        System.out.println(" " + beanName + " : Singer Instances the Same? "
                + (singer1 == singer2));

        StopWatch stopWatch = new StopWatch();
        stopWatch.start("lookupDemo");
        for (int x = 0; x < 100000; x++) {
            SingerAnnotated singer = bean.getMySinger();
            singer.sing();
        }
        stopWatch.stop();

        System.out.println("100000 gets took "
                + stopWatch.getTotalTimeMillis() + " ms");
    }
}
