package ccjeesite.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring-context*.xml");
		Model bean = (Model)ctx.getBean("model");
		bean.test();
		
		ControllerModel controller = (ControllerModel) ctx.getBean("controllerModel");
		controller.test();
	}
}
