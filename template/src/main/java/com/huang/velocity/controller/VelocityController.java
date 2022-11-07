package com.huang.velocity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time 2022-11-02 9:15
 * Created by Huang
 * className: VelocityController
 * Description:
 */
@Controller
@RequestMapping
public class VelocityController {

    @GetMapping("/velocity/index")
    public String index(ModelMap modelMap){
        modelMap.put("key1", "value1");
        modelMap.put("key2", "value2");
        return "index";
    }
}
