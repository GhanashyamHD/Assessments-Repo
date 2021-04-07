<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
 body{
  background-image: url('books1.jfif');
   background-attachment: fixed;
  background-position: center;
}
.center1 {
  align : center;
   margin-left: auto;
  margin-right: auto;
  width: 50%;
  border: 3px solid green;
  padding: 20px;
  background: rgba(255, 218, 185, 0.4);
}

</style>
<script type="text/javascript">
      function validate(){
	       var id = document.f1.bookId.value;
	       if(id <= 0 ){
				document.getElementById("bookIdLocation").innerHTML =alert("Please enter ");
				document.getElementById("bookIdLocation").innerHTML ="Please enter all the fields";
			    status= false;
						}
			else
				document.getElementById("bookIdLocation").innerHTML ="Correct";
				status = true;
				
					}
      </script>



<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align ="center">
<div class = "center1">
<h3>Enter Id to be Deleted</h3>
<form  name = "f1" action = "delete" onsubmit = "return validate()">
 Id:<input type = "text" name = "bookId">
 <input type ="submit" value = "Delete"><span id="bookIdlocation" style="color: red"></span>
 </form>
 </div>
</body>
</html>