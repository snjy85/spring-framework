package com.test.sample.spring.di.bean.factory;


import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Application {

    public static final String PATH = "dependency-injection/src/main/resources/spring-0.xml";
    public static final String CIRCLE = "circle";
    public static final String TRIANGLE = "triangle";
    final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOGGER.info("**************************************");
        LOGGER.info("XmlBeanFactory Example");
        LOGGER.info("**************************************");
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource(PATH));
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) beanFactory.getBean(CIRCLE));
        drawing.drawShape();
        drawing.setShape((Shape) beanFactory.getBean(TRIANGLE));
        drawing.drawShape();
    }
}
