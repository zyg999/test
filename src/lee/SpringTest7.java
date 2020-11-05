package lee;

import app.service.impl.Chinese3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest7 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("beans7.xml");
        Chinese3 chinese3 = ctx.getBean("chinese3", Chinese3.class);
        chinese3.useAxe();

    }
}
