<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>
    <h2>${user.name}님의 회원 정보</h2>

    <p>성함 : ${user.name}</p>
    <p>아이디 : ${user.id}</p>
    <p>이메일 : ${user.email}</p>
    <p>비밀번호 : ${user.password}</p>
    <p>주소 : ${user.address}</p>
    <p>휴대폰 번호 : ${user.phone}</p>
    <p>생년월일 : <input type="date"
                        name="birth" placeholder="yyyy-MM-dd" value='<fmt:formatDate value="${user.birth}" pattern="yyyy-MM-dd" />'></p>
    <p>추천인 아이디 : ${user.recommend}</p>

    <button type="button" onclick="location.href='update'">수정하기</button>

    <form action="/logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <button type="submit">로그아웃</button>
    </form>

    <form action="/delete" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <button type="submit">탈퇴하기</button>
    </form>
</body>
</html>