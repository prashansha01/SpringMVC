package org.ps.spring.controller;

import java.util.Date;

import javax.validation.Valid;

import org.ps.spring.common.ExpandableCustomDateEditor;
import org.ps.spring.common.StudentNameEditor;
import org.ps.spring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	/*@Autowired
	private Validator validator;

	public void setValidator(Validator validator) {
		this.validator = validator;
	}
*/
	public StudentAdmissionController() {
	}

	@ModelAttribute
	public void addCommonObjects(Model model) {
		model.addAttribute("pageHeader", "Birla Institute of Technology");
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields("studentMobile");
		/*
		 * DateFormat printFormat = new SimpleDateFormat("dd-MMM-yyyy");
		 * DateFormat format1 = new SimpleDateFormat("dd-MM-yyyy"); DateFormat
		 * format2 = new SimpleDateFormat("dd-MMM-yyyy"); CustomDateEditor
		 * dateEditor = new CustomDateEditor(format1, false);
		 */
		ExpandableCustomDateEditor dateEditor = new ExpandableCustomDateEditor();
		binder.registerCustomEditor(Date.class, dateEditor);
		binder.registerCustomEditor(String.class, "studentName",
				new StudentNameEditor());

	}

	@RequestMapping({ "/admissionForm" })
	public ModelAndView showAdmissionForm() throws Exception{
		
		String exception = "NULL_POINTER";
		if(exception.equals("NULL_POINTER")){
			throw new NullPointerException();
		}
		ModelAndView model = new ModelAndView("showAdmissionForm");
		return model;
	}

	/*
	 * @RequestMapping(value={"/submitStudentAdmissionForm"},
	 * method={RequestMethod.POST}) public ModelAndView
	 * submitAdmissionForm(@RequestParam(value="studentName",
	 * defaultValue="Mr X") String name, @RequestParam("studentId") String id) {
	 * ModelAndView model = new ModelAndView("displaystudentAdmissionDetails");
	 * model.addObject("name", name); model.addObject("id", id); return model; }
	 */

	@RequestMapping(value = { "/submitStudentAdmissionForm" }, method = { RequestMethod.POST })
	public ModelAndView submitAdmissionForm(
			@Valid @ModelAttribute("student1") Student student, BindingResult result) {
		//validator.validate(student, result);
		//validator.validate(student.getStudentAddress(), result);
		if (result.hasErrors()) {
			ModelAndView model = new ModelAndView("showAdmissionForm");
			return model;
		}

		ModelAndView model = new ModelAndView("displaystudentAdmissionDetails");
		/*
		 * model.addObject("name", student.getStudentName());
		 * model.addObject("id", student.getStudentId());
		 */
		return model;
	}
	
}
