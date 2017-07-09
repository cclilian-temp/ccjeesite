package ccjeesite.spring.annotation;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerModel {
	public void test() {
		System.out.println("这句话不应该看见");
	}
}
