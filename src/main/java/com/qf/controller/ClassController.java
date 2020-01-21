package com.qf.controller;

import com.qf.dao.ClassMapper;
import com.qf.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassMapper classMapper;

    @RequestMapping("/findAllClass")
    public String findAllClass(Model model){
        List<Class> classList = classMapper.findAllClass();
        model.addAttribute("classList",classList);
        return "behind/class_list";
    }

    @RequestMapping("/del")
    public String delClassById(Model model,Integer id){
        int i = classMapper.delClassById(id);
        if(i==1){
            return "redirect:/class/findAllClass";
        }
        return null;
    }

    @RequestMapping("/toaddclass")
    public String toadd(Model model){
        Class aClass = new Class();
        model.addAttribute("aClass",aClass);
        return "behind/add_class";
    }

    @RequestMapping("/toupdate")
    public String addCustomer(Model model,Integer id){
        Class aClass = classMapper.selClassById(id);
        model.addAttribute("aClass",aClass);
        if(aClass!=null){
            return "behind/add_class";
        }
        return null;
    }

    @RequestMapping("/updateOrAdd")
    public String updateOrAdd(Model model,Class aClass){
        Integer id = aClass.getId();
        if(id!=null){
            classMapper.updateClassById(aClass);
        }else{
            classMapper.addClass(aClass);
        }
        return "redirect:/class/findAllClass";
    }

}
