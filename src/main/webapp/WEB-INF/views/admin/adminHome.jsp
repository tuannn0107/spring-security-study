<%--
  Created by IntelliJ IDEA.
  User: TuanNN
  Date: 7/21/2019
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<head>
    <title>Admin Page</title>
    <jsp:include page="../common/masterPage.jsp"/>

    <style type="text/css">
        #titleId {
            color: red;
            font-size: 34px;
            margin: 36px 0px 15px 0px;
        }
        #messageId {
            font-size: 24px;
            margin: 15px 0px 15px 0px;
        }
        #welcomeMsgId {
            font-size: 20px;
            color: green;
        }
        #welcomeTextId {
            text-transform: capitalize;
        }
        #logoutLink {
            text-decoration: none;
            cursor: pointer;
        }
    </style>
</head>

<body class="body-fixed">
    <div id="welcomeMessage" align="center">
        <div id="titleId" class="">${welcomeTitle}</div>
        <div id="messageId" class="">${messageObj}</div>
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            <div id="welcomeMsgId">
                <span id="welcomeTextId">Welcome: ${pageContext.request.userPrincipal.name}</span> | <span id="logoutId"><a id="logoutLink" href="${pageContext.servletContext.contextPath}/logout">Logout</a></span>
            </div>
        </c:if>
    </div>
</body>
</html>
