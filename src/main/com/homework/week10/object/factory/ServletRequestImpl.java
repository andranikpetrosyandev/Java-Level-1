package com.homework.week10.object.factory;

public class ServletRequestImpl implements ServletRequest {
    private int contentLength;
    private String body;

    ServletRequestImpl(int contentLength, String body) {
        this.contentLength = contentLength;
        this.body = body;
    }

    @Override
    public int getContentLength() {
        return contentLength;
    }

    @Override
    public String getBody() {
        return body;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
