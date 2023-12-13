<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 단어 배우기</title>
<link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/word/newWord.css?ab">
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
                <a href="/dango/word/new">새 단어</a>
                <a href="/dango/word/wrong">오답노트</a>
                <a href="/dango/word/note">단어장</a>
                <a href="/dango/dictionary">사전</a>
                <a href="/dango/community">커뮤니티</a>
            </nav>
        </div>
        <a id="login" href="/dango/login">로그인 / 회원가입</a>
    </div>
</header>
<section>
    <div id="intro">
        <div id="intro-text-area">
            <h1>새 단어 배우기</h1>
            <p>새로운 단어 20개가 나와요! 같이 공부해봐요!</p>
        </div>
    </div>
    <c:forEach var="sentence" items="${sentenceList}">
    	<article>
            <div class="right-img">
                <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" class="bi bi-check-lg" viewBox="0 0 16 16">
                    <path d="M12.736 3.97a.733.733 0 0 1 1.047 0c.286.289.29.756.01 1.05L7.88 12.01a.733.733 0 0 1-1.065.02L3.217 8.384a.757.757 0 0 1 0-1.06.733.733 0 0 1 1.047 0l3.052 3.093 5.4-6.425a.247.247 0 0 1 .02-.022"/>
                </svg>
            </div>
            <div class="wrong-img">
                <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" class="bi bi-x-lg" viewBox="0 0 16 16">
                    <path d="M2.146 2.854a.5.5 0 1 1 .708-.708L8 7.293l5.146-5.147a.5.5 0 0 1 .708.708L8.707 8l5.147 5.146a.5.5 0 0 1-.708.708L8 8.707l-5.146 5.147a.5.5 0 0 1-.708-.708L7.293 8z"/>
                </svg>
            </div>
	        <div class="korean">
		        <c:if test="${not empty sentence.exFrontKr}">
		        	<p class="front-sentence-kr">${sentence.exFrontKr}</p>
		        </c:if>
	            <h2 class="word-kr">${sentence.wordMean}</h2>
	            <c:if test="${not empty sentence.exBackKr}">
	            	<p class="back-sentence-kr">${sentence.exBackKr}</p>
	            </c:if>
	        </div>
	        <div class="japanese">
	        	<c:if test="${not empty sentence.exFrontJp}">
	            	<p class="front-sentence-jp">${sentence.exFrontJp}</p>
	            </c:if>
	            <input class="word-jp" type="text">
	            <input class="answer" type="hidden" value="${sentence.wordWord}">
	            <input class="answer2" type="hidden" value="${sentence.wordFurigana}">
	            <c:if test="${not empty sentence.exBackJp}">	            
	            	<p class="back-jp">${sentence.exBackJp}</p>
	            </c:if>
	        </div>
	        <div class="btn-group">
	            <button class="ok-btn">확인</button>
	        </div>
	    </article>
    </c:forEach>
</section>
<script src="${pageContext.request.contextPath}/resources/static/js/jquery.min.js"></script>

<!-- <script src="${pageContext.request.contextPath}/resources/static/js/word/newWord.js"></script> -->
<script>
const okBtn = $(".ok-btn");
const wordJp = $(".word-jp");
const answer = $(".answer");
const answer2 = $(".answer2");
const article = $("article");
const rightImg = $(".right-img");
const wrongImg = $(".wrong-img");

for(let i = 0; i < okBtn.length; i++) {
    okBtn[i].addEventListener("click", () =>{
        // const data = {
        //     userId: userId,
        //     wordId: answer[i].value
        // };
        if(wordJp[i].value !== answer[i].value && wordJp[i].value !== answer2[i].value) {
            // addWrong(data);
            article[i].classList.add("vibration");
            wrongImg[i].style.visibility = "visible";
            article[i].style.border = "1px solid red";
            setTimeout(function() {
                article[i].classList.remove("vibration");
            }, 500);
        } else {
        	rightImg[i].style.visibility = "visible";
            article[i].style.border = "1px solid green"
        }
        okBtn[i].style.visibility = "hidden";
        // addEndWord(data);
    })
}

</script>
</body>
</html>