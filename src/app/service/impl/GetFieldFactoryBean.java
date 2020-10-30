package app.service.impl;

import org.springframework.beans.factory.FactoryBean;

public class GetFieldFactoryBean implements FactoryBean<Object> {
    private String targetClass;
    private String targetField;

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    public void setTargetField(String targetField) {
        this.targetField = targetField;
    }

   //返回工厂Bean所生产的产品
    @Override
    public Object getObject() throws Exception {
        var clazz = Class.forName(targetClass);
        var field = clazz.getDeclaredField(targetField);
        return field.get(null);
    }

    @Override
    public Class<?> getObjectType() {
        return Object.class;
    }
}
