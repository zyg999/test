package lee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest4 {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("beans4.xml");

    }
}
