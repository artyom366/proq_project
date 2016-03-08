<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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

    <title>Proq</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/stat/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/stat/css/custom.css" rel="stylesheet">
</head>

<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
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
                <li><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><c:out value="${username} "/><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Profile</a></li>
                        <li><a href="#">Organization</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Logout</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"><c:out value="${defaultorganization} "/><span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <c:forEach items="${allorganizations}" var="organization">
                            <li><a href="#">${organization.name}</a></li>
                        </c:forEach>
                    </ul>
                </li>

                <li><a href="?lang=en">EN</a></li>
                <li><a href="?lang=lv">LV</a></li>
                <li><a href="?lang=ru">RU</a></li>
            </ul>

        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="jumbotron">
    <div class="container">
    </div>
</div>

<div class="container-fluid">
    <div class="row">
            <div class="col-sm-3 col-md-2">
                <div class="panel-group" id="accordion">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"><span class="glyphicon glyphicon-th-list">
                            </span> Documents</a>
                            </h4>
                        </div>
                        <div id="collapseOne" class="panel-collapse collapse in">
                            <div class="panel-body">
                                <table class="table">
                                    <tr>
                                        <td>
                                            <a href="#">Filter</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                           <a href="#">Archive</a>
                                        </td>
                                    </tr>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-file text-info"></span><a href="#">Newsletters</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-comment text-success"></span><a href="#">Comments</a>--%>
                                            <%--<span class="badge">42</span>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo"><span class="glyphicon glyphicon-file">
                            </span> New Document</a>
                            </h4>
                        </div>
                        <div id="collapseTwo" class="panel-collapse collapse">
                            <div class="panel-body">
                                <table class="table">
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<a href="http://www.jquery2dotnet.com">Orders</a> <span class="label label-success">$ 320</span>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <tr>
                                        <td>
                                           <a href="#">Order</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Invoice</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Desadv</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Recadv</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Retann</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Ordrsp</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Invrpt</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                           <a href="#">Invrpt</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Hanmov</a>
                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseThree"><span class="glyphicon glyphicon-book">
                            </span> Catalogs</a>
                            </h4>
                        </div>
                        <div id="collapseThree" class="panel-collapse collapse">
                            <div class="panel-body">
                                <table class="table">
                                    <tr>
                                        <td>
                                            <a href="#">Products</a>
                                        </td>
                                    </tr>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<a href="#">Notifications</a> <span class="label label-info">5</span>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <tr>
                                        <td>
                                            <a href="#">Locations</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Create catalog</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Create catalog</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Create sync</a>
                                        </td>
                                    </tr>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-trash text-danger"></span><a href="#" class="text-danger">--%>
                                            <%--Delete Account</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseFour"><span class="glyphicon glyphicon-equalizer">
                            </span> Partners</a>
                            </h4>
                        </div>
                        <div id="collapseFour" class="panel-collapse collapse">
                            <div class="panel-body">
                                <table class="table">
                                    <tr>
                                        <td>
                                            <a href="#">Partner filter</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Invite partner</a>
                                        </td>
                                    </tr>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-tasks"></span><a href="">Products</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-shopping-cart"></span><a href="">Shopping Cart</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseFive"><span class="glyphicon glyphicon-user">
                            </span> Users</a>
                            </h4>
                        </div>
                        <div id="collapseFive" class="panel-collapse collapse">
                            <div class="panel-body">
                                <table class="table">
                                    <tr>
                                        <td>
                                            <a href="#">Users filter</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Create user</a>
                                        </td>
                                    </tr>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-tasks"></span><a href="">Products</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-shopping-cart"></span><a href="">Shopping Cart</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h4 class="panel-title">
                                <a data-toggle="collapse" data-parent="#accordion" href="#collapseSix"><span class="glyphicon glyphicon-save-file">
                            </span> Reports</a>
                            </h4>
                        </div>
                        <div id="collapseSix" class="panel-collapse collapse">
                            <div class="panel-body">
                                <table class="table">
                                    <tr>
                                        <td>
                                            <a href="#">Reports filter</a>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="#">Create report</a>
                                        </td>
                                    </tr>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-tasks"></span><a href="">Products</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                    <%--<tr>--%>
                                        <%--<td>--%>
                                            <%--<span class="glyphicon glyphicon-shopping-cart"></span><a href="">Shopping Cart</a>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-sm-9  col-md-10  main">
                <h1 class="page-header">Dashboard</h1>
            </div>

            <div class="col-sm-9 col-md-10 main">
                <div class="well">
                    <h1>
                        Accordion Menu With Icon</h1>
                    Admin Dashboard Accordion Menu
                </div>
            </div>

    </div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/stat/js/jquery-2.2.1.min.js"><\/script>')</script>
<script src="${pageContext.request.contextPath}/stat/js/bootstrap.min.js"></script>
</body>
</html>
