package com.lank.rabbit.api;

/**
 * @author lank
 * @since 2020/10/18 22:44
 *
 */
public interface MessageConsumer {

    /**
     * 消费者监听消息
     * @param message 消息
     */
    void onMessage(Message message);
}
