<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${studentheader}</title>
</head>
<body>
<table>
<tr><td>${student.name}</td></tr>
<tr><td>${student.password}</td></tr>
<tr><td>${student.gender}</td></tr>
<tr><td>${student.mobileNo}</td></tr>
<tr><td>${student.dob}</td></tr>
<tr><td>${student.language}</td></tr>
<tr><td>${student.skillSet}</td></tr>
<tr><td>${student.address.country}</td></tr>
<tr><td>${student.address.city}</td></tr>
<tr><td>${student.address.street}</td></tr>
<tr><td>${student.address.pinCode}</td></tr>
</table>
</body>
</html>