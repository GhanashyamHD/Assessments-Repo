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
		  var nm = document.f1.bookName.value;
		  var gen = document.f1.genre.value;
	       if(nm == "" &&  gen == "" ){
				document.getElementById("bookNameLocation").innerHTML =alert("Please enter all the fields");
				document.getElementById("bookNameLocation").innerHTML ="Please enter all the fields";
			    status= false;
						}
			else
				document.getElementById("bookNameLocation").innerHTML ="Correct";
				status = true;
				
					}
	</script>	
		





<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align = "center">
<div class = "center1">
<form name ="f1" action ="update" onsubmit = "return validate()">
         Name:<input type = "text" name = "bookName"><br><span id="bookNamelocation" style="color: red"></span>
	     Genre:<input type = "text" name = "genre"><br><span id="bookGenrelocation" style="color: red"></span>
	     <input type = "submit" value ="Update" >
	     
</form>
</div>
</body>
</html>