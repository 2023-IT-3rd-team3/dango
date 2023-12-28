<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="./style.css" rel="stylesheet">
<title>${boardTitle }</title>
<link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css"
	rel="stylesheet">
<link
	href='https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css'
	rel='stylesheet' />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/common/reset.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/common/header.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/common/footer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/common/search.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/community/community.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/static/css/community/community_post.css">
</head>
<body>

	<jsp:include page="../common/header.jsp" />

	<div class="Postbox">
		<div class="Postmain">
			<div class="Post">
				<div class="PostHeader">
					<div class="Posttype">자유게시판</div>
					<div class="PostHeaderButtonGroup">
						<a class="PostHeaderButtonRemove">삭제</a> <a
							class="PostHeaderButtonEdit">수정</a>
					</div>
				</div>
				<div class="Posttitle">글제목</div>
				<div class="postinfo">
					<div class="postinfo_user">유저이름</div>
					<div class="postinfo_date">2023/11/15</div>
				</div>
				<hr style="margin: 10px;">
				<div class="commentbox">

					<div class="postcontent">
						글 내용<br> 이곳에 유저가 작성한 글 내용이 들어간다.<br> <br> 이 글은 예시를
						위해 작성된 글이다.<br>
					</div>

					<div class="recommendinfo">
						<button id="recommendbutton">
							<svg id="recommend-img" viewBox="64 64 896 896" focusable="false"
								data-icon="like" width="32px" height="32px" fill="currentColor"
								aria-hidden="true">
								<path
									d="M885.9 533.7c16.8-22.2 26.1-49.4 26.1-77.7 0-44.9-25.1-87.4-65.5-111.1a67.67 67.67 0 00-34.3-9.3H572.4l6-122.9c1.4-29.7-9.1-57.9-29.5-79.4A106.62 106.62 0 00471 99.9c-52 0-98 35-111.8 85.1l-85.9 311h-.3v428h472.3c9.2 0 18.2-1.8 26.5-5.4 47.6-20.3 78.3-66.8 78.3-118.4 0-12.6-1.8-25-5.4-37 16.8-22.2 26.1-49.4 26.1-77.7 0-12.6-1.8-25-5.4-37 16.8-22.2 26.1-49.4 26.1-77.7-.2-12.6-2-25.1-5.6-37.1zM112 528v364c0 17.7 14.3 32 32 32h65V496h-65c-17.7 0-32 14.3-32 32z"></path></svg>
							<p>추천</p>
						</button>
					</div>
					<div id="like-views-comments">
						<p>
							<svg viewBox="64 64 896 896" focusable="false" data-icon="like"
								width="1em" height="1em" fill="currentColor" aria-hidden="true">
								<path
									d="M885.9 533.7c16.8-22.2 26.1-49.4 26.1-77.7 0-44.9-25.1-87.4-65.5-111.1a67.67 67.67 0 00-34.3-9.3H572.4l6-122.9c1.4-29.7-9.1-57.9-29.5-79.4A106.62 106.62 0 00471 99.9c-52 0-98 35-111.8 85.1l-85.9 311h-.3v428h472.3c9.2 0 18.2-1.8 26.5-5.4 47.6-20.3 78.3-66.8 78.3-118.4 0-12.6-1.8-25-5.4-37 16.8-22.2 26.1-49.4 26.1-77.7 0-12.6-1.8-25-5.4-37 16.8-22.2 26.1-49.4 26.1-77.7-.2-12.6-2-25.1-5.6-37.1zM112 528v364c0 17.7 14.3 32 32 32h65V496h-65c-17.7 0-32 14.3-32 32z"></path></svg>
							<span id="recommend-count">2</span>
						</p>
						<p>
							<svg viewBox="64 64 896 896" focusable="false" data-icon="eye"
								width="1em" height="1em" fill="currentColor" aria-hidden="true">
								<path
									d="M396 512a112 112 0 10224 0 112 112 0 10-224 0zm546.2-25.8C847.4 286.5 704.1 186 512 186c-192.2 0-335.4 100.5-430.2 300.3a60.3 60.3 0 000 51.5C176.6 737.5 319.9 838 512 838c192.2 0 335.4-100.5 430.2-300.3 7.7-16.2 7.7-35 0-51.5zM508 688c-97.2 0-176-78.8-176-176s78.8-176 176-176 176 78.8 176 176-78.8 176-176 176z"></path></svg>
							<span>400</span>
						</p>
						<p>
							<svg viewBox="64 64 896 896" focusable="false"
								data-icon="message" width="1em" height="1em" fill="currentColor"
								aria-hidden="true">
								<path
									d="M924.3 338.4a447.57 447.57 0 00-96.1-143.3 443.09 443.09 0 00-143-96.3A443.91 443.91 0 00512 64h-2c-60.5.3-119 12.3-174.1 35.9a444.08 444.08 0 00-141.7 96.5 445 445 0 00-95 142.8A449.89 449.89 0 0065 514.1c.3 69.4 16.9 138.3 47.9 199.9v152c0 25.4 20.6 46 45.9 46h151.8a447.72 447.72 0 00199.5 48h2.1c59.8 0 117.7-11.6 172.3-34.3A443.2 443.2 0 00827 830.5c41.2-40.9 73.6-88.7 96.3-142 23.5-55.2 35.5-113.9 35.8-174.5.2-60.9-11.6-120-34.8-175.6zM312.4 560c-26.4 0-47.9-21.5-47.9-48s21.5-48 47.9-48 47.9 21.5 47.9 48-21.4 48-47.9 48zm199.6 0c-26.4 0-47.9-21.5-47.9-48s21.5-48 47.9-48 47.9 21.5 47.9 48-21.5 48-47.9 48zm199.6 0c-26.4 0-47.9-21.5-47.9-48s21.5-48 47.9-48 47.9 21.5 47.9 48-21.5 48-47.9 48z"></path></svg>
							<span>0</span>
						</p>
					</div>

					<div class="postcomment">
						<form action="" method="get">
							<textarea placeholder="댓글을 입력해주세요." id="comment"
								class="postcomment_c"></textarea>
							<input class="postcomment_b" type="button" value="등록">
						</form>
					</div>
					<div class="postinfo">
						<div>유저이름</div>
						<div>2023/11/15</div>
					</div>
					<div class="postcontent">
						답글 내용<br> 이곳에 유저가 해당글에 대한 댓글에 작성한 내용이 들어간다.<br>
					</div>
				</div>
				<div style="margin: 10px;"></div>
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
					</a> <a class="textbox">
						<div class="textbox_title">예시글2</div>
						<div class="textbox_info">
							<div style="margin-left: 10px;">2023/11/15</div>
							<div style="margin-left: 10px;">30</div>
							<div style="margin-left: 10px;">0</div>
						</div>
					</a> <a class="textbox">
						<div class="textbox_title">예시글3</div>
						<div class="textbox_info">
							<div style="margin-left: 10px;">2023/11/15</div>
							<div style="margin-left: 10px;">30</div>
							<div style="margin-left: 10px;">0</div>
						</div>
					</a> <a class="textbox">
						<div class="textbox_title">예시글4</div>
						<div class="textbox_info">
							<div style="margin-left: 10px;">2023/11/15</div>
							<div style="margin-left: 10px;">30</div>
							<div style="margin-left: 10px;">0</div>
						</div>
					</a> <a class="textbox">
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
	<script
		src="${pageContext.request.contextPath}/resources/static/js/jquery.min.js"></script>
	<script type="text/javascript">
		let boardId = "${board.boardId}";
		let userId = "${userId}";
	</script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/static/js/community/CommunityPostPage.js"></script>
</body>
</html>