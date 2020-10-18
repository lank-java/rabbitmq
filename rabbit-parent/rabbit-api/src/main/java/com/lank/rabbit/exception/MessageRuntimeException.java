package com.lank.rabbit.exception;

/**
 * @author lank
 * @since 2020/10/18 15:53
 */
public class MessageRuntimeException extends RuntimeException{

    public MessageRuntimeException() {
        super();
    }

    public MessageRuntimeException(String message) {
        super(message);
    }

    public MessageRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageRuntimeException(Throwable cause) {
        super(cause);
    }
}
