package app.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之前对" + beanName + "进行增强处理...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean后处理器在初始化之后对" + beanName + "进行增强处理...");
        //如果该bean是Chinese类的实例
        if (bean instanceof Chinese2) {
            //通过反射修改其name成员变量
            try {
                var clazz = bean.getClass();
                var f = clazz.getDeclaredField("name");
                f.setAccessible(true);
                f.set(bean, "FKJAVA:" + f.get(bean));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return bean;
    }
}
