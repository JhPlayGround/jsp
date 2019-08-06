package com.example.jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.jdbc.service.GoodsItemService;
import com.example.jdbc.vo.GoodsItemVO;

@Controller
public class GoodsItemController
{
	@Autowired
	private GoodsItemService goodsItemService; 
	
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/main.do")
	public ModelAndView main()
	{
		List<GoodsItemVO> list = goodsItemService.getItemList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("jsp/main");
		return mav;
	}
	
	@RequestMapping(value="/content.do")
	public ModelAndView content(@RequestParam("item_id") int item_id)
	{
		GoodsItemVO row = goodsItemService.getItem(item_id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("row", row);
		mav.setViewName("jsp/content");
		return mav;
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String form()
	{
		return "jsp/insertForm";
	}
	

	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String insert(@ModelAttribute GoodsItemVO vo)
	{
		int num = goodsItemService.itemInsert(vo);
		
		if(num >= 1)
		{
			return "redirect:/main.do";
		}
		else
		{
			return "jsp/insertForm";
		}
	}
	
	@RequestMapping(value="/update/{item_id}")
	public String updateForm(@PathVariable int item_id, Model model)
	{
		GoodsItemVO row = goodsItemService.getItem(item_id);
		model.addAttribute("row", row);
		
		return "jsp/updateForm";
	}
	
	@RequestMapping(value="/updatePro")
	public String update(@ModelAttribute GoodsItemVO vo)
	{
		int num = goodsItemService.itemUpdate(vo);
		
		if(num >= 1)
		{
			return "redirect:/main.do";
		}
		else
		{
			return "jsp/updateForm";
		}
	}
	
	@RequestMapping(value="/delete/{item_id}")
	public String deleteForm(@PathVariable int item_id, Model model)
	{
		GoodsItemVO row = goodsItemService.getItem(item_id);
		model.addAttribute("row", row);
		
		return "jsp/deleteForm";
	}
	
	@RequestMapping(value="/deletePro")
	public String delete(@ModelAttribute GoodsItemVO vo)
	{
		int num = goodsItemService.itemDelete(vo);
		
		if(num >= 1)
		{
			return "redirect:/main.do";
		}
		else
		{
			return "jsp/deleteForm";
		}
	}
}
