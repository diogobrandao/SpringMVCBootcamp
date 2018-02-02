<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 29/01/2018
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="//http://fonts.googleapis.com/css?family=Roboto:400" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="resources/style.css">
    <title>Login Form</title>
    <link rel="stylesheet" href="stylesheet">

</head>
<body>

<form:form method="post" modelAttribute="user">
    <p><form:input path="username" placeholder="Name"/><form:errors  path="username" cssClass="error"/></p>

    <p><form:password path="password" placeholder="Password"/><form:errors  path="password" cssClass="error"/></p>
    <input type="submit" value="Login"/>
</form:form>
<div style="color:red">${error}</div>
</body>


</html>
