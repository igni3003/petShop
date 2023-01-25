<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/signupPage.css">
    <title>Modify Information</title>
</head>
<body>
    <div class="loginbox">
    <h2>회원 정보 수정</h2>
    <form action="/update" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />

        <p>
            성함<br>
            <input type="text" name="name" value="${user.name}"/>
        </p>
        <p>
            아이디<br>
            <input type="text" name="id" value="${user.id}"/>
        </p>
        <p>
            이메일<br>
            <input type="text" name="email" value="${user.email}"/>
        </p>
        <p>
            비밀번호<br>
            <input type="password" name="password" placeholder="비밀번호를 입력해주세요"/>
        </p>
        <p>
            주소<br>
            <input type="text" name="address" value="${user.address}"/>
        </p>
        <p>
            휴대폰 번호<br>
            <input type="text" name="phone" value="${user.phone}"/>
        </p>
        <p>
            생년월일<br>
            <input type="date"
            	    name="birth" placeholder="yyyy-MM-dd" value='<fmt:formatDate value="${user.birth}" pattern="yyyy-MM-dd" />'>
        </p>

        <button type="submit">저장하기</button>
    </form>
    </div>
</body>
</html>