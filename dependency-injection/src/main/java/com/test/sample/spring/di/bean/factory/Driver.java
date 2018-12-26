package com.test.sample.spring.di.bean.factory;

import com.test.sample.spring.di.application.context.CollectionInjection;
import com.test.sample.spring.di.application.context.ConstructorInjection;
import com.test.sample.spring.di.application.context.ObjectInjection;
import com.test.sample.spring.di.application.context.PropertyInjection;
import com.test.sample.spring.di.plain.ApplicationPlain;

public class Driver {
    public static void main(String[] args) {
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
