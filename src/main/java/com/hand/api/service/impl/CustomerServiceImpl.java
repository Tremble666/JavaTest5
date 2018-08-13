package com.hand.api.service.impl;

import com.hand.api.service.CustomerService;
import com.hand.api.service.FilmService;
import com.hand.domain.entity.Customer;
import com.hand.domain.entity.Film;
import com.hand.infra.mapper.CustomerMapper;
import com.hand.infra.mapper.FilmMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper mapper;

    //判断用户是否能登陆
    @Override
    public Boolean login(String name, String password) {
        Customer c = new Customer();
        c.setFirst_name(name);
        c.setLast_name(password);
        List<Customer> cus = mapper.select(c);
        System.out.println(cus);
        System.out.println(cus.size());
        if (cus.size() > 0){
            return true;
        }
        return false;
    }

    //新增用户
    public int insert(Customer c) {
        mapper.insert(c);
        return c.getCustomer_id();
    }

    //更新用户
    public int update(Customer c) {
        mapper.updateByPrimaryKey(c);
        return c.getCustomer_id();
    }

    //删除用户
    public void delete(int id) {
        Customer c= new Customer();
        c.setCustomer_id((short)id);
        mapper.delete(c);
    }
}
