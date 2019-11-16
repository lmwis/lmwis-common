package com.fehead.lang.config;

/**
 * 写代码 敲快乐
 * だからよ...止まるんじゃねぇぞ
 * ▏n
 * █▏　､⺍
 * █▏ ⺰ʷʷｨ
 * █◣▄██◣
 * ◥██████▋
 * 　◥████ █▎
 * 　　███▉ █▎
 * 　◢████◣⌠ₘ℩
 * 　　██◥█◣\≫
 * 　　██　◥█◣
 * 　　█▉　　█▊
 * 　　█▊　　█▊
 * 　　█▊　　█▋
 * 　　 █▏　　█▙
 * 　　 █
 *
 * @author Nightnessss 2019/8/27 9:50
 */
public class TimeProperties {

    private int smsExpiredTime = 30*60;

    private int smsResendTime = 60;

    private int emailExpiredTime = 30*60;

    private int emailResendTime = 60;

    private int smsKeyExpiredTime = 6*60*60;

    public int getSmsExpiredTime() {
        return smsExpiredTime;
    }

    public void setSmsExpiredTime(int smsExpiredTime) {
        this.smsExpiredTime = smsExpiredTime;
    }

    public int getEmailExpiredTime() {
        return emailExpiredTime;
    }

    public int getSmsResendTime() {
        return smsResendTime;
    }

    public void setSmsResendTime(int smsResendTime) {
        this.smsResendTime = smsResendTime;
    }

    public void setEmailExpiredTime(int emailExpiredTime) {
        this.emailExpiredTime = emailExpiredTime;
    }

    public int getEmailResendTime() {
        return emailResendTime;
    }

    public void setEmailResendTime(int emailResendTime) {
        this.emailResendTime = emailResendTime;
    }

    public int getSmsKeyExpiredTime() {
        return smsKeyExpiredTime;
    }

    public void setSmsKeyExpiredTime(int smsKeyExpiredTime) {
        this.smsKeyExpiredTime = smsKeyExpiredTime;
    }
}
