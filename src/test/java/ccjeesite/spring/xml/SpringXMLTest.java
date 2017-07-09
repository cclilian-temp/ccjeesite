package ccjeesite.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring-context*.xml");
		Bean bean = (Bean)ctx.getBean("aa");
		bean.test();
	}
}
