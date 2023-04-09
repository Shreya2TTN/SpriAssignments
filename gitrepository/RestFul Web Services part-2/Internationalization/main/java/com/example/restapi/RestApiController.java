package com.example.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class RestApiController {
    @Autowired
    private MessageSource messageSource;
    public RestApiController(MessageSource messageSource){
        this.messageSource=messageSource;
    }
    @GetMapping("/hello")
    public String hello(){
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("hello.message",null,null,locale);
    }
}
