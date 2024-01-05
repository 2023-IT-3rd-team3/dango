<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메인페이지</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/mainpage.css?afterb">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/community/community.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/slide.css?a" />
    
</head>
<body>
    <jsp:include page="common/header.jsp" />
    <section class="mainpagearea">
		    <div class="slide slide_wrap">
			      <div class="slide_item"><a href="/dango/word/new"><img class="slide_img" alt="" src="${pageContext.request.contextPath}/resources/static/image/banner1.png"></a></div>
			      <div class="slide_item"><a href="/dango/community"><img class="slide_img" alt="" src="${pageContext.request.contextPath}/resources/static/image/banner2.png"></a></div>
			      <div class="slide_item"><a href="/dango/dictionary"><img class="slide_img" alt="" src="${pageContext.request.contextPath}/resources/static/image/banner3.png"></a></div>
			      <div class="slide_prev_button slide_button">◀</div>
			      <div class="slide_next_button slide_button">▶</div>
			      <ul class="slide_pagination"></ul>
		    </div>
        <div class="mainpagetitlearea">
            <h1 class="mainpagetitle">
                일본어 단어 학습 사이트,<br>
                <strong>단고</strong>와 함께하기.
            </h1>
        </div>
        <div class="mainpagecontentarea">
            <div class="mainpagecontenttitle">
                <div class="contenttitle">
                    <h3>커뮤니티 리스트</h3>
                    <sub>등록되어있는 글 목록</sub>
                </div>
                <a class="contentmore">
                    더보기
                </a>
            </div>
            <a class="textbox" href="">
                <div class="textbox_title">예시글1</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">예시글1</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">예시글1</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">예시글1</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
        </div>
        <div class="mainpagecontentarea">
            <div class="mainpagecontenttitle">
                <div class="contenttitle">
                    <h3>새단어 목록</h3>
                    <sub>새 단어 배우기</sub>
                </div>
                <a class="contentmore">
                    더보기
                </a>
            </div>
            <div class="mainwordarea">
                <article>
                    <div class="word-hurigana">
                        <a class="word" href="#">事実</a>
                        <p class="hurigana">[じじつ]</p>
                    </div>
                    <div class="mean-list">
                        <p class="mean">1. 사실</p>
                        <p class="mean">2. 실제로 일어난 일</p>
                        <p class="mean">3. 정말로;참말로</p>
                    </div>
                </article>
                <article>
                    <div class="word-hurigana">
                        <a class="word" href="#">事実</a>
                        <p class="hurigana">[じじつ]</p>
                    </div>
                    <div class="mean-list">
                        <p class="mean">1. 사실</p>
                        <p class="mean">2. 실제로 일어난 일</p>
                        <p class="mean">3. 정말로;참말로</p>
                    </div>
                </article>
                <article>
                    <div class="word-hurigana">
                        <a class="word" href="#">事実</a>
                        <p class="hurigana">[じじつ]</p>
                    </div>
                    <div class="mean-list">
                        <p class="mean">1. 사실</p>
                        <p class="mean">2. 실제로 일어난 일</p>
                        <p class="mean">3. 정말로;참말로</p>
                    </div>
                </article>
            </div>
        </div>
    </section>
    <jsp:include page="common/footer.jsp" />
 <script src="${pageContext.request.contextPath}/resources/static/js/slide.js"></script>
</body>
</html>