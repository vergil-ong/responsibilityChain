package com.github.ong.controller;

import com.github.ong.ResponsibilityChain.support.RequestContext;
import com.github.ong.ResponsibilityChain.support.ResponseContext;
import com.github.ong.ResponsibilityChain.support.ResponsibilityChain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    ResponsibilityChain responsibilityChain;

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test4(){
        RequestContext request = new RequestContext();
        ResponseContext response = new ResponseContext();
        responsibilityChain.process(request,response);
        System.out.println(response.isSuccess());
        System.out.println(response.getResponseBody());
        return "test1";
    }
}
