//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
// 根据Wrapper.makeWrapper生成出来的wrapper代码
// Invoker
//

package org.apache.dubbo.demo.dynamiccode;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.dubbo.common.bytecode.ClassGenerator.DC;
import org.apache.dubbo.common.bytecode.NoSuchPropertyException;
import org.apache.dubbo.common.bytecode.Wrapper;
import org.apache.dubbo.demo.provider.DemoServiceImpl;

public class Wrapper1 extends Wrapper implements DC {
    public static String[] pns;
    public static Map pts;
    public static String[] mns;
    public static String[] dmns;
    public static Class[] mts0;
    public static Class[] mts1;

    public String[] getPropertyNames() {
        return pns;
    }

    public boolean hasProperty(String var1) {
        return pts.containsKey(var1);
    }

    public Class getPropertyType(String var1) {
        return (Class) pts.get(var1);
    }

    public String[] getMethodNames() {
        return mns;
    }

    public String[] getDeclaredMethodNames() {
        return dmns;
    }

    public void setPropertyValue(Object var1, String var2, Object var3) {
        try {
            DemoServiceImpl var4 = (DemoServiceImpl) var1;
        } catch (Throwable var6) {
            throw new IllegalArgumentException(var6);
        }

        throw new NoSuchPropertyException("Not found property \"" + var2 + "\" field or setter method in class org.apache.dubbo.demo.provider.DemoServiceImpl.");
    }

    public Object getPropertyValue(Object var1, String var2) {
        try {
            DemoServiceImpl var3 = (DemoServiceImpl) var1;
        } catch (Throwable var5) {
            throw new IllegalArgumentException(var5);
        }

        throw new NoSuchPropertyException("Not found property \"" + var2 + "\" field or setter method in class org.apache.dubbo.demo.provider.DemoServiceImpl.");
    }

    public Object invokeMethod(Object var1, String var2, Class[] var3, Object[] var4) throws InvocationTargetException {
        DemoServiceImpl var5;
        try {
            var5 = (DemoServiceImpl) var1;
        } catch (Throwable var8) {
            throw new IllegalArgumentException(var8);
        }

        try {
            if ("sayHelloAsync".equals(var2) && var3.length == 1) {
                return var5.sayHelloAsync((String) var4[0]);
            }

            if ("sayHello".equals(var2) && var3.length == 1) {
                return var5.sayHello((String) var4[0]);
            }
        } catch (Throwable var9) {
            throw new InvocationTargetException(var9);
        }

        throw new RuntimeException();
    }

    public Wrapper1() {
    }
}
