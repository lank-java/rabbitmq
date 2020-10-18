package com.lank.rabbit.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 消息对象封装
 * @author lank
 * @since 2020/10/18 15:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message implements Serializable {

    /**
     * 消息唯一id
     */
    private String messageId;

    /**
     * 消息的主题
     */
    private String topic;

    /**
     * 消息的路由规则
     */
    private String routingKey;

    /**
     * 消息的附加属性
     */
    private Map<String,Object> attributes = new HashMap<>();

    /**
     * 延迟消息的参数配置
     */
    private Integer delayMills;

    /**
     * 消息的类型：默认confirm消息
     */
    private String messageType = MessageType.CONFIRM;

}
