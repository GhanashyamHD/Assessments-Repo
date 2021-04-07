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
</style>
<script type="text/javascript">
		function validate(){
			var id = document.f1.teamId.value;
			var name = document.f1.teamName.value
			var ground = document.f1.homeGround.value
			var cap = document.f1.captain.value
			if(name == "" && ground == "" && cap == "" ){
				document.getElementById("teamIdLocation").innerHTML =alert("Please enter all the fields");
				document.getElementById("teamIdLocation").innerHTML ="Please enter all the fields";
			    status= false;
						}
			else{
			//	document.getElementById("teamIdLocation").innerHTML ="Correct";
				status = true;
			}
			return status;
			
			
		}	
		
 </script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<body align = "center">
<div class ="center1" align ="center">
<form action = "team.ghd" name ="f1" onclick="return validate()">
  <div class ="container">
   <div class = "row">
 <div class="col-sm-1" style="margin-left: 100px;">
     <label for= "teamId" >TeamID</label>
  </div>
 <div class="col-sm-1" style="margin-left: 100px;">
  <input type="text" name="teamId" placeholder="TeamId"><span id="teamIdlocation" style="color: red"></span>
  </div>
  </div>
   <div class = "row">
 <div class="col-sm-1" style="margin-left: 100px;">
     <label for= "teamName" >TeamName</label>
  </div>
 <div class="col-sm-1" style="margin-left: 100px;">
  <input type="text" name="teamName" placeholder="TeamName"><span id="teamNamelocation" style="color: red"></span>
  </div>
  </div>
   <div class = "row">
 <div class="col-sm-1" style="margin-left: 100px;">
     <label for= "homeGround" >HomeGround</label>
  </div>
 <div class="col-sm-1" style="margin-left: 100px;">
  <input type="text" name="homeGround" placeholder="HomeGround"><span id="homeGroundlocation" style="color: red"></span>
  </div>
  </div>
   <div class = "row">
 <div class="col-sm-1" style="margin-left: 100px;">
     <label for= "captain" >Captain</label>
  </div>
 <div class="col-sm-1" style="margin-left: 100px;">
  <input type="text" name="captain" placeholder="Captain"><span id="captain" style="color: red"></span>
  </div>
  </div>
   
     <div class="row" style="margin-left: 200px;">
       <input type="submit" value="Confirm" placeholder="Confirm">
      </div>
	
  
</form>
</div>

</body>
</html>