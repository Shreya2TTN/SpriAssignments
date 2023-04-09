package com.example.restapi.GreetingWithUsername;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
@RestController
public class GreetingController {
    @Autowired
    private MessageSource messageSource;

    public GreetingController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    @GetMapping("/greeting")
    public String greeting(@RequestParam ("username") String username){
        Locale locale= LocaleContextHolder.getLocale();
        String message=messageSource.getMessage("greeting.message",new Object[]{username},locale);
        return message;
    }
}
