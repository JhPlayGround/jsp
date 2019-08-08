package com.example.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.member.model.MemberDaoImp;
import com.example.member.vo.MemberVO;

@Controller
public class MemberController
{	
	@Autowired
	private MemberDaoImp memberDaoImp;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/list.do")
	public ModelAndView list()
	{
		//int num = 10 / 0;
		List<MemberVO> list = memberDaoImp.getList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("list", list);
		mav.setViewName("member/member_list");
		return mav;
	}
	
	@RequestMapping("/detail.do")
	public String detailForm(@RequestParam("uid") String uid, Model model)
	{
		MemberVO row = memberDaoImp.memberDeatil(uid);
		model.addAttribute("row", row);
		return "member/member_detail";
	}
	
	@RequestMapping(value="join.do", method=RequestMethod.GET)
	public String join_form()
	{
		return "member/member_insert";
	}
	
	@RequestMapping(value="join.do", method=RequestMethod.POST)
	public String join(@ModelAttribute MemberVO vo)
	{
		memberDaoImp.memberInsert(vo);
		
		return "redirect:/list.do";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public String update_form(@RequestParam("uid") String uid, Model model)
	{
		MemberVO row = memberDaoImp.memberDeatil(uid);
		model.addAttribute("row", row);
		return "member/member_update";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String update(@ModelAttribute MemberVO vo)
	{
		memberDaoImp.memberUpdate(vo);
		
		return "redirect:/list.do";
	}
	
	@RequestMapping(value="/delete.do", method=RequestMethod.GET)
	public String delete_form(@RequestParam("uid") String uid, Model model)
	{
		MemberVO row = memberDaoImp.memberDeatil(uid);
		model.addAttribute("row", row);
		return "member/member_delete";
	}
	
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public String delete(@ModelAttribute MemberVO vo)
	{
		memberDaoImp.memberDelete(vo);
		
		return "redirect:/list.do";
	}
}
