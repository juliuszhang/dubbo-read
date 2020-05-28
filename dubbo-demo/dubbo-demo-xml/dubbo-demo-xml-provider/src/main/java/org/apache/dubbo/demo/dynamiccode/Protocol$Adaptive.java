/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  org.apache.dubbo.common.URL
 *  org.apache.dubbo.common.extension.ExtensionLoader
 *  org.apache.dubbo.rpc.Exporter
 *  org.apache.dubbo.rpc.Invoker
 *  org.apache.dubbo.rpc.Protocol
 *  org.apache.dubbo.rpc.RpcException
 */
package org.apache.dubbo.demo.dynamiccode;

import java.util.List;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Exporter;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.RpcException;

public class Protocol$Adaptive
        implements Protocol {
    public void destroy() {
        throw new UnsupportedOperationException("The method public abstract void org.apache.dubbo.rpc.Protocol.destroy() of interface org.apache.dubbo.rpc.Protocol is not adaptive method!");
    }

    public int getDefaultPort() {
        throw new UnsupportedOperationException("The method public abstract int org.apache.dubbo.rpc.Protocol.getDefaultPort() of interface org.apache.dubbo.rpc.Protocol is not adaptive method!");
    }

    public List getServers() {
        throw new UnsupportedOperationException("The method public default java.util.List org.apache.dubbo.rpc.Protocol.getServers() of interface org.apache.dubbo.rpc.Protocol is not adaptive method!");
    }

    public Exporter export(Invoker invoker) throws RpcException {
        String string;
        if (invoker == null) {
            throw new IllegalArgumentException("org.apache.dubbo.rpc.Invoker argument == null");
        }
        if (invoker.getUrl() == null) {
            throw new IllegalArgumentException("org.apache.dubbo.rpc.Invoker argument getUrl() == null");
        }
        URL uRL = invoker.getUrl();
        String string2 = string = uRL.getProtocol() == null ? "dubbo" : uRL.getProtocol();
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Failed to get extension (org.apache.dubbo.rpc.Protocol) name from url (").append(uRL.toString()).append(") use keys([protocol])").toString());
        }
        Protocol protocol = (Protocol) ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(string);
        return protocol.export(invoker);
    }

    public Invoker refer(Class class_, URL uRL) throws RpcException {
        String string;
        if (uRL == null) {
            throw new IllegalArgumentException("url == null");
        }
        URL uRL2 = uRL;
        String string2 = string = uRL2.getProtocol() == null ? "dubbo" : uRL2.getProtocol();
        if (string == null) {
            throw new IllegalStateException(new StringBuffer().append("Failed to get extension (org.apache.dubbo.rpc.Protocol) name from url (").append(uRL2.toString()).append(") use keys([protocol])").toString());
        }
        Protocol protocol = (Protocol) ExtensionLoader.getExtensionLoader(Protocol.class).getExtension(string);
        return protocol.refer(class_, uRL);
    }
}