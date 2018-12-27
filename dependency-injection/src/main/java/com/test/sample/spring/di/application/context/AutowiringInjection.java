package com.test.sample.spring.di.application.context;

import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringInjection {

    public static final String CONFIG_LOCATION = "spring-5.xml";
    public static final String POINTED_TRIANGLE = "pointedTriangle";

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("ObjectInjection Example");
        System.out.println("**************************************");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) applicationContext.getBean(POINTED_TRIANGLE));
        drawing.drawShape();
    }
}
