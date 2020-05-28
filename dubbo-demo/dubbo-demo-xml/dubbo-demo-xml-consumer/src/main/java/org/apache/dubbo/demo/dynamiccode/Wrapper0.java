package org.apache.dubbo.demo.dynamiccode;

import org.apache.dubbo.common.bytecode.ClassGenerator;
import org.apache.dubbo.common.bytecode.Wrapper;
import org.apache.dubbo.demo.DemoService;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class Wrapper0
extends Wrapper
implements ClassGenerator.DC {
    public static String[] pns;
    public static Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;
    public static Class[] mts1;

    public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String string) {
        return pts.containsKey(string);
    }

    public Class getPropertyType(String string) {
        return (Class)pts.get(string);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object object, String string, Object object2) {
        try {
            DemoService demoService = (DemoService)object;
        }
        catch (Throwable throwable) {
            throw new IllegalArgumentException(throwable);
        }
    }

    public Object getPropertyValue(Object object, String string) {
        try {
            return (DemoService)object;
        }
        catch (Throwable throwable) {
            throw new IllegalArgumentException(throwable);
        }
    }

    public Object invokeMethod(Object object, String string, Class[] arrclass, Object[] arrobject) throws InvocationTargetException {
        DemoService demoService;
        try {
            demoService = (DemoService)object;
        }
        catch (Throwable throwable) {
            throw new IllegalArgumentException(throwable);
        }
        try {
            if ("sayHello".equals(string) && arrclass.length == 1) {
                return demoService.sayHello((String)arrobject[0]);
            }
            if ("sayHelloAsync".equals(string) && arrclass.length == 1) {
                return demoService.sayHelloAsync((String)arrobject[0]);
            }
        }
        catch (Throwable throwable) {
            throw new InvocationTargetException(throwable);
        }
        throw new RuntimeException();
    }
}