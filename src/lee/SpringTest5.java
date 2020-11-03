package lee;

import app.service.impl.Chinese2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest5 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("beans5.xml");
        var p = ctx.getBean("chinese2", Chinese2.class);
        p.useAxe();
    }
}
