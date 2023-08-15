package hello.springcoreadvanced.pureproxy.proxy;

import hello.springcoreadvanced.pureproxy.proxy.code.ProxyPatternClient;
import hello.springcoreadvanced.pureproxy.proxy.code.RealSubject;
import org.junit.jupiter.api.Test;

public class ProxyPatternTest {

    @Test
    void noProxyTest() {
        RealSubject realSubject = new RealSubject();
        ProxyPatternClient client = new ProxyPatternClient(realSubject);
        client.execute();
        client.execute();
        client.execute();
    }
}
