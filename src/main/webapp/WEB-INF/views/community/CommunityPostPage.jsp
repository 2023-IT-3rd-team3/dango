<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="./style.css" rel="stylesheet">
    <title>게시글</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="../../../resources/static/css/common/reset.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/header.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/footer.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/search.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community_post.css">
</head>
<body>

<jsp:include page="../common/header.jsp" />

<div class="Postbox">
        <div class="Postmain">
            <div class="Post">
                <div class="PostHeader">
                    <div class="Posttype">자유게시판</div>
                    <div class="PostHeaderButtonGroup">
                        <a class="PostHeaderButtonRemove">삭제</a>
                        <a class="PostHeaderButtonEdit">수정</a>
                    </div>
                </div>
                <div class="Posttitle">
                    글제목
                </div>
                <div class="postinfo">
                    <div class="postinfo_user">유저이름</div>
                    <div class="postinfo_date">2023/11/15</div>
                </div>
                <hr style="margin: 10px;">
                <div class="commentbox">
                <div class="recommendinfo">
                	<button class="recommendbutton">추천</button>
                </div>
                <div class="postcontent">
                    글 내용<br>
                    이곳에 유저가 작성한 글 내용이 들어간다.<br>
                    <br>
                    이 글은 예시를 위해 작성된 글이다.<br>
                </div>
                <div class="postcomment">
                    <form action="" method="get">
                        <textarea placeholder="댓글을 입력해주세요." id="comment" class="postcomment_c"></textarea>
                        <input class="postcomment_b" type="button" value="등록">
                    </form>
                </div>
                <div class="postinfo">
                    <div>유저이름</div>
                    <div>2023/11/15</div>
                </div>
                <div class="postcontent">
                    답글 내용<br>
                    이곳에 유저가 해당글에 대한 댓글에 작성한 내용이 들어간다.<br>
                </div>
                </div>
                <div style="margin: 10px;">
                </div>
            </div>
        </div>
        <div class="Postmain">
            <div class="subpost">
                <div class="announ_box">
                    <div class="title">
                        <h2 class="title_name">자유게시판</h2>
                        <a class="title_more">더보기</a>
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
                    <div style="width: 100%; height: 50px;"></div>
                </div>
            </div>
        </div>
    </div>

<jsp:include page="../common/footer.jsp" />

</body>
</html>