package com.test.sample.spring.di.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class RectangleInitDestroy implements Shape, InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {
    private int height;
    private int width;
    private ApplicationContext context;

    public RectangleInitDestroy(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println("In Rectangle draw method with height :" + getHeight());
        System.out.println("In Rectangle draw method with width :" + getWidth());
    }

    public int getWidth() {
        return width;
    }

    public void destroy() {
        System.out.println("In Destroy");

    }

    public void afterPropertiesSet() {
        System.out.println("In afterPropertiesSet");

    }

    public void setBeanName(String name) {
        System.out.println("Beanname is :" + name);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}