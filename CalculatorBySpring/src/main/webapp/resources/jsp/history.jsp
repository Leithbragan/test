<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>История</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<a href="/calculator" class="btn btn-primary"><i class="glyphicon glyphicon-home"></i></a>
<a href="/calculator/play" class="btn btn-success"><i class="glyphicon glyphicon-th"></i></a> <br>

<h1>Список операций</h1>

<core:forEach var="operation" items="${operation}">
    ${operation.nameOperation} <br>
    ${operation.arg_1} ${operation.symbol} ${operation.arg_2} = ${operation.total}<br>
    <hr>
</core:forEach>


</body>
</html>