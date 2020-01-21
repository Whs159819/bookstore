package com.qf.controller;

import com.qf.dao.CustomerMapper;
import com.qf.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/customer")
@CrossOrigin(origins = "*")//解决跨域请求
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @RequestMapping("/login")
    public String login(String NAME, String pwd, Model model, HttpSession session){
        Customer customer = customerMapper.customerLogin(NAME, pwd);
        session.setAttribute("customer",customer);
        if(customer!=null ){
            model.addAttribute("customer",customer);
            return "redirect:/customer/findAll";
        }else{
            return "false";
        }
    }

    @RequestMapping("/tologin")
    public String tologin(){
        return "before/login";
    }

    @RequestMapping("/findAll")
    public String findAllCustomer(Model model){
        List<Customer> customerList = customerMapper.findAllCustomer();
        model.addAttribute("customerList",customerList);
        return "behind/customer_list";
    }

    @RequestMapping("/del")
    public String delCustomerById(Model model,Integer id){
        int i = customerMapper.delCustomerById(id);
        if(i==1){
            return "redirect:/customer/findAll";
        }
     return null;
    }

    @RequestMapping("/toaddcustomer")
    public String toadd(Model model){

        return "before/add_customer";
    }

    @RequestMapping("/add")
    public String addCustomer(Model model,String NAME,String pwd,String phone,String email,String address){
        Customer customer = new Customer(NAME, pwd, phone, email, address);
        int i = customerMapper.addCustomer(customer);
        if(i==1){
            return "redirect:/customer/tologin";
        }
        return null;
    }

}
