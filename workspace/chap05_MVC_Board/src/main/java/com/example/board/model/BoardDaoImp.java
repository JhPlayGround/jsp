package com.example.board.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.board.vo.BoardVO;
import com.example.board.vo.FileVO;

@Repository
public class BoardDaoImp implements BoardDao
{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int boardCount()
	{
		return sqlSessionTemplate.selectOne("boardCount");
	}

	@Override
	public List<BoardVO> boardList()
	{
		return sqlSessionTemplate.selectList("boardList");
	}

	@Override
	public void boardInsert(BoardVO vo)
	{
		sqlSessionTemplate.insert("boardInsert",vo);
	}

	@Override
	public BoardVO boardDetail(int bno)
	{
		return sqlSessionTemplate.selectOne("boardDetail", bno);
	}

	@Override
	public void boardUpdate(BoardVO vo)
	{
		sqlSessionTemplate.update("boardUpdate", vo);
	}

	@Override
	public void boardDelete(int bno)
	{
		sqlSessionTemplate.delete("boardDelete",bno);
	}

	@Override
	public void fileInsert(FileVO file)
	{
		sqlSessionTemplate.insert("fileInsert", file);
	}

	@Override
	public FileVO fileDetail(int bno)
	{
		return sqlSessionTemplate.selectOne("fileDetail", bno);
	}
	
	
}
