<%@ page contentType="text/html; charset=EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<body>
<form action="/logout" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="logout">
	</form>
<a href="/">DENIED! MOVE ROOT</a><br>

</body>
</html>