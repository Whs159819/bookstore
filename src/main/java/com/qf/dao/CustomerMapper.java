package com.qf.dao;

import com.qf.entity.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerMapper {

    public Customer customerLogin(@Param("NAME") String NAME, @Param("pwd") String pwd);

    public List<Customer> findAllCustomer( );

    public int delCustomerById(Integer id);

    public int addCustomer(Customer customer);
}
