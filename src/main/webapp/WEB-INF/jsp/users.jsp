<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 29/01/2018
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="//http://fonts.googleapis.com/css?family=Roboto:400" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="resources/style1.css">
    <title>Login Form</title>
    <link rel="stylesheet" href="stylesheet">
</head>

<input type="button" value="Bootcamps" onclick="window.location='main';"/>






<body>

<form:form method="post" action="users/add" modelAttribute="userInfo">
    <p><form:input path="username" placeholder="Name" value="${editUser.username}"/><form:errors   path="username" cssClass="error"/></p>

    <p><form:input path="email" placeholder="Email" value="${editUser.email}"/><form:errors   path="email" cssClass="error"/><p>

    <p><form:password path="password" placeholder="Password" value="${editUser.password}"/><form:errors  path="password" cssClass="error"/></p>

    <div class ="btn group">
        <input type="submit" name="add">
        <input type="reset" value="Reset">

    </div>
</form:form>




<%--<button class="button" value = "Bootcamps" onclick="window.location = 'main';"/>--%>

<h2 class="listof">User List</h2>

<table class="table table-hover">
    <thead class="thead-dark">
    <tr>
        <th scope="col">username</th>
        <th scope="col">email</th>

    </tr>
    </thead>
    <tbody>
    <ul>
        <c:forEach var="user" items="${users}">
            <tr>
                <td>${user.username}</td>

               <td>${user.email}</td>

                <td><a href="users/edit/${user.username}"><input class="button" type="submit" value="Edit"/></a></td>
                <td><a href="users/remove/${user.username}"><input class="button" type="submit" value="Remove"/></a></td>

            </tr>

        </c:forEach>
    </ul>
    </tbody>
</table>



</body>
</html>