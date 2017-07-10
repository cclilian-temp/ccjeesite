package ccjeesite.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ccjeesite.spring.xml.Bean;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring-context*.xml");
		One bean = (One)ctx.getBean("one");
		bean.before();;
    }
}
