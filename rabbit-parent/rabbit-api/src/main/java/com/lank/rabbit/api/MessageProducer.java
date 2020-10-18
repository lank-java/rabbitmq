package com.lank.rabbit.api;

import java.util.List;

/**
 * @author lank
 * @since 2020/10/18 22:36
 *
 */
public interface MessageProducer {

    /**
     * 发送消息
     * @param message message
     */
    void send(Message message);

    /**
     * 消息发送带回调
     * @param message message
     * @param sendCallback 回调
     */
    void send(Message message,SendCallback sendCallback);

    /**
     * 批量消息
     * @param messageList 消息集合
     */
    void send(List<Message> messageList);
}
