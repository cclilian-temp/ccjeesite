package ccjeesite.spring.properties;

import org.springframework.beans.factory.annotation.Value;

public class PropertyModel {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void test() {
		System.out.println("name µÄÖµÎª" + this.name);
	}
}
