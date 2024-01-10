<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <c:if test="${category eq 'notice'}">
    	<title>공지사항 목록</title>
    </c:if>
    <c:if test="${category eq 'free'}">
    	<title>자유 게시판 목록</title>
    </c:if>
    <c:if test="${category eq 'scrap'}">
    	<title>스크랩 목록</title>
    </c:if>
    <c:if test="${empty category}">
    	<title>${keyword} : だんご 검색결과</title>
    </c:if>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/footer.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/search.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/community/community.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/community/community_menu.css">
</head>

<body>
<jsp:include page="../common/header.jsp" />

    <div class="Commu_box">
        <form action="/dango/community/CommunitySearch" method="get">
        	<div class="search_banner">
        		<input class="search_bar" name="keyword" type="text" placeholder="게시글 검색하기" value="${keyword}"><input class="search_button" type="submit" value="🔍">
                <a class="new_text" href="/dango/community/boardInsert">글쓰기</a>
	        </div>
	    </form>
        <div class="announ_box">
            <div class="Postmenu">
                <a class="Postmenu_m" href="/dango/community/notice">공지사항</a>
                <a class="Postmenu_m" href="/dango/community/free">자유게시판</a>
                <a class="Postmenu_m" href="/dango/scrap">스크랩</a>
            </div>
            <div class="CoummnityClass">
            	<c:choose>
	            	<c:when test="${category eq 'notice'}">            	
		                <div class="CoummnityClasshead">
		                   	<h1 class="CoummnityClassTitle">공지사항</h1>
		                    <h3 class="CoummnityClassText">공지사항 게시판은 단고의 주요한 소식을 안내하는 공간입니다.</h3>
		                </div>
	            	</c:when>
	                <c:when test="${category eq 'free'}">
	                	<div class="CoummnityClasshead">
		                    <h1 class="CoummnityClassTitle">자유게시판</h1>
		                    <h3 class="CoummnityClassText">자유게시판은 회원 여러분의 자유로운 생각을 나누고 토론하는 공간입니다.</h3>
		                </div>
	                </c:when>
	                <c:when test="${category eq 'scrap'}">
	                	<div class="CoummnityClasshead">
		                    <h1 class="CoummnityClassTitle">스크랩</h1>
		                    <h3 class="CoummnityClassText">자신이 스크랩한 게시글들을 확인할 수 있는 공간입니다.</h3>
		                </div>
	                </c:when>
	            	<c:otherwise>
	            		<div class="CoummnityClasshead">
		                    <h1 class="CoummnityClassTitle">검색결과</h1>
		                    <h3 class="CoummnityClassText"></h3>
		                </div>
	            	</c:otherwise>
            	</c:choose>
            </div>
            <div class="title">
            </div>
           <c:forEach var="board" items="${boardList}">
	        	<a class="textbox" href="/dango/community/boardView/${board.boardId}">
			    	<div class="textbox_title">${board.boardTitle}</div>
	        	   	<div class="textbox_info">
		                <div style="margin-left: 10px;">${board.boardRegisterDate}</div>
		                <div style="margin-left: 10px;">
                            <svg viewBox="64 64 896 896" focusable="false" data-icon="eye" width="1em" height="1em" fill="currentColor" aria-hidden="true"><path d="M396 512a112 112 0 10224 0 112 112 0 10-224 0zm546.2-25.8C847.4 286.5 704.1 186 512 186c-192.2 0-335.4 100.5-430.2 300.3a60.3 60.3 0 000 51.5C176.6 737.5 319.9 838 512 838c192.2 0 335.4-100.5 430.2-300.3 7.7-16.2 7.7-35 0-51.5zM508 688c-97.2 0-176-78.8-176-176s78.8-176 176-176 176 78.8 176 176-78.8 176-176 176z"></path></svg>
                            ${board.boardViews}
                        </div>
			            <div style="margin-left: 10px;">
                            <svg viewBox="64 64 896 896" focusable="false" data-icon="like" width="1em" height="1em" fill="currentColor" aria-hidden="true"><path d="M885.9 533.7c16.8-22.2 26.1-49.4 26.1-77.7 0-44.9-25.1-87.4-65.5-111.1a67.67 67.67 0 00-34.3-9.3H572.4l6-122.9c1.4-29.7-9.1-57.9-29.5-79.4A106.62 106.62 0 00471 99.9c-52 0-98 35-111.8 85.1l-85.9 311h-.3v428h472.3c9.2 0 18.2-1.8 26.5-5.4 47.6-20.3 78.3-66.8 78.3-118.4 0-12.6-1.8-25-5.4-37 16.8-22.2 26.1-49.4 26.1-77.7 0-12.6-1.8-25-5.4-37 16.8-22.2 26.1-49.4 26.1-77.7-.2-12.6-2-25.1-5.6-37.1zM112 528v364c0 17.7 14.3 32 32 32h65V496h-65c-17.7 0-32 14.3-32 32z"></path></svg>
                            ${board.recommends}
                        </div>
		            </div>
	        	</a>
    		</c:forEach>
            <div style="width: 100%; height: 50px;"></div>
        </div>
    </div>

<jsp:include page="../common/footer.jsp" />

</body>

</html>