<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>modify</title>
</head>
<body>
<form name="lib" method="post">
    <div><input type="hidden" name="lbno" value="${lib.lbno}"></div>
    <div><span>도서관타입: </span><input type="text" name="lbtype" value="${lib.lbtype}"/></div>
    <div><span>운영종료일: </span><input type="text" name="clsday" value="${lib.clsday}"/></div>
    <div><span>주소: </span><input type="text" name="addr" value="${lib.addr}"/></div>
    <div><span>연락처: </span><input type="text" name="phone" value="${lib.phone}"/></div>
    <div><span>홈페이지: </span><input type="text" name="homepage" value="${lib.homepage}"/></div>
    <div><span>위도: </span><input type="text" name="lat" value="${lib.lat}"/></div>
    <div><span>경도: </span><input type="text" name="lon" value="${lib.lon}"/></div>
    <div>
        <button type="submit">수정하기</button>
    </div>
</form>
</body>
</html>
