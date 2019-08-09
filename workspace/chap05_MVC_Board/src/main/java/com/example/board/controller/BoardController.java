package com.example.board.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import com.example.board.model.BoardDao;
import com.example.board.vo.BoardVO;
import com.example.board.vo.FileVO;

@Controller
public class BoardController
{
	@Value("${file.upload.directory}")
	String filePath;
	
	
	@Autowired
	private BoardDao boardDao;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		int rowNum = boardDao.boardCount();
		model.addAttribute("rowNum", rowNum);
		return "index";
	}
	
	@RequestMapping("/list")
	public String board_list(Model model)
	{
		List<BoardVO> list = boardDao.boardList();
		model.addAttribute("list", list);
		return "crud/boardList";
	}
	
	@RequestMapping("/insert")
	public String board_insertForm()
	{
		return "crud/insertForm";
	}
	
	@RequestMapping("/insertPro")
	public String insert(HttpServletRequest request, @RequestPart MultipartFile files) throws Exception
	{
		String subject = request.getParameter("subject");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		BoardVO vo = new BoardVO();
		vo.setSubject(subject);
		vo.setWriter(writer);
		vo.setContent(content);
		
		if(files.isEmpty())
		{
			boardDao.boardInsert(vo);
		}
		else
		{
			boardDao.boardInsert(vo);
			String fileName = files.getOriginalFilename();
			String reFileName = writer + "_" + fileName;
			File finalFile = new File(filePath + reFileName);
			
			finalFile.getParentFile().mkdirs();
			files.transferTo(finalFile);
			
			FileVO file = new FileVO();
			file.setBno(vo.getBno());
			file.setFilename(reFileName);
			file.setFileOriginName(fileName);
			file.setFileurl(filePath);
			
			boardDao.fileInsert(file);
		}
		return "redirect:/list";
	}
	
	@RequestMapping("/detail/{bno}")
	public String detailForm(@PathVariable int bno, Model model)
	{
		model.addAttribute("detail", boardDao.boardDetail(bno));
		model.addAttribute("files", boardDao.fileDetail(bno));
		
		return "crud/boardDetail";
	}
	
	@RequestMapping("/update/{bno}")
	public String updateForm(@PathVariable int bno, Model model)
	{
		model.addAttribute("update", boardDao.boardDetail(bno));
		
		return "crud/boardUpdate";
	}
	
	@RequestMapping("/updatePro")
	public String update(HttpServletRequest request)
	{
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardVO vo = new BoardVO();
		vo.setSubject(subject);
		vo.setContent(content);
		vo.setBno(bno);
		
		boardDao.boardUpdate(vo);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/delete/{bno}")
	public String deleteForm(@PathVariable int bno, Model model)
	{
		model.addAttribute("delete", boardDao.boardDetail(bno));
		
		return "crud/boardDelete";
	}
	
	@RequestMapping("/deletePro")
	public String delete(HttpServletRequest request)
	{
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		boardDao.boardDelete(bno);
		
		return "redirect:/list";
	}
	
	@RequestMapping("/fileDown/{bno}")
    private void fileDown(@PathVariable int bno, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
        
        request.setCharacterEncoding("UTF-8"); 
        FileVO fileVO = this.boardDao.fileDetail(bno); 
        
       
        try
        {
            String fileUrl = fileVO.getFileurl();
            String fileName = fileVO.getFilename();
            
        
            String oriFileName = fileVO.getFileOriginName();
            InputStream in = null;
            OutputStream os = null;
            File file = null;
            boolean skip = false;
            String client = "";
            
            try
            {
                file = new File(fileUrl, fileName); 
                in = new FileInputStream(file);
            }
            catch (FileNotFoundException fe)
            {
                skip = true;
            }
            
            client = request.getHeader("User-Agent");
            
            //파일 다운로드 헤더 지정 
            response.reset();
            response.setContentType("application/octet-stream");
            response.setHeader("Content-Description", "JSP Generated Data");
            
            if (!skip)
            {
                if (client.indexOf("MSIE") != -1)
                {
                    response.setHeader("Content-Disposition", "attachment; filename=\""+ java.net.URLEncoder.encode(oriFileName, "UTF-8").replaceAll("\\+", "\\ ") + "\"");
                }
                else if (client.indexOf("Trident") != -1)
                {
                    response.setHeader("Content-Disposition", "attachment; filename=\""+ java.net.URLEncoder.encode(oriFileName, "UTF-8").replaceAll("\\+", "\\ ") + "\"");
                }
                else
                {
                    response.setHeader("Content-Disposition", "attachment; filename=\"" + new String(oriFileName.getBytes("UTF-8"), "ISO8859_1") + "\"");
                    response.setHeader("Content-Type", "application/octet-stream; charset=utf-8");
                }
                response.setHeader("Content-Length", "" + file.length());
                os = response.getOutputStream();
                byte b[] = new byte[(int) file.length()];
                int leng = 0;
                while ((leng = in.read(b)) > 0)
                {
                    os.write(b, 0, leng);
                }
            }
            else
            {
                response.setContentType("text/html;charset=UTF-8");
                System.out.println("<script language='javascript'>alert('파일을 찾을 수 없습니다');history.back();</script>");
            }
            in.close();
            os.close();
        }
        catch (Exception e)
        {
            System.out.println("ERROR : " + e.getMessage());
        }
    }
}
