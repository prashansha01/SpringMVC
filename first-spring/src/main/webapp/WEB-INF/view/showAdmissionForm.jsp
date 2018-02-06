<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>${pageHeader}</h2>
<form action = "/first-spring/submitStudentAdmissionForm" method="post">
<h2>Enter Student information here</h2>
<table>
<tr><td>Name: </td><td><input type = "text" name = "studentName"></td><tr>
<tr><td>Id: </td><td><input type = "text" name = "studentId"></td> </tr>
<tr><td>DOB: </td><td><input type = "text" name = "studentDob"></td> </tr>
<tr><td>Mobile: </td><td><input type = "text" name = "studentMobile"></td> </tr>
<tr><td>Skill Set: </td><td>
<select name = "studentSkills" multiple="multiple"">
<option value = "Java Core">Java Core</option>
<option value = "Spring Core">Spring Core</option>
<option value = "Spring MVC">Spring MVC</option>
</select>
</td> </tr>

<tr><td><input type = "submit" value = "Submit"></td></tr>

</table>
</form>
</body>
</html>