<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아이디찾기</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="../../resources/static/css/common/reset.css">
    <link rel="stylesheet" href="../../resources/static/css/user/login.css">
    <link rel="stylesheet" href="../../resources/static/css/user/find.css">
</head>
<body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
    var pw = "${pw}"; // controller에서 받아온 id 값

    if(pw != null && pw !== "") {
        $('#show').css('display', 'flex');
    }
});
</script>
    <section>
        <article>
            <div id="logo-text">
                <a id="logo" href="/user/">
                    だんご🍡
                </a>
                <p>아이디찾기</p>
            </div>
          <form action="/dango/findPW">
            <div class="input">
                <label for="id">아이디</label>
                <input id="id" name="id" type="text" placeholder="아이디">
            </div>
            <div class="input">
                <label for="password">전화번호</label>
                <input id="password" name="phone" type="text" placeholder="전화번호">
            </div>
            <div id="btn-group">
                <button id="login-btn" class="btn_open">아이디찾기</button>
            </div>
            <div id="show" class="IdBox" style="display:none;">
            	<p class="findIdPw">찾은 비밀번호 : <c:out value="${pw}"/></p>
            </div>
          </form>
        </article>
    </section>
</body>