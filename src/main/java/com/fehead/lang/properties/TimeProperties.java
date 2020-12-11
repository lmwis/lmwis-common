package com.fehead.lang.properties;

import lombok.Data;

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
 * @modify lmwis 2020/12/11 16.34
 */
@Data
public class TimeProperties {

    private int smsExpiredTime = 30*60;

    private int smsResendTime = 60;

    private int emailExpiredTime = 30*60;

    private int emailResendTime = 60;

    private int smsKeyExpiredTime = 6*60*60;

}
