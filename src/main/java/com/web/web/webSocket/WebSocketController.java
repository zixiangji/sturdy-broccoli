package com.web.web.webSocket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate template;


    @RequestMapping(value = "/sendUserInfo", method = RequestMethod.GET)
    public String getImage() {
        System.out.println("后台广播推送！");
        User user = new User();
        user.setName("jzx");
        user.setPassword("11111");
        this.template.convertAndSend("/topic/getResponse", user);
        return "111111";
    }
}
