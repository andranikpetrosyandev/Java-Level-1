package com.homework.week10.object.factory;


public class ServletRequestObjectFactory implements ObjectFactory<ServletRequest> {

    @Override
    public ServletRequest getObject() {

        ServletRequest servletRequest = new ServletRequestImpl();
        return servletRequest;
    }
}
