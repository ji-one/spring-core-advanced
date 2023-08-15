package hello.springcoreadvanced.proxy.config.v1_proxy.concrete_proxy;

import hello.springcoreadvanced.proxy.app.v2.OrderServiceV2;
import hello.springcoreadvanced.trace.TraceStatus;
import hello.springcoreadvanced.trace.logtrace.LogTrace;

public class OrderServiceConcreteProxy extends OrderServiceV2 {

    private final OrderServiceV2 target;
    private final LogTrace logTrace;

    public OrderServiceConcreteProxy(OrderServiceV2 target, LogTrace logTrace) {
        super(null); // 부모 기능 쓰지 않을 거라 필요 없음
        this.target = target;
        this.logTrace = logTrace;
    }

    @Override
    public void orderItem(String itemId) {
        TraceStatus status = null;
        try {
            status = logTrace.begin("OrderService.orderItem()");
            // target 호출
            target.orderItem(itemId);
            logTrace.end(status);
        } catch (Exception e) {
            logTrace.exception(status, e);
            throw e;
        }
    }
}
