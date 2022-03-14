package com.homework.week10.object.factory;

import java.util.Random;

public class ServletRequestObjectFactory implements ObjectFactory<ServletRequestImpl> {

    @Override
    public ServletRequestImpl getObject() {
        Random random = new Random();
        ServletRequestImpl servletRequest = new ServletRequestImpl(random.nextInt(), "Body" + random.nextInt());
        return servletRequest;
    }
}
