<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
<link href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css' rel='stylesheet'/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/footer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/common/search.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/dictionary/dictionaryFont.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/static/css/dictionary/dictionaryList.css">
</head>
<body>
<jsp:include page="../common/header.jsp" />
<section id="container" class="wrapper">
	<div id="content">
		<div>
			<form class="search_box">
			<fieldset id="search_area">
			<input type="search" placeholder="일본어 검색" class="search_input">
			<button type="submit" value="검색" class="search_button"><i class="fa fa-search"></i></button>
			</fieldset>
			</form>
		</div>
			
		<div id="dictionary_area">
			<ul>
				<c:forEach var="word" items="${wordList}">
					<li class="sentence_JP">
						<a href="">
							<ruby>
								${word.word}
								<rt>${word.furigana}</rt>
							</ruby>
						</a>
					</li>
				</c:forEach>
				<li class="sentence_JP"><a href="#"><ruby>遊<rt>あそ</rt>ぶ<ruby></ruby></a><br></li>
				<h2>뜻 : 놀다</h2>
				
				<li class="sentence_JP"><a href="#"><ruby>遊<rt>あそ</rt>ぶ<ruby></ruby></a><br></li>
				<h2>뜻 : 놀다</h2>
				
				<li class="sentence_JP"><a href="#"><ruby>遊<rt>あそ</rt>ぶ<ruby></ruby></a><br></li>
				<h2>뜻 : 놀다</h2>
				
				<li class="sentence_JP"><a href="#"><ruby>遊<rt>あそ</rt>ぶ<ruby></ruby></a><br></li>
				<h2>뜻 : 놀다</h2>
				
				<li class="sentence_JP"><a href="#"><ruby>遊<rt>あそ</rt>ぶ<ruby></ruby></a><br></li>
				<h2>뜻 : 놀다</h2>
				
				<li class="sentence_JP"><a href="#"><ruby>遊<rt>あそ</rt>ぶ<ruby></ruby></a><br></li>
				<h2>뜻 : 놀다</h2>
			</ul>
		</div>
		
		<!-- <div>
			<p><a href="#">1</a></p> &nbsp;&nbsp;
			<p><a href="#">2</a></p> &nbsp;&nbsp;
			<p><a href="#">3</a></p> &nbsp;&nbsp;
			<p><a href="#">4</a></p> &nbsp;&nbsp;
			<p>...</p> &nbsp;&nbsp;
		</div> -->
	</div>
</section>

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