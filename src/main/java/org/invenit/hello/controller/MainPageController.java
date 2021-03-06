package org.invenit.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Vycheslav Mischeryakov (vmischeryakov@gmail.com)
 */
@Controller
@RequestMapping("/")
public class MainPageController extends ExceptionHandlerController {

    @GetMapping
    public ModelAndView getMainPage() {
        return new ModelAndView("index.html");
    }

}
