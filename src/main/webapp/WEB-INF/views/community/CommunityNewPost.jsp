<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
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
                <input class="NewPostTitleText" type="text" placeholder="제목을 입력해 주세요.">
            </div>
            <div class="NewPostContent">
                <textarea placeholder="내용을 입력해 주세요." rows="1" class="NewPostContentText" oninput='this.style.height = ""; this.style.height = this.scrollHeight + "px"'></textarea>
            </div>
            </form>
            <div style="height: 30px;">
            </div>
            <div class="newPost">
                <input class="newPostbutton" type="submit" value="작성완료">
            </div>
        </div>
    </div>
    <footer>
        <div class="footer_Box">
        <a id="logo" href="">
                    <img src="" alt="">
                    たんご🍡
        </a>
        <p>
            <span>팀명 : DanGo</span><br>
            <span>팀원 : 김태현, 권오상, 문현민, 심효섭</span><br>
            <span>Corpyright 2023. All Rights Reserved</span>
        </p>
        </div>
    </footer>
</body>
</html>