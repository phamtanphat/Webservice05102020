package com.example.webservice05102020.model;

public class WordApi {
    private String id;
    private String en;
    private String vn;
    private boolean ismemorized;

    public WordApi(String id, String en, String vn, boolean ismemorized) {
        this.id = id;
        this.en = en;
        this.vn = vn;
        this.ismemorized = ismemorized;
    }

    public WordApi() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public boolean isIsmemorized() {
        return ismemorized;
    }

    public void setIsmemorized(boolean ismemorized) {
        this.ismemorized = ismemorized;
    }
}
