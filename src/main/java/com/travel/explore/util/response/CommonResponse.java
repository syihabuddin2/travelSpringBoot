package com.travel.explore.util.response;

/**
 * Created By Syihabuddin on 2021-03-11 13:31:55
 */

public class CommonResponse<T> {

    private String status;
    private String message;
    private T datas;

    public CommonResponse() {
    }

    public CommonResponse(String status, String message, T datas) {
        this.status = status;
        this.message = message;
        this.datas = datas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDatas() {
        return datas;
    }

    public void setDatas(T datas) {
        this.datas = datas;
    }

}