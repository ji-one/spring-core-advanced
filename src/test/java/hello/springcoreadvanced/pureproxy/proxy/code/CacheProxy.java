package hello.springcoreadvanced.pureproxy.proxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CacheProxy implements Subject { // 프록시도 실제 객체와 모양이 같아야 하기 때문에 Subject 인터페이스를 구현

    private Subject target; // 실제 객체
    private String cacheValue;

    public CacheProxy(Subject target) {
        this.target = target;
    }

    @Override
    public String operation() {
        log.info("프록시 호출");
        if (cacheValue == null) {
            cacheValue = target.operation();
        }
        return cacheValue;
    }
}
