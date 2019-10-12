package com.zl.springbootexception.exception;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 14:12
 */
public class CustomException extends RuntimeException{

    private int code;
    private String msg;

    public CustomException(int code, String msg) {
        this.code = code;
        this.msg = msg;
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
/* private String id;
    public CustomException(){
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }*/
}
