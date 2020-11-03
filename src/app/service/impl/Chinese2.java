package app.service.impl;

import app.service.Axe;
import app.service.Person;
import org.springframework.beans.factory.InitializingBean;

public class Chinese2 implements Person, InitializingBean {
    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void setName(String name) {
        System.out.println("Spring执行setName()方法注入依赖关系...");
        this.name = name;
    }

    private Axe axe;
    private String name;
    public Chinese2() {
        System.out.println("Spring实例化主调bean: Chinese实例...");
    }

    @Override
    public void useAxe() {
        System.out.println(name + axe.chop());
    }

    @Override
    public void test() {

    }
    public void init() {
        System.out.println("正在执行初始化方法init...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("正在执行初始化方法afterPropertiesSet...");
    }

}
