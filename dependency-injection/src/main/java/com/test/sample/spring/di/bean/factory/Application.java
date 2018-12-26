package com.test.sample.spring.di.bean.factory;


import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Application {

    public static final String PATH = "dependency-injection/src/main/resources/spring-0.xml";
    public static final String CIRCLE = "circle";
    public static final String TRIANGLE = "triangle";

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("XmlBeanFactory Example");
        System.out.println("**************************************");
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(PATH));
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) beanFactory.getBean(CIRCLE));
        drawing.drawShape();
        drawing.setShape((Shape) beanFactory.getBean(TRIANGLE));
        drawing.drawShape();
    }
}
