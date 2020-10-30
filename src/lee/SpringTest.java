package lee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("beans2.xml");
        //获取FactoryBean的产品
        System.out.println(ctx.getBean("north"));
        System.out.println(ctx.getBean("theValue"));
        //获取FactoryBean本身
        System.out.println(ctx.getBean("&north"));
        System.out.println(ctx.getBean("&theValue"));
    }
}
