package org.ps.spring.controller;

import org.ps.spring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController
{
  public StudentAdmissionController() {}
  @ModelAttribute
  public void addCommonObjects(Model model){
	  model.addAttribute("pageHeader", "Birla Institute of Technology");
  }
  
  @RequestMapping({"/admissionForm"})
  public ModelAndView showAdmissionForm()
  {
    ModelAndView model = new ModelAndView("showAdmissionForm");
    return model;
  }
  
  /*@RequestMapping(value={"/submitStudentAdmissionForm"}, method={RequestMethod.POST})
  public ModelAndView submitAdmissionForm(@RequestParam(value="studentName", defaultValue="Mr X") String name, @RequestParam("studentId") String id) {
    ModelAndView model = new ModelAndView("displaystudentAdmissionDetails");
    model.addObject("name", name);
    model.addObject("id", id);
    return model;
  }*/
  
  @RequestMapping(value={"/submitStudentAdmissionForm"}, method={RequestMethod.POST})
  public ModelAndView submitAdmissionForm(@ModelAttribute ("student1") Student student) {
    ModelAndView model = new ModelAndView("displaystudentAdmissionDetails");
    /*model.addObject("name", student.getStudentName());
    model.addObject("id", student.getStudentId());*/
    return model;
  }
}
