package ua.kh.multiservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by volkswagen1 on 29.01.2017.
 */
@Controller
public class LoginLogOutController {
    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("msg","Hello1");
        return modelAndView;
    }
    @RequestMapping(value = "/login_invalid")
    public ModelAndView loginInvalid(){
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("msg","Hello 2");
        return modelAndView;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpServletRequest request){
        request.getSession().invalidate();
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}