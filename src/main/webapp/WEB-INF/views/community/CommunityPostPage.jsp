<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="./style.css" rel="stylesheet">
    <title>${boardTitle }</title>
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
                    ${board.boardTitle }
                </div>
                <div class="postinfo">
                    <div class="postinfo_user">${board.userId }</div>
                    <div class="postinfo_date">${board.boardRegDate }</div>
                </div>
                <hr style="margin: 10px;">
                <div class="commentbox">
                
                <!-- 유저가 작성한 댓글 -->
                <div class="postcontent">
                   ${board.boardMain }
                </div>
                
                <!-- 추천버튼 -->
                <div class="recommendinfo">
                	<button class="recommendbutton">추천</button>
                	<p align="right">추천개수</p>
                </div>
                
                <!-- 댓글추가 -->
                <div class="postcomment">
                    <form action="/reply/insertComment" method="get">
                        <textarea placeholder="댓글을 입력해주세요." id="comment" class="postcomment_c"></textarea>
                        <input type="hidden" name="boardId" value="${board.boardId }">
                        <input class="postcomment_b" type="button" value="등록">
                    </form>
                </div>
                
                <div class="postinfo">
                    <div>${board.userID }</div>
                    <div>${reply.replyRegisterDate }</div>
                </div>
                <div class="postcontent">
                    ${reply.raplyMain }
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
                    
            <c:forEach var="board" items="${boardList}">
        	<a class="textbox" href="/community/viewBoard?boardId=${board.boardId}">
		    	<div class="textbox_title">${board.boardTitle}</div>
        	   	<div class="textbox_info">
                <div style="margin-left: 10px;">${board.boardRegisterDate}</div>
                <div style="margin-left: 10px;">${board.views}</div>
	            <div style="margin-left: 10px;">${board.likes}</div>
        	</a>
    		</c:forEach>
    		
                    <div style="width: 100%; height: 50px;"></div>
                </div>
            </div>
        </div>
    </div>

<jsp:include page="../common/footer.jsp" />

</body>
</html>