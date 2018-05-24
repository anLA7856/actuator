/**
 * FileName: IndexController
 * Author:   luoa
 * dATE:     2018/5/24 18:07
 */
package com.gzuni.actuator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")//对类的匹配
@Transactional
public class IndexController {
    @RequestMapping(value="/", method = RequestMethod.GET)//对方法的匹配
    public String index(Model model){
        return "index";
    }
}
