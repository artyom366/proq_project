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

    <sf:form method="POST" action="${pageContext.request.contextPath}/register" modelAttribute="trialAccount">
        <div class="form-group" >
            <label for="name">Name</label>
            <sf:input type="text" class="form-control" id="name" path="userName" placeholder="Name" required=""/>
            <span class="label label-warning"><sf:errors path="userName"/></span>
        </div>
        <div class="form-group" >
            <label for="business-name">Business name</label>
            <sf:input type="text" class="form-control" id="business-name" path="businessName" placeholder="Business name" />
            <span class="label label-warning"><sf:errors path="businessName" cssClass="has-error" /></span>
        </div>
        <div class="form-group" >
            <label for="email">Email address</label>
            <sf:input type="email" class="form-control" id="email" path="email" placeholder="Email" />
           <span class="label label-warning"><sf:errors path="email" cssClass="has-error" /></span>
        </div>
        <div class="form-group">
            <label for="phone">Phone</label>
            <sf:input type="text" class="form-control" id="phone" path="phone" placeholder="Phone" />
            <span class="label label-warning"><sf:errors path="phone" cssClass="has-error" /></span>
        </div>
        <div class="form-group">
            <label for="phone">Web site</label>
            <sf:input type="text" class="form-control" id="web-site" path="webSite" placeholder="WEb site" />
            <span class="label label-warning"><sf:errors path="webSite" cssClass="has-error" /></span>
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <sf:input type="password" class="form-control" id="password" path="password" placeholder="Password" />
            <span class="label label-warning"><sf:errors path="password" cssClass="has-error" /></span>
        </div>
        <div class="form-group">
            <label for="repeat-password">Repeat Password</label>
            <span class="label label-warning"><input type="password" class="form-control" id="repeat-password" placeholder="Password"></span>
        </div>
        <div class="form-group">
            <label for="country">Country</label>
            <sf:select class="form-control" id="country" path="country">
                <option>Latvia</option>
                <option>Lithuania</option>
                <option>Estonia</option>
            </sf:select>
            <span class="label label-warning"><sf:errors path="country" cssClass="has-error" /></span>
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
