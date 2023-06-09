package com.lunski.rabbitMQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private Sender sender;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send(String msg){
        sender.send(msg);
        return "消息：" + msg + ",已發送";
    }

}