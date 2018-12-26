package com.sanjay.sample.spring.bean.factory;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring.xml");
        Drawing drawing = new Drawing();
        System.out.println(((ClassPathXmlApplicationContext) beanFactory).getApplicationName());
        drawing.setShape((Shape) beanFactory.getBean("circle"));
        drawing.drawShape();
        drawing.setShape((Shape) beanFactory.getBean("triangle"));
        drawing.drawShape();
    }
}
