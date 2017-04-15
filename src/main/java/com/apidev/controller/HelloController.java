package com.apidev.controller;

import com.apidev.model.SysUser;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

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
        SysUser user = new SysUser();
        user.setId(1);
        user.setUname("张三");
        user.setUpwd("123456+");
        user.setEmail("1543467@qq.com");
        user.setAge(18);


        //添加单个对象
        model.addAttribute("user",user);

        List<SysUser> userList = new ArrayList<SysUser>();
        for (int i = 10;i < 20; i ++){
            SysUser users = new SysUser();
            users.setId(i);
            users.setUname("张 " + i);
            users.setUpwd(UUID.randomUUID().toString().substring(0,10));

            Random r = new Random();
            int age = r.nextInt(100);
            users.setAge(age);

            users.setEmail(r.nextLong() + "@qq.com");
            userList.add(users);
        }
        //添加一个集合
        model.addAttribute("userList",userList);

        for (SysUser sysUser:userList) {
            System.out.println(sysUser.toString());
        }
        return "index";
    }

    /**
     * 启动容器
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
