<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style >
body{
  background-image: url('ipl1.jpg');
   background-attachment: fixed;
  background-position: center;
  min-height : 100%;
  min-width : 100%;
  background-size:100% 100%;
  background-repeat:no-repeat;
  overflow-y: hidden;
  overflow-x: hidden;
}
.center1 {
  align : center;
   
  box-shadow: 7px 7px 5px grey;
	border-radius: 15px;
	margin-top: 10%;
	margin-left: 25%;
	margin-right: 40%;
  width: 50%;
  border: 3px solid green;
  padding: 20px;
  background: rgba(60, 179, 113, 0.85);
}
@keyframes ani {
  10%   {background-color: red;}
  20%  {background-color: yellow;}
  30%  {background-color: Dark Blue;}
  40% {background-color: #FF822A;}
  50% {background-color: purple;}
  60% {background-color: pink;}
  70% {background-color: #64517C;}
   80% {background-color: blue;}
  100% {background-color: red;}
  
}
.center{
	margin-top:1%;
	background-color:  peachpuff;
	box-shadow: 7px 7px 5px grey;
	border-radius: 15px;
	margin-left: 20%;
	margin-right: 20%;
	padding: 1rem;
	opacity:.6;
  animation-name: ani;
  animation-duration: 10s;
}
.form {
  position: absolute;
  top: 50%;
  left: 50%;
  background: #fff;
  width: 285px;
  margin: -140px 0 0 -182px;
  padding: 40px;
  box-shadow: 0 0 3px rgba(0, 0, 0, 0.3);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >

<body align ="center">
<div class ="center">
<h2 align ="center" >Keep Calm and Watch Vivo IPL !!!</h2>
</div>
<div class ="center1" align = "center">
<a href ="add.jsp" style="color:black;" align  = "center">Add Team</a><br>
<a href ="getall.jsp" style ="color: black;">Display Teams</a><br>

</div>
</body>
</html>