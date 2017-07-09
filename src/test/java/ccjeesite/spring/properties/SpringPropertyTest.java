package ccjeesite.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringPropertyTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring-context*.xml");
		PropertyModel model = (PropertyModel) ctx.getBean("propertyModel");
		model.test();
	}
}
