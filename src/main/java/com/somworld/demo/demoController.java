package com.somworld.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by somesh.shrivastava on 15/01/15.
 */
@Controller
public class demoController {
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {

        String message = "Hello World, Spring 3.0!";
        return new ModelAndView("hello.jsp", "message", message);
    }
}
