package lee;

import app.service.impl.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest3 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("beans3.xml");
        var dog = ctx.getBean("dog", Dog.class);
        dog.yell();
        System.out.println(ctx.getBean("thename"));
    }
}
