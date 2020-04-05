package com.warehouse.common;


public class JsonData<T> {
    private int code;
    private String msg;
    private Object obj;
    private String token;

    public JsonData() {
    }

    public JsonData(int code) {
        this.code = code;
    }

    public JsonData(String msg) {
        this.msg = msg;
    }

    public JsonData(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonData(int code, Object obj) {
        this.code = code;
        this.obj = obj;
    }

    public JsonData(int code, String msg, Object obj) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
    }

    public JsonData(int code, String msg, Object obj, String token) {
        this.code = code;
        this.msg = msg;
        this.obj = obj;
        this.token = token;
    }

    public static JsonData success(String msg, Object obj) {
        JsonData jsonData = new JsonData(200, msg, obj);
        return jsonData;
    }

    public static JsonData success(String msg, Object obj, String token) {
        JsonData jsonData = new JsonData(200, msg, obj, token);
        return jsonData;
    }

    public static JsonData success(String msg) {
        JsonData jsonData = new JsonData(200, msg);
        return jsonData;
    }


    public static JsonData faile(String msg) {
        return new JsonData(201, msg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
