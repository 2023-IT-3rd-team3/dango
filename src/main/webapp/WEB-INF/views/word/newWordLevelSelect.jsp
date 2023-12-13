<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>새 단어 배우기</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/word/newWordLevelSelect.css">
</head>
<body>
    <header>
        <div>
            <div>
                <a id="logo" href="">
                    <img src="" alt="">
                    たんご🍡
                </a>
                <nav>
                    <a href=/dango/word/new>새 단어</a>
                    <a href="">오답노트</a>
                    <a href="">단어장</a>
                    <a href="">사전</a>
                    <a href="">커뮤니티</a>
                </nav>
            </div>
            <a id="login" href="">로그인 / 회원가입</a>
        </div>
    </header>
    <section>
        <div id="level-select">
            <a href="/dango/word/new/1">JLPT N1</a>
            <a href="/dango/word/new/2">JLPT N2</a>
            <a href="/dango/word/new/3">JLPT N3</a>
            <a href="/dango/word/new/4">JLPT N4</a>
            <a href="/dango/word/new/5">JLPT N5</a>
        </div>
        <p id="level-select-text">난이도를 골라주세요!</p>
    </section>
</body>
</html>