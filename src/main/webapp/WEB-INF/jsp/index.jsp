<%@ page contentType="text/html; charset=EUC-KR" %>
<!DOCTYPE html>
<html>
<head>
<title> Happy WOrld </title>
</head>
<script>
	$(document).ready(function() {

		$("button").click(function(){
			$(location).attr('href', 'http://localhost:8080/save?data='+$("textarea").val());
	    });
	});
</script>
<body>
hello<br> 

<a href="/admin">admin move</a><br>

</body>
</html>