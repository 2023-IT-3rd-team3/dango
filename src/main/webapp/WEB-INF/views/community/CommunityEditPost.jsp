<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>새 글 쓰기</title>
    <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
    <link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
    <link rel="stylesheet" href="../../../resources/static/css/common/reset.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/header.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/footer.css">
    <link rel="stylesheet" href="../../../resources/static/css/common/search.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community.css">
    <link rel="stylesheet" href="../../../resources/static/css/community/community_newPost.css">

<jsp:include page="../common/header.jsp" />

<body>
    <header>
        <div>
            <div>
                <a id="logo" href="">
                    <img src="" alt="">
                    たんご🍡
                </a>
                <nav>
                    <a href="">새 단어</a>
                    <a href="">오답노트</a>
                    <a href="">단어장</a>
                    <a href="">사전</a>
                    <a href="">커뮤니티</a>
                </nav>
            </div>
            <a id="login" href="">로그인 / 회원가입</a>
        </div>
    </header>
    <div class="NewPostbox">
        <div class="NewPostmain">
            <form action="" method="post">
            <div class="NewPostTitle">
                <input class="NewPostTitleText" type="text" placeholder="제목을 수정해 주세요.">
            </div>
            <div class="NewPostContent">
                <textarea placeholder="내용을 수정해 주세요." rows="1" class="NewPostContentText" oninput='this.style.height = ""; this.style.height = this.scrollHeight + "px"'></textarea>
            </div>
            </form>
            <div style="height: 30px;">
            </div>
            <div class="newPost">
                <input class="newPostbutton" type="submit" value="작성완료">
            </div>
        </div>
    </div>

<jsp:include page="../common/footer.jsp" />

</body>
</html>