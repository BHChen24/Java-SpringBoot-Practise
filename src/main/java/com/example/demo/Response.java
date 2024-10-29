package com.example.demo;

public class Response<T> {
    private boolean success;
    private String errorMessage;
    private T data;

    public static <K> Response<K> createSuccess(K data) {
        Response<K> response = new Response<>();
        response.setData(data);
        response.setSuccess(true);
        return response;
    }

    public static Response<Void> createError(String errorMessage) {
        Response<Void> response = new Response<>();
        response.setErrorMessage(errorMessage);
        response.setSuccess(false);
        return response;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public T getData() {
        return data;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }
}
