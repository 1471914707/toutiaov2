package com.lin.controller;

import com.lin.model.HostHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    final static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    HostHolder hostHolder;

    @RequestMapping(value = {"/","/index","/login"})
    @ResponseBody
    public String loging(){
        logger.info(hostHolder.getUsers().getSessionId());
        return "ssss";
    }
}
