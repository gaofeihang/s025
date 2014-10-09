package org.s025.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaofeihang
 * @since Sep 30, 2014
 *
 */
@Controller
public class IndexController {
    
    @RequestMapping("/")
    public String handle(HttpServletRequest request, ModelMap model) {
        return "forward:/index";
    }
    
    @RequestMapping("/index")
    public void hello(HttpServletRequest request, ModelMap model, String name) {
        if (name == null) {
            name = "World";
        }
        
        model.put("name", name);
        model.put("date", new Date());
    }

}
