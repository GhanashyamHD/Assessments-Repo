package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dto.BooksDTO;
import com.wolken.wolkenapp.service.BooksService;
import com.wolken.wolkenapp.service.BooksServiceImpl;
@WebServlet("/update")
public class ServletforUpdate extends HttpServlet{
	BooksService booksService = new BooksServiceImpl();
	BooksDTO booksDTO = new BooksDTO();
	Logger logger = Logger.getLogger("ServletforUpdate");
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	BooksService booksService = new BooksServiceImpl();
	//	BooksDTO booksDTO = new BooksDTO();
		logger.warn("inside update servlet");
	String gen = req.getParameter("genre");
	String nm = req.getParameter("bookName");
	booksDTO.setBookGenre(gen);
	booksDTO.setBookName(nm);
	
	try {
		logger.warn("calling validateandUpdate ");
		booksService.validateAndUpdateGenreByName(gen, nm);
	} catch (MyException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		logger.error("Encounter a custom exception");
	}
	logger.warn("Updated");
	PrintWriter printWriter = resp.getWriter();
	printWriter.write("Displaying updated list");
	resp.setContentType("text/html");
	printWriter.print("<body style ='text-align: center'>"
			+ "<h2>Successfully updated</h2>"
			+ "<a href ='http://localhost:8080/library-hibernate-servlet-user/get?'>Display</a>"
			+ "</body>");
	}

}
