<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register">
		<input type="text" name="name" placeholder="Enter Your Name"><br>
		<input type="tel" name="phone" placeholder="Enter Your Phone"><br>
		<input type="email" name="email" placeholder="Enter Your Email Id"><br>
		<input type="number" name="age" placeholder="Enter Your Age"><br>
		Gender:Male<input type="radio" name="gender" value="Male">
		Female<input type="radio" name="gender" value="Female"><br>
		<input type="password" name="password" placeholder="Enter Your Password"><br> 
		<input type="submit" value="Register">
	</form>
</body>
</html>