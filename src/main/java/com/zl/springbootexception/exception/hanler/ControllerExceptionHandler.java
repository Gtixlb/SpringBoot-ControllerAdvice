package com.zl.springbootexception.exception.hanler;

import com.zl.springbootexception.exception.CustomException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: zl
 * @date: 2019-02-16 14:10
 */
//@ControllerAdvice
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public Map<String,Object> handlerUserNotExistException(CustomException exception){
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",exception.getCode());
        map.put("message",exception.getMsg());
        return map;
    }
}
