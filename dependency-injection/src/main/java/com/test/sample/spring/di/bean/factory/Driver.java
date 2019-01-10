package com.test.sample.spring.di.bean.factory;

import com.test.sample.spring.di.application.context.*;
import com.test.sample.spring.di.plain.ApplicationPlain;
import org.apache.log4j.BasicConfigurator;


public class Driver {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        try {
            ApplicationPlain.main(null);
            Application.main(null);
            CollectionInjection.main(null);
            ConstructorInjection.main(null);
            ObjectInjection.main(null);
            PropertyInjection.main(null);
            InitDestroyBean.main(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
