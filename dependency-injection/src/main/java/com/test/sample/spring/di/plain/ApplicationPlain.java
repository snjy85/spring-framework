package com.test.sample.spring.di.plain;


import com.test.sample.spring.di.common.Circle;
import com.test.sample.spring.di.common.Drawing;
import com.test.sample.spring.di.common.Triangle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApplicationPlain {
    final static Logger LOGGER = LoggerFactory.getLogger(ApplicationPlain.class);

    public static void main(String[] args) {
        LOGGER.info("**************************************");
        LOGGER.info("ApplicationPlain Example");
        LOGGER.info("**************************************");
        Drawing d = new Drawing();
        d.setShape(new Circle());
        d.drawShape();
        d.setShape(new Triangle());
        d.drawShape();
    }
}
