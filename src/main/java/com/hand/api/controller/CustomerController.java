package com.hand.api.controller;

import com.github.pagehelper.PageHelper;
import com.hand.api.service.CustomerService;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Customer;
import com.hand.domain.entity.Film;
import com.hand.domain.entity.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /*
    登陆检查的控制器
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String login(String name, String password){
        Boolean res = customerService.login(name,password);
        if (res){
            return "login success!";
        }else{
            return "login failed!";
        }
    }

    /*
    新增用户
     */
    @RequestMapping(value = "/insert")
    @ResponseBody
    public String insert(Customer c){
        int id = customerService.insert(c);
        System.out.println("customer:"+c);
        System.out.println("id:"+id);
        return String.valueOf(id);
    }

    /*
    更新用户
     */
    @RequestMapping(value = "/update")
    @ResponseBody
    public Customer update(Customer c){
        int id = customerService.update(c);
        return c;
    }

}
