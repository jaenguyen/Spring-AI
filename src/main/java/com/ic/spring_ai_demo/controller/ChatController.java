package com.ic.spring_ai_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ic.spring_ai_demo.dto.ChatRequest;
import com.ic.spring_ai_demo.service.ChatService;

@RestController
public class ChatController {

    @Autowired
    ChatService chatService;
    
    @PostMapping("/chat")
    String chat(@RequestBody ChatRequest request) {
        
        return chatService.chat(request);
    }
}
