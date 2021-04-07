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
  background: rgba(60, 179, 113, 0.3);
}
div1 {
  background: blue;
  transition: 0.2s;
}
div:hover {
  animation: change-color 0.2s forwards;
}

@keyframes change-color {
  to {
    background:rgba(255, 218, 185, 0.4) ;
  }
}


</style>
<body align ="center">
<div class = "center1" align ="center">
<div class = "div1">
<h1 align = "center">House of Books</h1>
</div>
<h4 align = "center">A Bibliophile's heaven</h4>
<div style color = "Black">
<a href ="add.jsp" style="color:Eggplant purple;">Add Books</a><br>
<a href ="getall.jsp">View Books</a><br>
</div>
</div>
</body>
</html>
