<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
    <div>
        <div>
            <a id="logo" href="">
                <img src="" alt="">
                だんご🍡
            </a>
            <nav>
                <a href="/dango/word/new">새 단어</a>
                <a href="/dango/word/wrong">오답노트</a>
                <a href="/dango/wordMain">단어장</a>
                <a href="/dango/dictionary">사전</a>
                <a href="/dango/community">커뮤니티</a>
            </nav>
        </div>
        <c:choose>
        	<c:when test="${not empty user}">
        		<button id="my-page" type="button">
        			<img alt="" src="${pageContext.request.contextPath}/resources/static/image/profileDefault.jpg">
        		</button>
        	</c:when>
        	<c:otherwise>
        		<a id="login" href="/dango/login">로그인 / 회원가입</a>
        	</c:otherwise>
        </c:choose>
    </div>
</header>