<%-- 
    Document   : index
    Created on : 11-09-2015, 09:08:17
    Author     : AlexanderSteen
--%>

<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <h1>Index</h1>
        <div>
            <form action="/Document" method="POST">
                <label>Password</label>
                <input name="password" type="password" />
                <input type="submit" value="Log Ind" />
            </form>
            <small>Password: admin</small>
        </div>
    </body>
</html>
