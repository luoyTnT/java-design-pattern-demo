package com.example.demo.state;

import lombok.Getter;

@Getter
public enum StateEnum {

    BUSY(1, "busy"),
    IDLE(2, "idle"),
    ;

    private final int code;
    private final String msg;

    StateEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
