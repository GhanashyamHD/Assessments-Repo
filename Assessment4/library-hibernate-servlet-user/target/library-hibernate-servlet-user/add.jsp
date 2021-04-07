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
			var name = document.f1.bookName.value
			var auth = document.f1.author.value
			var gen = document.f1.genre.value
			var vol = document.f1.volume.value
			if(name == "" && auth == "" && gen == "" ){
				document.getElementById("bookIdLocation").innerHTML =alert("Please enter all the fields");
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
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
<body align ="center">
<div class = "center1">
	<form name ="f1" action = "add" onsubmit="return validate()">
	 <div class="container">
                <div class="row">
                    <div class="col-sm-1" style="margin-left: 100px;">
                       <label for= "bookId" >BookID</label>
                    </div>
                    <div class="col-sm-1" style="margin-left: 100px;">
                        <input type="text" name="bookId" placeholder="BookId"><span id="bookIdlocation" style="color: red"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-1" style="margin-left: 100px;">
                        <label for="bookName" >BookName</label>
                    </div>
                    <div class="col-sm-1" style="margin-left: 100px;">
                        <input type ="text" name="bookName" placeholder="BookName"><span id="bookNamelocation" style="color: red"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-1" style="margin-left: 100px;">
                    <label for="author">Author</label>
                    </div>
                    <div class="col-sm-1" style="margin-left: 100px;">
                    <input type="text" name="author" placeholder="AuthorName"><span id="authorlocation" style="color: red"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-1" style="margin-left: 100px;">
                        <label for = "genre">Genre</label>
                    </div>
                    <div class="col-sm-1" style="margin-left: 100px;">
                        <input type="text" name="genre" placeholder="Genre"><span id="genrelocation" style="color: red"></span>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-1" style="margin-left: 100px;">
                        <label for="volume">Volume</label>
                    </div>
                    <div class="col-sm-1 " style="margin-left: 100px;">
                        <input type="text" name="volume" placeholder="Volume"><span id="volumelocation" style="color: red"></span>
                    </div>
                </div>
                
                <div class="row" style="margin-left: 200px;">
                    <input type="submit" value="ADD" placeholder="ADD">
                </div>
	
	<!-- BookId:<input type = "text" name = "bookId"><br>
	BookName:<input type = "text" name = "bookName"><br>
	Author:<input type = "text" name = "author"><br>
	Genre:<input type = "text" name = "genre"><br>
	Volume:<input type ="text" name = "volume"><br>
		<input type ="submit" value = "Add"> -->
	</form>
</div>

</body>
</html>