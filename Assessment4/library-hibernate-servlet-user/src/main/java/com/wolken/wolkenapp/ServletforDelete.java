package com.wolken.wolkenapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.DocFlavor.STRING;
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
@WebServlet("/delete")
public class ServletforDelete extends HttpServlet{
	BooksService booksService = new BooksServiceImpl();
	BooksDTO booksDTO = new BooksDTO();
	Logger logger = Logger.getLogger("ServletforDelete");
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("bookId");
		booksDTO.setBookId(Integer.parseInt(id));
		try {
			logger.warn("calling validateanddelete within deleteSevlet");
			booksService.validateAndDeleteById(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			logger.error("Encounteres NumberFormat Exception");
			e.printStackTrace();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			logger.error("Encounter custom exception ");
			e.printStackTrace();
		}
		logger.info("Deleted ");
       PrintWriter printWriter = resp.getWriter();
		printWriter.write("Displaying updated list");
		resp.setContentType("text/html");
		printWriter.print("<body style ='text-align: center'>"
				+ "<h2>Successfully updated</h2>"
				+ "<a href ='http://localhost:8080/library-hibernate-servlet-user/get?'>Display</a>"
				+ "</body>");
		
	}
     

}
