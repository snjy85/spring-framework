package com.test.sample.spring.di.application.context;


import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Shape;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyBean {

    public static final String CONFIG_LOCATION = "spring-6.xml";
    public static final String RECTANGLE = "rectangleBeanName";
    final static Logger LOGGER = LoggerFactory.getLogger(InitDestroyBean.class);

    public static void main(String[] args) {
        LOGGER.info("**************************************");
        LOGGER.info("InitDestroyBean Example");
        LOGGER.info("**************************************");
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        applicationContext.registerShutdownHook();
        Drawing drawing = new Drawing();
        drawing.setShape((Shape) applicationContext.getBean(RECTANGLE));
        drawing.drawShape();
    }
}
