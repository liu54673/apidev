package com.apidev.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by D.Yang on 2017/4/14 0014.
 */
@Controller
@SpringBootApplication
public class HelloController {
    private Logger logger = Logger.getLogger(HelloController.class);

    /**
     * 测试Hello
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){
        model.addAttribute("name","zhangsan");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
