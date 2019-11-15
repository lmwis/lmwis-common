package com.fehead.lang.error;

/**
 * @author lmwis
 * @description:实现通用错误接口的异常枚举类
 * @date 2019-08-28 20:29
 * @Version 1.0
 */
public enum EmBusinessError implements CommonError {
    // 通用错误类型 10001
    UNKNOWN_ERROR(10000, "未知错误"),
    PARAMETER_VALIDATION_ERROR(10001, "参数不合法"),
    LOGIN_ERROR(10002, "登录异常"),
    TEL_NOT_BE_NULL(10003,"手机号不能为空"),
    ONLY_ACCEPT_APPLICATION_HEADER(10004,"只接受application/json"),
    DATARESOURCE_CONNECT_FAILURE(10005,"数据源错误"),
    WRONG_TOKEN(10006,"token错误"),
    OPERATION_ILLEGAL(10007, "操作不合法"),

    // 20000 开头为用户信息相关错误定义
    USER_NOT_EXIST(20001, "用户不存在"),
    USER_LOGIN_FAIL(20002, "用户手机号或密码不正确"),
    USER_ALREAY_EXIST(20003, "用户已经注册"),

    // 30000 开头为验证码相关错误
    SMS_BLANK(30001, "验证码为空"),
    SMS_ISNULL(30002, "验证码不存在"),
    SMS_ALREADY_SEND(30003, "验证码已发送"),
    SMS_ILLEGAL(30004, "验证码不匹配"),

    // 40000 开头为邮件相关错误
    EMAIL_FROM_EMPTY(40001, "发件人为空"),
    EMAIL_TO_EMPTY(40002, "收件人为空"),
    EMAIL_TITLE_EMPTY(40003, "邮件标题为空"),
    EMAIL_TEMPLATE_NOT_EXIST(40004, "HTML邮件不存在"),
    EMAIL_SEND_FAILURE(40005, "发送失败"),
    EMAIL_ALREADY_SEND(40006, "邮件已发送"),

    // 90000 开头为用户认证相关错误
    SERVICE_REQUIRE_AUTHENTICATION(90001,"访问的服务需要身份认证"),
    SERVICE_REQUIRE_ROLE_ADMIN(90002,"访问服务需要管理员权限"),

    FEHEAD_CA_CERTIFICATE_ILLEGL(90003,"证书不合法"),
    FEHEAD_CA_CERTIFICATE_GENERATOR_FAIL(90004,"证书生成失败"),

    SERVICE_AUTHENTICATION_ILLEGAL(90005,"用户认证凭据不合法"),
    SERVICE_AUTHENTICATION_INVALID(90006,"用户认证凭据无效");

    private EmBusinessError(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;



    @Override
    public int getErrorCode() {
        return errCode;
    }

    @Override
    public String getErrorMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }

}
