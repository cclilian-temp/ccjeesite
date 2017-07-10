package ccjeesite.aop;

import org.springframework.stereotype.Component;

@Component  //该注解表明该类是一个普通的bean类,但是没有任何迹象表明他将会被谁服务
public class One {
    public void before() {
        System.out.println("主要功能");

    }
}
