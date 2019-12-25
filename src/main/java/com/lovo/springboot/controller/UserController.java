package com.lovo.springboot.controller;

import com.lovo.springboot.entity.UserEntity;
import com.lovo.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private  UserEntity userBean;
    @RequestMapping("testInfo")
    @ResponseBody
    public String testInfo(){
      return   userBean.getUserName();

    }
    @RequestMapping("getListUser")
    @ResponseBody
    public List<UserEntity> getListUser(){
        return userService.findAll();
    }

    @RequestMapping("addUser")
    public ModelAndView addUser(UserEntity user){
       //ModelAndView mv=new ModelAndView("user");
       ModelAndView mv=new ModelAndView();
        userService.savaUser(user);

        mv.addObject("user",user);
        //重定向到查询controller
        RedirectView rv=new RedirectView();
        rv.setUrl("findListUser");
        mv.setView(rv);
       return  mv;
    }

    @RequestMapping("findListUser")
    public ModelAndView findListUser(){
        ModelAndView mv=new ModelAndView("userList");
        mv.addObject("userList",userService.findAll());
        return mv;
    }

   @RequestMapping("gotoUserPage")
    public  ModelAndView gotoUserPage(){
       ModelAndView mv=new ModelAndView("user");
       UserEntity user=new UserEntity();
       mv.addObject("user",user);
        return mv;
    }

}
