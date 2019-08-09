package com.example.board.model;

import java.util.List;

import com.example.board.vo.BoardVO;
import com.example.board.vo.FileVO;

public interface BoardDao
{
	public int boardCount();
	
	public List<BoardVO> boardList();
	
	public void boardInsert(BoardVO vo);
	
	public BoardVO boardDetail(int bno); 
	
	public void boardUpdate(BoardVO bno); 
	
	public void boardDelete(int bno);
	
	public void fileInsert(FileVO file);

	public FileVO fileDetail(int bno);
}
