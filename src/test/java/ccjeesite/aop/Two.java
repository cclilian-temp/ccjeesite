package ccjeesite.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
public class Two {
    public void test()
    {
        System.out.println("横切关注点");
    }
}