package org.ps.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController
{
  public StudentAdmissionController() {}
  
  @RequestMapping({"/admissionForm"})
  public ModelAndView showAdmissionForm()
  {
    ModelAndView model = new ModelAndView("showAdmissionForm");
    return model;
  }
  
  @RequestMapping(value={"/submitStudentAdmissionForm"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
  public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="Mr X") String name, @RequestParam("studentId") String id) {
    ModelAndView model = new ModelAndView("displaystudentAdmissionDetails");
    model.addObject("name", name);
    model.addObject("id", id);
    return model;
  }
}
