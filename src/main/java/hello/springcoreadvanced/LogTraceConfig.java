package hello.springcoreadvanced;

import hello.springcoreadvanced.trace.logtrace.FieldLogTrace;
import hello.springcoreadvanced.trace.logtrace.LogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace(); // FieldLogTrace를 Spring Bean으로 등록 (singleton)
    }
}
