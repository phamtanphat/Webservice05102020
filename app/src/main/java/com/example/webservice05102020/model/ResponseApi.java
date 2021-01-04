package com.example.webservice05102020.model;

public class ResponseApi<T>{

    private int totalpage;
    private String currentpage;
    private boolean success;
    private Object message;
    private T data;

    public ResponseApi(int totalpage, String currentpage, boolean success, Object message, T data) {
        this.totalpage = totalpage;
        this.currentpage = currentpage;
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public ResponseApi() {
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public String getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(String currentpage) {
        this.currentpage = currentpage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
