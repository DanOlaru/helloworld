package org.mylearningprojs.chapter3.methodReplacement;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class FormatMessageReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object arg0, Method method, Object... args) throws Throwable {
        if (isFormatMessageMethod(method)) {
            //String msg = (String) arg0;
            //return "<h2>" + msg + "<h2>";
            return "<h2>" + arg0 + "<h2>";

        } else {
            throw new IllegalArgumentException("Dan: Unable to implement method " + method.getName());
        }
    }

    private boolean isFormatMessageMethod(Method method) {
        if (method.getParameterTypes().length != 1) {return false;}

        if (!("formatMessage".equals(method.getName()))) {return false;}

        if (method.getReturnType() != String.class) {return false;}

        if (method.getParameterTypes()[0] != String.class) {return false;}

        return true;
    }

}
