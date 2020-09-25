package com.data.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 在自定义异常的错误码和信息时，如果过多，没有统一管理，则会出现重复。
 * 使用枚举统一管理code和message：
 */

@Getter
@AllArgsConstructor
public enum ResultEnum {

    // 数据操作错误定义
    SUCCESS(200, "成功!"),
    BODY_NOT_MATCH(400,"请求的数据格式不符!"),
    SIGNATURE_NOT_MATCH(401,"请求的数字签名不匹配!"),
    NOT_FOUND(404, "未找到该资源!"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误!"),
    SERVER_BUSY(503,"服务器正忙，请稍后再试!");

    private final Integer code;
    private final String msg;

}
