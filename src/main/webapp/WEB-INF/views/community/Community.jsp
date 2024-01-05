<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/search.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/community/community.css">
    
    <title>커뮤니티</title>
</head>
<body>
<jsp:include page="../common/header.jsp" />

    <div class="Commu_box">
        <form action="/dango/community/CommunitySearch" method="get">
        	<div class="search_banner">
                <input class="search_bar" type="text" value="게시글 검색하기"><input class="search_button" type="submit">
                <a class="new_text" href="/dango/community/boardInsert">글쓰기</a>
        	</div>
    	</form>
        	<div class="announ_box">
            	<div class="title">
                <h2 class="title_name">공지사항</h2>
                <a class="title_more" href="/dango/community/notice">더보기</a>
            </div>
            
            <c:forEach var="boardinfo" items="${boardinfoList}">
        	<a class="textbox" href="/community/viewBoard?boardId=${board.boardId}">
	            <div class="textbox_title">${board.boardTitle}</div>
    	        <div class="textbox_info">
                <div style="margin-left: 10px;">${board.boardRegisterDate}</div>
                <div style="margin-left: 10px;">${board.views}</div>
                <div style="margin-left: 10px;">${board.likes}</div>
            </div>
        	</a>
    		</c:forEach>
    	
            <div style="width: 100%; height: 50px;"></div>
        </div>
        
        <div class="announ_box">
            <div class="title">
                <h2 class="title_name">자유게시판</h2>
                <a class="title_more" href="/dango/community/free">더보기</a>
            </div>
            
            <c:forEach var="board" items="${boardList}">
        	<a class="textbox" href="/dango/community/viewBoard?boardId=${board.boardId}">
		    	<div class="textbox_title">${board.boardTitle}</div>
        	   	<div class="textbox_info">
                <div style="margin-left: 10px;">${board.boardRegisterDate}</div>
                <div style="margin-left: 10px;">${board.views}</div>
	            <div style="margin-left: 10px;">${board.likes}</div>
        	</a>
    		</c:forEach>
    		</div>
    	
            <div style="width: 100%; height: 50px;"></div>
        </div>
   
<jsp:include page="../common/footer.jsp" />

</body>
</html>