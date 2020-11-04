package lee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class SpringTest6 {
    public static void main(String[] args) throws SQLException {
        var ctx = new ClassPathXmlApplicationContext("beans6.xml");
        DataSource dataSource = ctx.getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
