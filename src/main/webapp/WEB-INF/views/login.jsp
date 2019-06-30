<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>Trang chủ</title>
    <jsp:include page="common/masterPage.jsp"/>
    <link type="text/css" href="${pageContext.request.contextPath}/resources/css/source/index.css" rel="stylesheet"/>
</head>

<body class="body-fixed">
    <form action="${pageContext.request.contextPath}/loginProcess" method="post">
        <div class="container">
            <div class="row">
                <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
                    <div class="card card-signin my-5">
                        <div class="card-body">
                            <h5 class="card-title text-center">Sign In</h5>
                            <form class="form-signin">
                                <div class="form-label-group">
                                    <input name="username" id="username" class="form-control input-box" placeholder="Username" required autofocus autocomplete="off"/>
                                    <label for="username">Username</label>
                                </div>

                                <div class="form-label-group">
                                    <input type="password" name="password" id="password" class="form-control input-box" placeholder="Password" required autocomplete="off"/>
                                    <label for="password">Password</label>
                                </div>

                                <div class="custom-control custom-checkbox mb-3">
                                    <input type="checkbox" class="custom-control-input" id="customCheck1">
                                    <label class="custom-control-label" for="customCheck1">Remember password</label>
                                </div>
                                <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">Sign in</button>
                                <hr class="my-4">
                                <button class="btn btn-lg btn-google btn-block text-uppercase" type="submit"><i class="fab fa-google mr-2"></i> Sign in with Google</button>
                                <button class="btn btn-lg btn-facebook btn-block text-uppercase" type="submit"><i class="fab fa-facebook-f mr-2"></i> Sign in with Facebook</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>

<%--<img src="${pageContext.request.contextPath}/images/banner.png" style="width: 100%; border-bottom: 1px solid #0055a7;">
<div class="container-fluid">
    <div class="row">
        <div class="col-xs-12 col-sm-4 col-md-4 col-sm-offset-4 col-md-offset-4" style="margin-top: 100px">
            <form action="${pageContext.request.contextPath}/login" method="post">
                <fieldset>
                    <div class="form-group">
                        <div class="input-group" style="width:100%;">
                            <div class="input-group-addon input-icon">
                                <i class="fa fa-user" aria-hidden="true"></i>
                            </div>
                            <input name="username" id="username" class="form-control input-box" placeholder="Username" required="" autofocus=""/>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="input-group" style="width:100%;">
                            <div class="input-group-addon input-icon">
                                <i class="fa fa-unlock-alt" aria-hidden="true"></i>
                            </div>
                            <input type="password" name="password" id="password" class="form-control input-box" placeholder="Password" required=""/>
                        </div>
                    </div>

                    <c:if test="${not empty error}">
                        <div class="form-group">
                            <div class="d-inline-block bg-danger">${error}</div>
                        </div>
                    </c:if>

                    <div class="form-group col-sm-6 col-md-5 col-sm-offset-6 col-md-offset-7">
                        <button type="submit" class="form-control btn btn-primary">Login</button>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>--%>
</body>
</html>