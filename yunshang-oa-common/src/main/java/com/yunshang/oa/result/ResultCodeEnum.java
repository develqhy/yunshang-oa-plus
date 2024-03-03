package com.yunshang.oa.result;

import lombok.Getter;

/**
 * @author qhy
 * @create 2024-02-29 14:44
 */
@Getter
public enum ResultCodeEnum {

    SUCCESS(200,"成功"),
    Fail(444,"失败"),
    SERVICE_ERROR(2023,"服务异常"),
    DATA_ERROR(204,"数据异常"),
    LOGIN_AUTH(208,"未登录"),
    PERMISSION(209,"没有权限")
    ;

    private Integer code;
    private String msg;

    private ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
