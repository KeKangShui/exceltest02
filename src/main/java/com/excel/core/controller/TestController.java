package com.excel.core.controller;

import com.excel.core.bean.User;
import com.excel.core.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ASUS on 2018/4/15.
 */
@Controller("index")
public class TestController {
    @Autowired
    private UserService service;
   /* @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        return "hello world";
    }*/

    @RequestMapping("/test.do")
    public String test(User user, ModelMap map) {
//        this.user =user;
//        若不将属性加入map 当中，就等于没有设置属性值

        map.addAttribute("user_name", user.getUser_name());
        System.out.println(user.getUser_name());
        System.out.println(user.getSex());
        map.addAttribute("sex", user.getSex());
        service.addUser(user);
        JSONObject ob =JSONObject.fromObject(user);
//        service.addUser(ob);
        System.out.println(ob);
        return "test";
    }

}
