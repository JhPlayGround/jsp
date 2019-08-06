package com.example.jdbc.service;

import java.util.List;

import com.example.jdbc.vo.GoodsItemVO;

public interface GoodsItemService
{
	List<GoodsItemVO> getItemList();
	
	GoodsItemVO getItem(int item_id);
	
	int itemInsert(GoodsItemVO vo);
	
	int itemUpdate(GoodsItemVO vo);
	
	int itemDelete(GoodsItemVO vo);
}
