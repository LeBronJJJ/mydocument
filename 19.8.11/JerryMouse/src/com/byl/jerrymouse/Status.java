package com.byl.jerrymouse;

public enum Status {

    OK(200,"OK"),
    BAD_REQUEST(400,"BAD_REQUEST"),
    NOT_FOUND(404,"NOT FOUND"),
    INTERNAL_SERVER_ERROR(500,"Internal Server error");

    private int code;
    private String reason;

    public int getCode() {
        return code;
    }

    public String getReason() {
        return reason;
    }

    Status(int code, String reason){
        this.code = code;
        this.reason = reason;
    }
}
