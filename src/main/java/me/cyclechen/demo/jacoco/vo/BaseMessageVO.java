package me.cyclechen.demo.jacoco.vo;

public class BaseMessageVO {

    int code;
    String message;

    BaseMessageVO(int code , String message){
        this.code = code ;
        this.message = message ;
    }

    public static BaseMessageVO success(String message) {
        BaseMessageVO response = new BaseMessageVO(200, message);
        return response;
    }

    public static BaseMessageVO error(int code, String message) {
        BaseMessageVO response = new BaseMessageVO(code, message);
        return response;
    }
}
