package fz.fxq.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("login")
public class LoginMVCController {

    @GetMapping("login1")
    public String loginJSP() {
        return "login";
    }

    @GetMapping("login2")
    public ModelAndView login2() {
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("name", "abc");
        return mav;
    }
}
