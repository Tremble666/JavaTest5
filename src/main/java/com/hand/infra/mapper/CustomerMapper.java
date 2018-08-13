package com.hand.infra.mapper;

import com.hand.domain.entity.Customer;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface CustomerMapper extends Mapper<Customer> {
}