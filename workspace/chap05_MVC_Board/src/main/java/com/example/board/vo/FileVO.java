package com.example.board.vo;

public class FileVO
{
	private int fno;
	private int bno;
	private String filename;
	private String fileOriginName;
	private String fileurl;
	
	public int getFno() 
	{
		return fno;
	}
	
	public void setFno(int fno)
	{
		this.fno = fno;
	}
	
	public int getBno() 
	{
		return bno;
	}
	
	public void setBno(int bno)
	{
		this.bno = bno;
	}
	
	public String getFilename() 
	{
		return filename;
	}
	
	public void setFilename(String filename)
	{
		this.filename = filename;
	}
	
	public String getFileOriginName() 
	{
		return fileOriginName;
	}
	
	public void setFileOriginName(String fileOriginName)
	{
		this.fileOriginName = fileOriginName;
	}
	
	public String getFileurl() 
	{
		return fileurl;
	}
	
	public void setFileurl(String fileurl) 
	{
		this.fileurl = fileurl;
	}
}
