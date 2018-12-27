package com.test.sample.spring.di.bean.factory;

import com.test.sample.spring.di.application.context.CollectionInjection;
import com.test.sample.spring.di.application.context.ConstructorInjection;
import com.test.sample.spring.di.application.context.ObjectInjection;
import com.test.sample.spring.di.application.context.PropertyInjection;
import com.test.sample.spring.di.plain.ApplicationPlain;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Driver {
    final static Logger logger = LoggerFactory.getLogger(Driver.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("Started");
        try {
            ApplicationPlain.main(null);
            Application.main(null);
            CollectionInjection.main(null);
            ConstructorInjection.main(null);
            ObjectInjection.main(null);
            PropertyInjection.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
