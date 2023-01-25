<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/loginPage.css">
    <title>Login</title>
</head>
<body>
    <div class="loginbox">
      <h2>로그인</h2>
      <form action="/login" method="post">
      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <fieldset>
          <legend>로그인 구역</legend>
          <label for="아이디">아이디</label>
          <div><input type="text" id="id" name="id" placeholder="아이디를 입력해 주세요"></div>
          <label for="비밀번호">비밀번호</label>
          <div><input type="password" id="password" name="password" placeholder="비밀번호를 입력해 주세요"></div>
              <ul>
                <li><a href="#">아이디/비밀번호찾기</a></li>
                <li><a href="signup">회원가입</a></li>
              </ul>
          <!--데이터를 서버로 전송-->
          <button type="submit">로그인</button>
        </fieldset>
      </form>
    </div>
</body>
</html>