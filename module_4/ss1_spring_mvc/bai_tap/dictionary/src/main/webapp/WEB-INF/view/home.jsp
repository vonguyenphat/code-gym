<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Từ điển đơn giản</h1>
<form action="/test" method="post">
    <lable>ENG</lable>
    <input type="text" value="${eng}" name="eng">
    <lable>VN</lable>
    <input type="text" value="${vn}" name="">
    <button type="submit">tra</button>
</form>
</body>
</html>
