package com.test.sample.spring.di.application.context;


import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

    public static final String CONFIG_LOCATION = "spring-3.xml";
    public static final String RECTANGLE = "rectangle";

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("ConstructorInjection Example");
        System.out.println("**************************************");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) applicationContext.getBean(RECTANGLE));
        drawing.drawShape();
    }
}
