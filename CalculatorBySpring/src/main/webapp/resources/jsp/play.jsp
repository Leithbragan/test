<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Action</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" media="screen">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .ir {
            width: 60%;
            height: 300px;
            margin-top: 10px;
            margin-left: 20%;
            border-radius: 2%;
            border: solid 25px bisque;
            background: blanchedalmond;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>

<a href="/calculator" class="btn btn-primary"><i class="glyphicon glyphicon-home"></i></a>
<%--<a href="/calculator/history" class="btn btn-info"><i class="glyphicon glyphicon-align-justify"></i></a>--%>
<div class="ir text-center">
    <h1>Калькулятор</h1>
    <sf:form action="/calculator/play_operation" method="post" modelAttribute="operation">

        <div class="form-group">
            <sf:label path="arg_1">Аргумент 1 </sf:label>
            <sf:input path="arg_1"/> <br>
            <sf:errors path="arg_1" cssClass="error"/> <br>
            <sf:label path="arg_2">Аргумент 2 </sf:label> <sf:input path="arg_2"/> <br>
            <sf:errors path="arg_2" cssClass="error"/><br>
            <sf:button class="btn btn-success" name="nameOperation" value="sum">&#43</sf:button>
            <sf:button class="btn btn-success" name="nameOperation" value="minus">&#8211</sf:button>
            <sf:button class="btn btn-success" name="nameOperation" value="multiplication">&#215</sf:button>
            <sf:button class="btn btn-success" name="nameOperation" value="division">&#247</sf:button>
            <a href="/calculator/play" class="btn btn-info">C</a>
        </div>
    </sf:form>

</div>
</body>
</html>