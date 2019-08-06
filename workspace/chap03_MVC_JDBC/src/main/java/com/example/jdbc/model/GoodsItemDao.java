package com.example.jdbc.model;

import java.util.List;

import com.example.jdbc.vo.GoodsItemVO;

public interface GoodsItemDao
{
	//전체 레코드 검색
	List<GoodsItemVO> findALL();
	
	//상세 레코드 검색 - 조건 검색
	GoodsItemVO findItem(int item_id);
	
	//레코드 삽입
	int itemInsert(GoodsItemVO vo);
	
	//레코드 수정
	int itemUpdate(GoodsItemVO vo);
	
	//레코드 삭제
	int itemDelete(GoodsItemVO vo);
}
