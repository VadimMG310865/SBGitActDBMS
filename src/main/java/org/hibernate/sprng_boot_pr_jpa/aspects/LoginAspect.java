package org.hibernate.sprng_boot_pr_jpa.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoginAspect {
    @Before("execution(public String orderadd(*))")
    public void beforeAddOrder() {
        System.out.println("Аспект Before add order");
    }
}
