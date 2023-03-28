<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>chuyendoi</title>
</head>
<body>
<form action="/test" method="post">

    USD  <input type="text"  name="a" required><br>

    VN   <input type="text" value="${result}" name="" id="">
    <input type="submit" value="ok">
</form>
</body>
</html>
