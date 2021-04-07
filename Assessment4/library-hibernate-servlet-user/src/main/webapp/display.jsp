<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page isELIgnored = "false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body align ="center">
<div class ="center1">
<table align ="center">	
  <th>BookId </th><th>BookName </th><th>Author</th><th>Genre</th><th>Volume</th><th>Update</th><th>Delete</th>
	<c:forEach var="book" items="${flist}">
	<tr>
		<td>${book.getBookId()}</td>
		<td> ${book.getBookName()}</td>
		<td> ${book.getAuthor()}</td>
		<td> ${book.getBookGenre()}</td>
		<td> ${book.getVolume()}</td>
		<td><a href ="update.jsp">Update</a></td>
		<td><a href = "delete.jsp">Delete</a></td>
	</tr>
		
	</c:forEach>
	
</table>
</div>

</body>
</html>