<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<form action="uploadData"  method="post" enctype="multipart/form-data">
		
		<p>
			First Name: <input type="text" name="fname" /><br />
		</p>
		
		<p>
			Last Name: <input type="text" name="lname" /><br />
		</p>
		<p>
			Email : <input type="text" name="email" /><br />
		</p>
		<p>
			Password : <input type="text" name="pass" /><br />
		</p>
		
		<p>
		<input type="file" name="photo" />
		</p>
		
		<p>
		<input type="submit" name="submit" value="submit" />
		</p>
		
	</form>


</body>
</html>