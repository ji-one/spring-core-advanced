package hello.springcoreadvanced;

import hello.springcoreadvanced.proxy.config.v1_proxy.InterfaceProxyConfig;
import hello.springcoreadvanced.trace.logtrace.LogTrace;
import hello.springcoreadvanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
//@Import({AppV1Config.class, AppV2Config.class})
@Import(InterfaceProxyConfig.class)
@SpringBootApplication(scanBasePackages = "hello.springcoreadvanced.proxy.app")
public class SpringCoreAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreAdvancedApplication.class, args);
    }

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
