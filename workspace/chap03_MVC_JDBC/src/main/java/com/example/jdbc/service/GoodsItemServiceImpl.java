package com.example.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jdbc.model.GoodsItemDao;
import com.example.jdbc.vo.GoodsItemVO;


@Service
public class GoodsItemServiceImpl implements GoodsItemService {

   
   @Autowired
   private GoodsItemDao goodsItemDao;
   
   @Override
   public List<GoodsItemVO> getItemList()
   {
      
      return goodsItemDao.findALL();
   }

   @Override
   public GoodsItemVO getItem(int item_id)
   {
	
	   return goodsItemDao.findItem(item_id);
   }

   @Override
   public int itemInsert(GoodsItemVO vo)
   {
	   return goodsItemDao.itemInsert(vo);
   }	
   
   @Override
   public int itemUpdate(GoodsItemVO vo)
   {
	   return goodsItemDao.itemUpdate(vo);
   }

   @Override
   public int itemDelete(GoodsItemVO vo)
   {
	   return goodsItemDao.itemDelete(vo);
   }   
}

