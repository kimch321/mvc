<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>view</title>
</head>
<body>
  <h1>도서관 상세 페이지</h1>
  <ul>
    <li>도서관번호: ${lib.lbno} </li>
    <li>도서관명: ${lib.lbname}</li>
    <li>시도: ${lib.sido}</li>
    <li>구군: ${lib.gugun}</li>
    <li>도서관타입: ${lib.lbtype}</li>
    <li>운영종료일: ${lib.clsday}</li>
    <li>주소: ${lib.addr}</li>
    <li>연락처: ${lib.phone}</li>
    <li>홈페이지: ${lib.homepage}</li>
    <li>위도: ${lib.lat}</li>
    <li>경도: ${lib.lon}</li>
    <li>등록일: ${lib.regdate}</li>
  </ul>
  <div><a href="/modify?lbno=${lib.lbno}">수정 하기</a></div>
  <div><a href="/remove?lbno=${lib.lbno}">삭제 하기</a></div>
</body>
</html>
