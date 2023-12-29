<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>だんご </title>
<link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
<link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/search.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/dictionary/dictionaryFont.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/dictionary/dictionaryList.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/word/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/word/checkWord.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />

<section>
    <div class="checkRecentMain">
        <div id="dictionary_area">
            <div class="announ_box">
            	<div class="title">
                <h2 class="title_name">체크</h2>
                <a class="title_more" href="/dango/check/getCheckList">더보기</a>
            </div>
            <c:forEach var="word" items="${checkList}" end="10">
                <div class="word">
                    <a href="/dango/dictionary/{word.wordId}">N${word.wordLevel}&nbsp;${word.wordWord}</a>
                    <p class="kanji">&nbsp;&nbsp;${word.wordFurigana}</p>
                </div>
                <p class="mean">${word.wordMean}</p>
            </c:foreach>
        </div>
        <div id="dictionary_area">
            <div class="announ_box">
            	<div class="title">
                <h2 class="title_name">최근 본 단어</h2>
                <a class="title_more" href="/dango/recent/getRecentList">더보기</a>
            </div>
            <c:forEach var="word" items="${recentList}" end="10">
                <div class="word">
                    <a href="/dango/dictionary/{word.wordId}">N${word.wordLevel}&nbsp;${word.wordWord}</a>
                    <p class="kanji">&nbsp;&nbsp;${word.wordFurigana}</p>
                </div>
                <p class="mean">${word.wordMean}</p>
            </c:foreach>
        </div>
    </div>
</section>
<jsp:include page="../common/footer.jsp" />
</body>
</html>