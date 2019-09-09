package org.mylearningprojs.chapter3.methodInjection.noXml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singerAnnotated")
@Scope("prototype")
public class SingerAnnotatedNoXml {
    private String lyric = "I played a quick game of chess with the salt and pepper shaker";
    public void sing() {
        //commented because it pollutes the output
        //System.out.println(lyric);
    }
}
