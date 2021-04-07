package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dto.BooksDTO;
import com.wolken.wolkenapp.service.BooksService;
import com.wolken.wolkenapp.service.BooksServiceImpl;

@WebServlet("/add")
public class ServletforAdd extends HttpServlet{
	BooksService booksService = new BooksServiceImpl();
	BooksDTO booksDTO = new BooksDTO();
	Logger logger = Logger.getLogger(ServletforAdd.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	try {	
		logger.debug("inside servlet");
		String id = req.getParameter("bookId");
		int id1 = Integer.parseInt(id);
		booksDTO.setBookId(id1);
		logger.info("id is set");
		booksDTO.setBookName(req.getParameter("bookName"));
		booksDTO.setAuthor(req.getParameter("author"));
		booksDTO.setBookGenre(req.getParameter("genre"));
		String vol = req.getParameter("volume");
		int vol1 = Integer.parseInt(vol);
		booksDTO.setVolume(vol1);
		logger.info("Vol is set");
	
		
		
			booksService.validateAndAdd(booksDTO);}
	catch (Exception e) {
		// TODO: handle exception
		logger.warn("inside catch of add servlet");
		logger.error("Cannot process in add servlet");
	}
			logger.warn("Added");
		//	PrintWriter printWriter = resp.getWriter();
	        
			
	//		printWriter.write("Successfully added to the database");
		
			}
	
		
		
		
	}
	


