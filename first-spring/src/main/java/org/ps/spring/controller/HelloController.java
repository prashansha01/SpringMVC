package org.ps.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping({"/greet"})
public class HelloController
{
  public HelloController() {}
  
  @RequestMapping({"/welcome"})
  protected ModelAndView printHelloMessage() {
    ModelAndView modelandView = new ModelAndView("Hello");
    modelandView.addObject("welcomeMessage", "welcome User, Welcome");
    return modelandView;
  }
  
  @RequestMapping({"/hi"})
  protected ModelAndView printHiMessage() {
    ModelAndView modelandView = new ModelAndView("Hello");
    modelandView.addObject("welcomeMessage", "Hi User, Welcome");
    return modelandView;
  }
}
