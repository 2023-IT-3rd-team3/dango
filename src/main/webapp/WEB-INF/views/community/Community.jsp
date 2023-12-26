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
    <link rel="stylesheet" href="../../../resources/static/css/common/reset.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/header.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/footer.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/search.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community.css">
    
    <title>커뮤니티</title>
</head>
<jsp:include page="../common/header.jsp" />

    <div class="Commu_box">
        <form>
        <div class="search_banner">
                <input class="search_bar" type="text" value="게시글 검색하기"><input class="search_button" type="submit">
                <a class="new_text">글쓰기</a>
        </div>
    </form>
        <div class="announ_box">
            <div class="title">
                <h2 class="title_name">공지사항</h2>
                <a class="title_more" href="/community/getBoardInfoList">더보기</a>
            </div>
            <a class="textbox" href="">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <a class="textbox" href="">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </a>
            <div style="width: 100%; height: 50px;"></div>
        </div>
        <div class="announ_box">
            <div class="title">
                <h2 class="title_name">자유게시판</h2>
                <a class="title_more" href="/community/getBoardList">더보기</a>
            </div>
            <div class="textbox">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </div>
            <div class="textbox">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </div>
            <div class="textbox">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </div>
            <div class="textbox">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </div>
            <div class="textbox">
                <div class="textbox_title">${boardTitle }</div>
                <div class="textbox_info">
                    <div style="margin-left: 10px;">2023/11/15</div>
                    <div style="margin-left: 10px;">30</div>
                    <div style="margin-left: 10px;">0</div>
                </div>
            </div>
            <div style="width: 100%; height: 50px;"></div>
        </div>
    </div>
   
<jsp:include page="../common/footer.jsp" />

</body>
</html>