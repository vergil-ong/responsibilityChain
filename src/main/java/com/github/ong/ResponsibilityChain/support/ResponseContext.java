package com.github.ong.ResponsibilityChain.support;

public class ResponseContext {

    private boolean isSuccess = false;

    private Object responseBody;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Object getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(Object responseBody) {
        this.responseBody = responseBody;
    }
}
