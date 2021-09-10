package com.udacity.jdnd.course1;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageListService {
    private List<String> messages;


    public void addMessage(String message){
        this.messages.add(message);
    }
    @PostConstruct
    public  void postConstruct(){
        this.messages = new ArrayList<>();

    }
    public List<String> getMessage(){
       return new ArrayList<>(this.messages);
    }
}
