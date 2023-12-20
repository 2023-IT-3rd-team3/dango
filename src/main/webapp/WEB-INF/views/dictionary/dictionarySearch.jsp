<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>'${keyword}' : だんご 사전</title>
</head>
<body>

<jsp:include page="../common/header.jsp" />

<section id="container" class="wrapper">
	<div id="content">
		<div>
			<div>
				<form class="search_box">
				<fieldset id="search_area">
				<input type="search" placeholder="일본어 검색" class="search_input" value="${keyword}">
				<button type="submit" value="검색" class="search_button"><i class="fa fa-search"></i></button>
				</fieldset>
				</form>
			</div>
		</div>
		
		<div class="voca_view">
			<div id="voca_viewinfo">
				<h3>수준 : ${sentence.wordLevel}</h3>
			</div>
			<div class="voca_viewBox">
				<div class="mean">
					<p class="sentence_JP">${sentence.wordHurigana} [${sentence.wordWord}]</p>
					<p>뜻 : ${sentence.wordMean}</p>
				</div>
				<hr>
				<div id="ex_sentence">
					<p class="sentence_JP">예문</p>
					<p>${sentence.exFrontKr}</p>
					<h1>${sentence.wordWord}</h1>
					<p>${sentence.exBackKr}</p>
				</div>
				<div id="ex_sentence">
					<p>${sentence.exFrontJp}</p>
					<h1>${sentence.wordMean}</h1>
					<p>${sentence.exBackJp}</p>
				</div>
			</div>
		</div>
	</div>
</section>

<jsp:include page="../common/footer.jsp" />

</body>
</html>