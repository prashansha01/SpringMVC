<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <h2>${pageHeader}</h2> --!>

<!-- <h2>Enter Student information here</h2> -->
<a href = "/first-spring/admissionForm?siteLanguage=en">English</a>
<a href = "/first-spring/admissionForm?siteLanguage=fr">French</a>
<form:errors path="student1.*"/>
<form action = "/first-spring/submitStudentAdmissionForm" method="post">

<table>
<tr><td><spring:message code = "showAdmissonForm.studentname"/></td><td><input type = "text" name = "studentName"></td><tr>
<tr><td>Id: </td><td><input type = "text" name = "studentId"></td> </tr>
<tr><td>DOB: </td><td><input type = "text" name = "studentDob"></td> </tr>
<tr><td>Mobile: </td><td><input type = "text" name = "studentMobile"></td> </tr>
<tr>
			<td>Student's Skills set :</td><td>    <select name="studentSkills" multiple>
													<option value="Java Core">Java Core</option>
													<option value="Spring Core">Spring Core</option>
													<option value="Spring MVC">Spring MVC</option>
													</select><td>
		</tr>
		
<tr><td>Address: </td></tr>
<tr>

<td>City: </td><td><input type = "text" name = "studentAddress.city"></td>
<td>Pin code: </td><td><input type = "text" name = "studentAddress.pinCode"></td>
</tr>
<tr><td><input type = "submit" value = "Submit"></td></tr>

</table>
</form>
</body>
</html>