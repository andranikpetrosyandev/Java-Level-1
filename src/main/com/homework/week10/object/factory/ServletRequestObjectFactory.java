package com.homework.week10.object.factory;

import java.util.Random;

public class ServletRequestObjectFactory implements ObjectFactory<ServletRequest> {

    @Override
    public ServletRequest getObject() {
        Random random = new Random();
        ServletRequest servletRequest = new ServletRequestImpl(random.nextInt(), "Body" + random.nextInt());
        return servletRequest;
    }
}
