package com.example.member.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.member.vo.MemberVO;

@Repository
public class MemberDaoImp
{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<MemberVO> getList()
	{
		return sqlSessionTemplate.selectList("memberList");
	}
	
	public MemberVO memberDeatil(String uid)
	{
		return sqlSessionTemplate.selectOne("memberOne", uid);
	}
	
	public void memberInsert(MemberVO vo)
	{
		sqlSessionTemplate.insert("memberInsert",vo);
	}
	
	public void memberUpdate(MemberVO vo)
	{
		sqlSessionTemplate.update("memberUpdate",vo);
	}
	
	public void memberDelete(MemberVO vo)
	{
		sqlSessionTemplate.delete("memberDelete",vo);
	}
}
