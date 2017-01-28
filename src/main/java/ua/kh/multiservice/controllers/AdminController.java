package ua.kh.multiservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by volkswagen1 on 29.01.2017.
 */
@Controller
public class AdminController {
    @RequestMapping(value = "/admin-page", method = RequestMethod.GET)
    public ModelAndView getLostPassword(HttpServletRequest request) {

        return new ModelAndView("admin-page");


    }
}
