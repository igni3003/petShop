<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/signupPage.css">
    <title>Sign Up</title>
</head>
<body>
    <div class="loginbox">
    <h2>회원가입</h2>
    <form action="/signup" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <fieldset>
                  <legend>회원가입 구역</legend>
                  <label for="아이디">아이디</label>
                  <div><input type="text" id="id" name="id" placeholder="아이디를 입력해 주세요"></div>
                  <label for="비밀번호">비밀번호</label>
                  <div><input type="password" id="password" name="password" placeholder="비밀번호를 입력해 주세요"></div>
                  <label for="이름">이름</label>
                  <div><input type="text" id="name" name="name" placeholder="이름을 입력해 주세요"></div>
                  <label for="이메일">이메일</label>
                  <div><input type="text" id="email" name="email" placeholder="이메일을 입력해 주세요"></div>
                  <label for="주소">주소</label>
                  <div><input type="text" id="address" name="address" placeholder="주소를 입력해 주세요"></div>
                  <label for="휴대폰번호">휴대폰 번호</label>
                  <div><input type="text" id="phone" name="phone" placeholder="휴대폰번호를 입력해 주세요"></div>
                  <label for="생년월일">생년월일</label>
                  <div><input type="date" id="birth" name="birth" placeholder="생년월일을 입력해 주세요"></div>
                  <label for="추천인">추천인</label>
                  <div><input type="text" id="recommend" name="recommend" placeholder="추천인ID를 입력해 주세요"></div>

                  <button type="submit">회원가입</button>
                </fieldset>
              </form>
            </div>
</body>
</html>