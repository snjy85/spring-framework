package com.test.sample.spring.di.application.context;


import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyInjection {

    public static final String CONFIG_LOCATION = "spring-2.xml";
    public static final String CIRCLE = "circle";
    public static final String TRIANGLE = "triangle";

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("PropertyInjection Example");
        System.out.println("**************************************");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) applicationContext.getBean(CIRCLE));
        drawing.drawShape();
        drawing.setShape((Shape) applicationContext.getBean(TRIANGLE));
        drawing.drawShape();
    }
}
