package com.wolken.wolkenapp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.dto.BooksDTO;
import com.wolken.wolkenapp.service.BooksService;
import com.wolken.wolkenapp.service.BooksServiceImpl;
@WebServlet("/get")
public class ServletforDisplay extends HttpServlet {
	Logger logger = Logger.getLogger("ServletforDisplay");
	BooksService booksService = new BooksServiceImpl();
	BooksDTO booksDTO = new BooksDTO();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		logger.warn("inside getall servlet");
		List<BooksDTO> fdtos = booksService.validateAndGetall();
		req.setAttribute("flist", fdtos);
		logger.info("Calling the chained resource");
		RequestDispatcher dispatcher = req.getServletContext().getRequestDispatcher("/display.jsp");
		dispatcher.forward(req, resp);
	}


}
