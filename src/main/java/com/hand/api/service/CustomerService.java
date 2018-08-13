package com.hand.api.service;

import com.hand.domain.entity.Customer;
import com.hand.domain.entity.Film;

import java.util.List;

public interface CustomerService {
    //判断是否能够登陆成功
    Boolean login(String name,String password);

    //插入一个用户
    int insert(Customer c);

    //更新一个用户
    int update(Customer c);

    //删除一个用户
    void delete(int id);

}
