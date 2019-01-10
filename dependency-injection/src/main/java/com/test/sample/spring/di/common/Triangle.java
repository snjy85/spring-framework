package com.test.sample.spring.di.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements Shape, InitializingBean, DisposableBean {

    public void draw() {
        System.out.println("In Triangle draw method");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    public void setBeanName(String name) {

    }

    public void destroy() {

    }

    public void afterPropertiesSet() {

    }
}
