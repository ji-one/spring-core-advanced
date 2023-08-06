package hello.springcoreadvanced.trace.callback;

public interface TraceCallback<T> {
    T call();
}
