package lee;

import app.service.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;


public class BeanTest {
    public static void main(String[] args) {
        //创建Spring容器
        var ctx = new ClassPathXmlApplicationContext("beans.xml");
        var hello = ctx.getMessage("hello", new String[] {"周永刚"}, Locale.getDefault(Locale.Category.FORMAT));
        System.out.println(hello);
        //获取chinese实例
        var p = ctx.getBean("chinese", Person.class);
        p.useAxe();
        p.test();
    }
}
