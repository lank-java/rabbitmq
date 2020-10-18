package com.lank.rabbit.exception;

/**
 * @author lank
 * @since 2020/10/18 15:52
 */
public class MessageException extends Exception{

    public MessageException() {
        super();
    }

    public MessageException(String message) {
        super(message);
    }

    public MessageException(String message, Throwable cause) {
        super(message, cause);
    }

    public MessageException(Throwable cause) {
        super(cause);
    }


}
