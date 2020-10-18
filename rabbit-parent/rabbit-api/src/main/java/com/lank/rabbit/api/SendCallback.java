package com.lank.rabbit.api;

/**
 * @author lank
 * @since 2020/10/18 22:38
 * 回调函数
 */
public interface SendCallback {

    /**
     * 消息发送成功回调方法
     */
    void onSuccess();

    /**
     * 消息发送失败回调方法
     */
    void onFailure();
}
