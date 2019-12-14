<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${studentheader}</title>
</head>
<body>
<table>
<form:form action="/student/poststudentadmission" modelAttribute="student">
<tr><td><form:errors path="*"></form:errors></td></tr>
<tr>
<td><form:label path="name">Student's Name :</form:label><form:input path="name"/></td>
</tr>
<tr>
<td><form:label path="password">Student's password :</form:label><form:password path="password"/></td>
</tr>
<tr>
<td><form:label path="gender">Student's Gender :</form:label>
<form:label path="gender">Male</form:label><form:radiobutton path="gender" value="male"/>
<form:label path="gender">Female</form:label><form:radiobutton path="gender" value="female"/>
</td>
</tr>
<tr>
<td><form:label path="gender">Student's Language :</form:label>
<form:radiobuttons path="language" items="${languages}"/>
</td>
</tr>
<tr>
<td><form:label path="mobileNo">Student's Mobile :</form:label><form:input type="text" path="mobileNo"/></td>
</tr>
<tr>
<td><form:label path="dob">Student's DOB :</form:label><form:input type="date" path="dob"/></td>
</tr>
<tr>
<td><form:label path="mobileNo">Student's SkillSet :</form:label></td>
<td>
<form:select path="skillSet">
<form:options items="${skillSet}"/>
</form:select>
</td>
</tr>
<tr>
<td><form:label path="address">Student's Address :</form:label></td>
</tr>
<tr>
<td>
<form:label path="address.country">country :</form:label>
<form:input path="address.country"/>
<form:label path="address.city">city :</form:label>
<form:input path="address.city"/>
<form:label path="address.street">Street :</form:label>
<form:input path="address.street"/>
<form:label path="address.pinCode">pincode :</form:label>
<form:input path="address.pinCode"/>
</td>
</tr>
<tr><td>&nbsp;</td></tr>
<tr align="center">
<td>
<form:button value="submit">submit</form:button>
</td>
</tr>
</form:form>
</table>
</body>
</html>