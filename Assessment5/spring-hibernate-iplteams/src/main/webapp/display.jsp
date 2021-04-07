<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-image: url('ipl1.jpg');
	background-attachment: fixed;
	background-position: center;
	min-height: 100%;
	min-width: 100%;
	background-size: 100% 100%;
	background-repeat: no-repeat;
	overflow-y: hidden;
	overflow-x: hidden;
}

.center1 {
	align: center;
	box-shadow: 7px 7px 5px grey;
	border-radius: 15px;
	margin-top: 10%;
	margin-left: 25%;
	margin-right: 40%;
	width: 50%;
	length: 50%;
	border: 3px solid green;
	padding: 20px;
	background: rgba(60, 179, 113, 0.85);
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body id=display.ghd>

	<div class="center1">
		<table style="text-align: center">
			<tr>
				<th>TeamId</th>
				<th>TeamName</th>
				<th>HomeGround</th>
				<th>Captain</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="team" items="${teamsList}">
				<tr>
					<td>${team.getTeamId()}</td>
					<td>${team.getTeamName()}</td>
					<td>${team.getHomeGround()}</td>
					<td>${team.getCaptain()}</td>
					<td><a href="update.jsp">Update</a></td>
					<td><a href="delete.jsp">Delete</a></td>
				</tr>

			</c:forEach>
		</table>
	</div>

</body>
</html>