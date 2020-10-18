package com.lank.rabbit.api;

import com.lank.rabbit.exception.MessageRuntimeException;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author lank
 * @since 2020/10/18 15:39
 * message建造者模式
 */
public class MessageBuilder {

    private String messageId;
    private String topic;
    private String routingKey;
    private Map<String,Object> attributes = new HashMap<>();
    private Integer delayMills;
    private String messageType = MessageType.CONFIRM;

    private MessageBuilder(){}

    public static MessageBuilder create(){
        return new MessageBuilder();
    }

    public MessageBuilder withMessageId(String messageId){
        this.messageId = messageId;
        return this;
    }

    public MessageBuilder withTopic(String topic){
        this.topic = topic;
        return this;
    }

    public MessageBuilder withAttributes(Map<String,Object> attributes){
        this.attributes = attributes;
        return this;
    }

    public MessageBuilder withDelayMills(Integer delayMills){
        this.delayMills = delayMills;
        return this;
    }

    public MessageBuilder withMessageType(String messageType){
        this.messageType = messageType;
        return this;
    }

    public Message build(){
        if (messageId == null){
            messageId = UUID.randomUUID().toString();
        }

        if (topic == null){
            throw new MessageRuntimeException("topic 不能为空");
        }
        return new Message(messageId,topic,routingKey,attributes,delayMills,messageType);
    }

}
