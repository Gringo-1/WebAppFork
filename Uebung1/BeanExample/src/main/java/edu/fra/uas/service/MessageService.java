package edu.fra.uas.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private static final Logger log =LoggerFactory.getLogger(MessageService.class);
  
    private String message;
    private Integer counter = 0;

    public String getMessage() {  
        log.info("getMessage - returns a message:", message);
     return message;
    }  
    
    public void setMessage(String message) {  
        log.info("setMessage - sets a message to:", message);
     this.message = message;  
    } 
    
    public Integer getCounter() {
        return counter;
    }

public void increment() {
   counter ++;

}


}


