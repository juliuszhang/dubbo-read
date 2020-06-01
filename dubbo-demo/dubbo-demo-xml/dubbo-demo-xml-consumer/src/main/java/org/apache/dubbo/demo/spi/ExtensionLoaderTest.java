package org.apache.dubbo.demo.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @author yibozhang
 * @date 2020/6/1 10:52 上午
 */
public class ExtensionLoaderTest {

    public static void main(String[] args) {
        Protocol dubboProtocol = ExtensionLoader.getExtensionLoader(Protocol.class).getExtension("dubbo");
        System.out.println(dubboProtocol);
    }

}
