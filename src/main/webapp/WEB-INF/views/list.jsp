<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
<table border="1" cellpadding="10px" cellspacing="0">
    <tr><th>도서관번호</th><th>도서관명</th><th>시도</th><th>구군</th><th>운영종료일</th><th>연락처</th></tr>
    <c:forEach items="${libs}" var="lib">
        <tr><td><a href="/view?lbno=${lib.lbno}">${lib.lbno}</a></td><td>${lib.lbname}</td><td>${lib.sido}</td><td>${lib.gugun}</td><td>${lib.clsday}</td><td>${lib.phone}</td></tr>
    </c:forEach>

</table>
</body>
</html>
