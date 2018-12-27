package com.test.sample.spring.di.application.context;


import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {

    public static final String CONFIG_LOCATION = "spring-3.xml";
    public static final String RECTANGLE = "rectangle";
    final static Logger LOGGER = LoggerFactory.getLogger(ConstructorInjection.class);

    public static void main(String[] args) {
        LOGGER.info("**************************************");
        LOGGER.info("ConstructorInjection Example");
        LOGGER.info("**************************************");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) applicationContext.getBean(RECTANGLE));
        drawing.drawShape();
    }
}
