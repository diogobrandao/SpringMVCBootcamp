<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 29/01/2018
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="//http://fonts.googleapis.com/css?family=Roboto:400" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="resources/style2.css">
    <title>Login Form</title>
    <link rel="stylesheet" href="stylesheet">
</head>
<input type="button" value="Users" onclick="window.location='users';"/>
<body>

<%--<button class="button" value = "Users" onclick="window.location = 'users';"/>--%>

<h2 class="listof">Bootcamp List</h2>

<table class="table table-hover">
    <thead class="thead-dark">
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Location</th>

    </tr>
    </thead>
    <tbody>
    <ul>
        <c:forEach var="bootcamp" items="${bootcampList}">
            <tr>
                <td>${bootcamp.id}</td>
                <td>${bootcamp.location}</td>
            </tr>
        </c:forEach>
    </ul>
    </tbody>
</table>
</body>
</html>