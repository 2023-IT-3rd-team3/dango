<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="./style.css" rel="stylesheet">
    <title>자유게시판목록</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="../../../resources/static/css/common/reset.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/header.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/footer.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/search.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community_menu.css">

</head>

<body>
<jsp:include page="../common/header.jsp" />

    <div class="Commu_box">
        <form>
        <div class="search_banner">
            
                <input class="search_bar" type="text" value="게시글 검색하기"><input class="search_button" type="submit" value="🔍">
                <a class="new_text">글쓰기</a>
            
        </div>
    </form>
        <div class="announ_box">
            <div class="Postmenu">
                <a class="Postmenu_m">공지사항</a>
                <a class="Postmenu_m">자유게시판</a>
            </div>
            <div class="CoummnityClass">
                <div class="CoummnityClasshead">
                    <h1 class="CoummnityClassTitle">자유게시판</h1>
                    <h3 class="CoummnityClassText">자유 게시판은 회원 여러분의 자유로운 생각을 나누고 토론하는 공간입니다.</h3>
                </div>
                <a class="CoummnityClassLink">이용수칙 자세히 보기</a>
            </div>
            <div class="title">
            </div>
            <a class="textbox">
                <div class="textbox_title">예시글1</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글2</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글3</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글4</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글5</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글6</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글7</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글8</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글9</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글10</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글11</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox">
                <div class="textbox_title">예시글12</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <div style="width: 100%; height: 50px;"></div>
        </div>
    </div>

<jsp:include page="../common/footer.jsp" />

</body>

</html>