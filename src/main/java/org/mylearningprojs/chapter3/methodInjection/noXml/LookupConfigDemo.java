package org.mylearningprojs.chapter3.methodInjection.noXml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.util.StopWatch;

public class LookupConfigDemo {

    @Configuration
    @ComponentScan(basePackages = {"org.mylearningprojs.chapter3.methodInjection.noXml"})
    public static class LookupConfig {}

    public static void main(String... args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(LookupConfig.class);

        DemoBeanAnnotatedNoXml abstractBean = ctx.getBean("abstractLookupBeanAnnotatedNoXml", DemoBeanAnnotatedNoXml.class);
        DemoBeanAnnotatedNoXml standardBean = ctx.getBean("standardLookupBeanAnnotatedNoXml", DemoBeanAnnotatedNoXml.class);

        displayInfo("abstractLookupBeanAnnotatedNoXml",abstractBean);
        displayInfo("standardLookupBeanAnnotatedNoXml",standardBean);

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
