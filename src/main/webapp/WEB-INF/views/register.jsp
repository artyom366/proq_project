<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Artyom
  Date: 2/27/2016
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="${pageContext.request.contextPath}/stat/images/favicon.ico">

    <title>Starter Template for Bootstrap</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/stat/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">ProQ</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="?lang=en">EN</a></li>
                <li><a href="?lang=lv">LV</a></li>
                <li><a href="?lang=ru">RU</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<!-- Main jumbotron for a primary marketing message or call to action -->
<div class="jumbotron">
    <div class="container">
        <h2>Account registration</h2>
    </div>
</div>


<div class="container col-md-3 col-md-offset-4">

    <sf:form method="POST">
        <div class="form-group" >
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" placeholder="Name">
        </div>
        <div class="form-group" >
            <label for="business-name">Business name</label>
            <input type="text" class="form-control" id="business-name" placeholder="Business name">
        </div>
        <div class="form-group" >
            <label for="email">Email address</label>
            <input type="email" class="form-control" id="email" placeholder="Email">
        </div>
        <div class="form-group">
            <label for="phone">Phone</label>
            <input type="text" class="form-control" id="phone" placeholder="Phone">
        </div>
        <div class="form-group">
            <label for="phone">Web site</label>
            <input type="text" class="form-control" id="web-site" placeholder="WEb site">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" placeholder="Password">
        </div>
        <div class="form-group">
            <label for="repeat-password">Repeat Password</label>
            <input type="password" class="form-control" id="repeat-password" placeholder="Password">
        </div>
        <div class="form-group">
            <label for="country">Country</label>
            <select class="form-control" id="country">
                <option>Latvia</option>
                <option>Lithuania</option>
                <option>Estonia</option>
            </select>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </sf:form>
</div> <!-- /container -->



<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/stat/js/jquery-2.2.1.min.js"><\/script>')</script>
<script src="${pageContext.request.contextPath}/stat/js/bootstrap.min.js"></script>

</body>
</html>
