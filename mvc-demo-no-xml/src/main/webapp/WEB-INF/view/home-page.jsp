<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  User: Lex Yu
  Date: 2023/4/2
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Home Page</title>
</head>
<body>
<h1 align="center">This is Home Page</h1>

<form:form action="process-page" method="get" modelAttribute="defaultUser">
	<div align="center">
		<p>
			<label for="name">Your Name: </label>
			<form:input type="text" id="name" path="username"/>
		</p>
		
		<p>
			<label for="name2">Another Name: </label>
			<form:input type="text" id="name2" path="anothername"/>
		</p>
		
		<input type="submit" value="offer"/>
	</div>
</form:form>

</body>
</html>
