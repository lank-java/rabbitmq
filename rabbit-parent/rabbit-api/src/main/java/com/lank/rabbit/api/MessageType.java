package com.lank.rabbit.api;

/**
 * @author lank
 * @since 2020/10/18 15:31
 * 消息类型
 */
public final class MessageType {

    /**
     * 迅速消息：不考虑保障消息的可靠性，也不做confirm确认
     */
    public final static String RAPID = "0";

    /**
     * 确认消息：不保证可靠性投递，会做消息的确认
     */
    public final static String CONFIRM = "1";

    /**
     * 可靠性消息：保障消息的100%投递，不允许有消息的丢失
     */
    public final static String RELIANT = "2";

}
