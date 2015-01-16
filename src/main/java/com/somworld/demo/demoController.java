package com.somworld.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by somesh.shrivastava on 15/01/15.
 */
@Controller
@RequestMapping("/a")
public class demoController {
    @RequestMapping(method = GET)
    public String helloWorld(ModelMap modelMap) {
        String message = "Hello World, Spring 3.0!";
        return "home";
    }
}
