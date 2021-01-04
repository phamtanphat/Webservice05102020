package com.example.webservice05102020.model;

import java.util.List;

public class ApiResponse <T>{

    private int totalpage;
    private String currentpage;
    private boolean success;
    private Object message;
    private T data;

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

    // 4 loai :
        //database local : Ten+entity
        //database remote : WordApi
        //business : ten model
        //form : LoginForm

//    Pushnotification
//    {data : {title : "Thong bao" , body : "Version moi"};
//    Adapter
//     Header : {title : "Chi tiet" }
//     Dialog
//    Chua noi dung tu dialog
}
