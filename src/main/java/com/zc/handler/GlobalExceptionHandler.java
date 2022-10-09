package com.zc.handler;

import com.zc.exception.BusinessException;
import com.zc.utils.APIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(BusinessException.class);

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public APIResponse businessException(Exception e){

        String msg = "请求错误";
        if (e instanceof BusinessException){
            msg = ((BusinessException) e).getErrorCode();
        }
        logger.error("find exception:e={}",e.getMessage());
        e.printStackTrace();
        return APIResponse.fail(msg);
    }
//
//    @ExceptionHandler(value = Exception.class)
//    public String exception(Exception e){
//        logger.error("find exception:e={}",e.getMessage());
//        e.printStackTrace();
//        return "error/400";
//    }

}
