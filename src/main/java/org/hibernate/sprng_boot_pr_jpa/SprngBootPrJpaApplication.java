package org.hibernate.sprng_boot_pr_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SprngBootPrJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprngBootPrJpaApplication.class, args);
    }

}
