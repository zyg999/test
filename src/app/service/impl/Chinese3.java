package app.service.impl;

import app.service.Axe;
import app.service.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Chinese3 implements Person {
    @Value("周永刚")
    private String name;
    private Axe axe;

    @Resource(name = "steelAxe")
    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    @Override
    public void useAxe() {
        System.out.println(axe + "正在被使用");
    }

    @Override
    public void test() {
        System.out.println("测试");
    }
}
