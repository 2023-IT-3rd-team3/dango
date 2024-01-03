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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/mainpage.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/word/checkWord.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/community/community.css">
</head>
<body>
    <jsp:include page="common/header.jsp" />
    <section class="mainpagearea">
        <div class="mainbannerarea">
            
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
                    <button class="check-btn">
                        <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check-fill" viewBox="0 0 16 16">
                            <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zm9.954 3H2.545c-.3 0-.545.224-.545.5v1c0 .276.244.5.545.5h10.91c.3 0 .545-.224.545-.5v-1c0-.276-.244-.5-.546-.5zm-2.6 5.854a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z"/>
                        </svg>
                    </button>
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
                    <button class="check-btn">
                        <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check-fill" viewBox="0 0 16 16">
                            <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zm9.954 3H2.545c-.3 0-.545.224-.545.5v1c0 .276.244.5.545.5h10.91c.3 0 .545-.224.545-.5v-1c0-.276-.244-.5-.546-.5zm-2.6 5.854a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z"/>
                          </svg>
                    </button>
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
                    <button class="check-btn">
                        <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-calendar2-check-fill" viewBox="0 0 16 16">
                            <path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zm9.954 3H2.545c-.3 0-.545.224-.545.5v1c0 .276.244.5.545.5h10.91c.3 0 .545-.224.545-.5v-1c0-.276-.244-.5-.546-.5zm-2.6 5.854a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z"/>
                          </svg>
                    </button>
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
</body>
</html>