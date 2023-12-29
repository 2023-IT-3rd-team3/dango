package com.threeteam.dango.domain.common;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageDTO {
	
	//시작 페이지
	private int startPage;
	//현재 페이지 기준으로 마지막 페이지
	private int endPage;
	//실제 마지막 페이지
	private int realEnd;
	//이전 버튼과 다음 버튼의 유무 검사
	private boolean prev, next;
	
	// 전체 게시글 수
	private int total;
	private Criteria criteria;
	
	public PageDTO(int total, Criteria criteria) {
		this.total = total;
		this.criteria = criteria;
		
		this.endPage = (int)(Math.ceil(criteria.getPageNum()/(double) criteria.getAmount()))*criteria.getAmount();
//		endPage에서 - 9를 하면 startPage를 구할 수 있다.
		this.startPage = endPage - (criteria.getAmount() - 1);
//		실제 마지막 페이지는 전체 게시글 개수에서 amount를 나누고 올림
		this.realEnd = (int)Math.ceil( total * 1.0 / criteria.getAmount());
		
//		endPage는 10의 배수이기 때문에 realEnd보다 더 커지면 realEnd로 대체
		if(this.realEnd < this.endPage) {
			this.endPage = this.realEnd;
		}
//		1~10 : 1
//		11~20: 2
//		...
//		이전 단위가 있는 경우
		this.prev = this.startPage > 1;
//		다음 단위가 있는 경우
		this.next = this.endPage < this.realEnd;
	}
}
