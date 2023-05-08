package com.onlineexam.exception;


import com.onlineexam.util.restful.ResponseCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 业务异常
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OeServiceException extends RuntimeException {

    private ResponseCode responseCode;

    public OeServiceException(ResponseCode responseCode, String message) {
        super(message);
        setResponseCode(responseCode);
    }

}
