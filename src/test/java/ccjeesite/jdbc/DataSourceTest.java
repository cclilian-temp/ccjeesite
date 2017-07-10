package ccjeesite.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DataSourceTest {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/spring-context*.xml");
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		try {
			Connection conn = dataSource.getConnection();
			ResultSet result = conn.createStatement().executeQuery("SELECT 'columnValue' as columnName FROM DUAL");
			result.next();
			String x = result.getString("columnName");
			System.out.println(x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
