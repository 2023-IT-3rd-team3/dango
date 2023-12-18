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
        <article>
            <p class="correct-count">정답 횟수 : <span>2회</span></p>
            <button class="check-btn">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check" viewBox="0 0 16 16">
                    <path d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM2 2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H2z"/>
                    <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
                  </svg>
            </button>
            <div class="korean">
                <p class="front-sentence-kr">인원수를</p>
                <h2 class="word-kr">확인</h2>
                <p class="back-sentence-kr">하다</p>
            </div>
            <div class="japanese">
                <p class="front-sentence-jp">人数を</p>
                <input class="word-jp" type="text">
                <p class="back-jp">する</p>
            </div>
            <div class="btn-group">
                <button class="ok-btn">확인</button>
            </div>
        </article>
        <article>
            <p class="correct-count">정답 횟수 : <span>2회</span></p>
            <button class="check-btn">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check" viewBox="0 0 16 16">
                    <path d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM2 2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H2z"/>
                    <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
                  </svg>
            </button>
            <div class="korean">
                <p class="front-sentence-kr">인원수를</p>
                <h2 class="word-kr">확인</h2>
                <p class="back-sentence-kr">하다</p>
            </div>
            <div class="japanese">
                <p class="front-sentence-jp">人数を</p>
                <input class="word-jp" type="text">
                <p class="back-jp">する</p>
            </div>
            <div class="btn-group">
                <button class="ok-btn">확인</button>
            </div>
        </article>
        <article>
            <p class="correct-count">정답 횟수 : <span>2회</span></p>
            <button class="check-btn">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check" viewBox="0 0 16 16">
                    <path d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM2 2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H2z"/>
                    <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
                  </svg>
            </button>
            <div class="korean">
                <p class="front-sentence-kr">인원수를</p>
                <h2 class="word-kr">확인</h2>
                <p class="back-sentence-kr">하다</p>
            </div>
            <div class="japanese">
                <p class="front-sentence-jp">人数を</p>
                <input class="word-jp" type="text">
                <p class="back-jp">する</p>
            </div>
            <div class="btn-group">
                <button class="ok-btn">확인</button>
            </div>
        </article>
        <article>
            <p class="correct-count">정답 횟수 : <span>2회</span></p>
            <button class="check-btn">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check" viewBox="0 0 16 16">
                    <path d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM2 2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H2z"/>
                    <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
                  </svg>
            </button>
            <div class="korean">
                <p class="front-sentence-kr">인원수를</p>
                <h2 class="word-kr">확인</h2>
                <p class="back-sentence-kr">하다</p>
            </div>
            <div class="japanese">
                <p class="front-sentence-jp">人数を</p>
                <input class="word-jp" type="text">
                <p class="back-jp">する</p>
            </div>
            <div class="btn-group">
                <button class="ok-btn">확인</button>
            </div>
        </article>
        <article>
            <p class="correct-count">정답 횟수 : <span>2회</span></p>
            <button class="check-btn">
                <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check" viewBox="0 0 16 16">
                    <path d="M10.854 8.146a.5.5 0 0 1 0 .708l-3 3a.5.5 0 0 1-.708 0l-1.5-1.5a.5.5 0 0 1 .708-.708L7.5 10.793l2.646-2.647a.5.5 0 0 1 .708 0z"/>
                    <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM2 2a1 1 0 0 0-1 1v11a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V3a1 1 0 0 0-1-1H2z"/>
                    <path d="M2.5 4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 .5.5v1a.5.5 0 0 1-.5.5H3a.5.5 0 0 1-.5-.5V4z"/>
                  </svg>
            </button>
            <div class="korean">
                <p class="front-sentence-kr">인원수를</p>
                <h2 class="word-kr">확인</h2>
                <p class="back-sentence-kr">하다</p>
            </div>
            <div class="japanese">
                <p class="front-sentence-jp">人数を</p>
                <input class="word-jp" type="text">
                <p class="back-jp">する</p>
            </div>
            <div class="btn-group">
                <button class="ok-btn">확인</button>
            </div>
        </article>
    </section>
</body>
</html>