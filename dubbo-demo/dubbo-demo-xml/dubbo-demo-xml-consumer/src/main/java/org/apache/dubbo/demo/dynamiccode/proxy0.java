/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  com.alibaba.dubbo.rpc.service.EchoService
 *  org.apache.dubbo.common.bytecode.ClassGenerator$DC
 *  org.apache.dubbo.rpc.service.Destroyable
 */
package org.apache.dubbo.demo.dynamiccode;

import com.alibaba.dubbo.rpc.service.EchoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.CompletableFuture;

import org.apache.dubbo.common.bytecode.ClassGenerator;
import org.apache.dubbo.demo.DemoService;
import org.apache.dubbo.rpc.service.Destroyable;

/**
 * 根据invoker生成的代理类
 */
public class proxy0
        implements ClassGenerator.DC,
        Destroyable,
        EchoService,
        DemoService {
    public static Method[] methods;
    private InvocationHandler handler;

    public Object $echo(Object object) {
        Object[] arrobject = new Object[]{object};
        Object object2 = null;
        try {
            object2 = this.handler.invoke(this, methods[0], arrobject);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object2;
    }

    public void $destroy() {
        Object[] arrobject = new Object[]{};
        try {
            Object object = this.handler.invoke(this, methods[1], arrobject);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public String sayHello(String string) {
        Object[] arrobject = new Object[]{string};
        Object object = null;
        try {
            object = this.handler.invoke(this, methods[2], arrobject);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return (String) object;
    }

    public CompletableFuture sayHelloAsync(String string) {
        Object[] arrobject = new Object[]{string};
        Object object = null;
        try {
            object = this.handler.invoke(this, methods[3], arrobject);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return (CompletableFuture) object;
    }

    public proxy0() {
    }

    public proxy0(InvocationHandler invocationHandler) {
        this.handler = invocationHandler;
    }
}