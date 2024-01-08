<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${board.boardTitle} : だんご 커뮤니티</title>
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
				<c:if test="${board.boardNotice eq 1}">
					<div class="Posttype">공지사항</div>
				</c:if>
				<c:if test="${board.boardNotice eq 0}">
					<div class="Posttype">자유게시판</div>
				</c:if>
				<div class="PostHeaderButtonGroup">
					<c:if test="${board.userId eq user.userId}">
						<form action="/dango/community/boardDelete" method="post">
							<input type="hidden" name="boardId" value="${board.boardId}">
							<button type="submit" class="PostHeaderButtonRemove">삭제</button>
						</form>
						<form action="/dango/community/boardUpdatePage" method="post">
							<input type="hidden" name="boardId" value="${board.boardId}">
							<button type="submit" class="PostHeaderButtonEdit">수정</button>
						</form>
					</c:if>
				</div>
			</div>
			
			<!-- 스크랩 버튼 -->
			<div class="scrapBox">
				<div class="scrapbuttonBox">
					<a class="scrapbutton">스크랩</a>
				</div>
			</div>
			
			<div class="Posttitle">
				${board.boardTitle}
			</div>
			<div class="postinfo">
				<div class="postinfo_user">${board.userId}</div>
				<div class="postinfo_date">${board.boardRegisterDate}</div>
			</div>
			<hr style="margin: 10px;">
			<div class="commentbox">
			
			<!-- 유저가 작성한 댓글 -->
			<div class="postcontent">
				${board.boardMain}
			</div>
			
			<!-- 추천버튼 -->
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
					<span>${board.boardViews}</span>
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
			
			<!-- 댓글추가 -->
			<div class="postcomment">
				<textarea placeholder="댓글을 입력해주세요." id="comment-main" class="postcomment_c"></textarea>
				<button id="comment-btn" class="postcomment_b" type="button">등록</button>
			</div>
			
			<div class="postinfo">
				<div>${comment.userID}</div>
				<div>${comment.commentRegisterDate}</div>
			</div>
			<div class="postcontent">
				${comment.commentMain }
			</div>
			</div>
			<div id="comment-list">
				
			</div>
			<div style="margin: 10px;">
			</div>
		</div>
	</div>
	
</div>

	<jsp:include page="../common/footer.jsp" />
	<script
		src="${pageContext.request.contextPath}/resources/static/js/jquery.min.js"></script>
	<script type="text/javascript">
		let boardId = "${board.boardId}";
		let userId = "${user.userId}";
	</script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/static/js/community/CommunityPostPage.js">
	</script>
	
	<script type="text/javascript" 
		src="${pageContext.request.contextPath}/resources/static/js/community/scrap.js">
	</script>
	
	<script type="text/javascript" 
		src="${pageContext.request.contextPath}/resources/static/js/community/comment.js">
	</script>
	<script src="${pageContext.request.contextPath}/resources/static/js/jquery.min.js"></script>
	<script>
		const commentList = document.getElementById("comment-list");
        const commentMain = document.getElementById("comment-main");

		$.ajax({
			type: "post",
			url: "/dango/comment/getCommentList",
			data: JSON.stringify({
				boardId: boardId
			}),
			dataType:'json',
			contentType: "application/json; charset=utf-8",
			success: (result) => {
				for(let i = 0; i < result.length; i++) {
					let text = `<div class="comment-info">
									<div><img src="${pageContext.request.contextPath}/resources/static/image/profileDefault.jpg" alt="">` + result[i].userId + `</div>
									<div>` + result[i].commentRegisterDate + `</div>
								</div>
								<div class="comment-text">
									` + result[i].commentMain + `
								</div>`
					let commentDiv = document.createElement("div");
					commentDiv.classList.add("comment");
					commentDiv.innerHTML = text;
					commentList.appendChild(commentDiv);
				}
			}
		})
		console.log(5);

        $("#comment-btn").click(() => {
        	data = {
        			userId: userId,
					boardId: boardId,
					commentMain: commentMain.value,
        	};
			$.ajax ({
				type: "post",
				url: "/dango/comment/insertComment",
				data: JSON.stringify(data),
				dataType:'json',
				contentType: "application/json; charset=utf-8",
				success: (result) => {
					console.log(result);
					if(result !== null) {
						let text = `<div class="comment-info">
										<div><img src="${pageContext.request.contextPath}/resources/static/image/profileDefault.jpg" alt="">` + result.userId + `</div>
										<div>` + result.commentRegisterDate + `</div>
									</div>
									<div class="comment-text">
										` + result.commentMain + `
									</div>`
						let commentDiv = document.createElement("div");
						commentDiv.classList.add("comment");
						commentDiv.innerHTML = text;
						commentList.appendChild(commentDiv);
						commentMain.value = "";
					}
				},
				error: () => {
					console.log("error");
				}
			})
        })
	</script>
</body>


</html>