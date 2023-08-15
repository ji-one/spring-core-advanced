package hello.springcoreadvanced.pureproxy.concreteproxy;

import hello.springcoreadvanced.pureproxy.concreteproxy.code.ConcreteClient;
import hello.springcoreadvanced.pureproxy.concreteproxy.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }
}
