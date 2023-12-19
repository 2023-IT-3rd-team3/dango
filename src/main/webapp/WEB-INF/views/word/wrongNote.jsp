<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>오답노트</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/word/wrongNote.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />
    <section>
        <div id="intro">
            <div id="intro-text-area">
                <h1>오답노트</h1>
                <p>틀린 단어들이 랜덤으로 나와요.... 같이 복습해봐요!</p>
            </div>
        </div>
        
        <c:forEach var="sentence" items="${sentenceList}">
        	<article>
            <div class="right-img">
                <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" class="bi bi-circle" viewBox="0 0 16 16">
                    <path d="M8 15A7 7 0 1 1 8 1a7 7 0 0 1 0 14zm0 1A8 8 0 1 0 8 0a8 8 0 0 0 0 16z"/>
                </svg>
            </div>
            <div class="wrong-img">
                <svg xmlns="http://www.w3.org/2000/svg" fill="currentColor" class="bi bi-check-lg" viewBox="0 0 16 16">
                    <path d="M12.736 3.97a.733.733 0 0 1 1.047 0c.286.289.29.756.01 1.05L7.88 12.01a.733.733 0 0 1-1.065.02L3.217 8.384a.757.757 0 0 1 0-1.06.733.733 0 0 1 1.047 0l3.052 3.093 5.4-6.425a.247.247 0 0 1 .02-.022"/>
                </svg>
            </div>
            <p class="correct-count">정답 횟수 : <span class="wrong-num">${sentence.wrongNum}</span></p>
            <button class="check-btn">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check" viewBox="0 0 16 16">
                    <path d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM2 2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H2z"/>
                    <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
                  </svg>
            </button>
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
	            <input class="word-id" type="hidden" value="${sentence.wordId}">
	            <input class="answer" type="hidden" value="${sentence.wordWord}">
	            <input class="answer2" type="hidden" value="${sentence.wordFurigana}">
                <input class="wrong-id" type="hidden" value="${sentence.wrongId}">
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
<script type="text/javascript">
    const userId = `${userId}`;
</script>
<script src="${pageContext.request.contextPath}/resources/static/js/word/wrongNote.js"></script>
<script>
const okBtn = $(".ok-btn");
const wordJp = $(".word-jp");
const answer = $(".answer");
const answer2 = $(".answer2");
const wordId = $(".word-id");
const article = $("article");
const rightImg = $(".right-img");
const wrongImg = $(".wrong-img");
const correctCount = $(".correct-count");
const wrongNum = $(".wrong-num");
const wrongId = $(".wrong-id");

for(let i = 0; i < okBtn.length; i++) {
    okBtn[i].addEventListener("click", () =>{
    	let count = Number(wrongNum[i].innerText);
        let data = {
            wrongId: wrongId[i].value,
            wrongNum: Number(wrongNum[i].innerText)
        };
        console.log(data)
        if(wordJp[i].value !== answer[i].value && wordJp[i].value !== answer2[i].value) {
            updateWrongNumZero(data, i);
            count = 0;
        } else {
            updateWrongNumPlusOne(data, i);
            count++;
        }
        okBtn[i].style.visibility = "hidden";
        if(count >= 3) {
            removeWrong(data, i);
        }
    })
}
</script>
</body>
</html>