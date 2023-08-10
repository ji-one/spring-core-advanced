package hello.springcoreadvanced;

import hello.springcoreadvanced.proxy.config.AppV1Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(AppV1Config.class)
@SpringBootApplication(scanBasePackages = "hello.springcoreadvanced.proxy.app")
public class SpringCoreAdvancedApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreAdvancedApplication.class, args);
    }

}
