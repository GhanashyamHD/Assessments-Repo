package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dao.BooksDAO;
import com.wolken.wolkenapp.dto.BooksDTO;

public class BooksServiceImpl implements BooksService{
  BooksDAO dao = new com.wolken.wolkenapp.dao.BooksDAOImpl();
  Logger logger = Logger.getLogger("BooksServiceImpl");
	@Override
	public void validateAndAdd(BooksDTO booksDTO)  {
		// TODO Auto-generated method stub
		logger.debug("Inside validateandAdd ");
		if(booksDTO.getBookId() >0 && booksDTO.getBookId()<1000) {
			 
			 
		      if(booksDTO.getBookName() != null && booksDTO.getAuthor() != null && booksDTO.getBookGenre() != null && booksDTO.getVolume() >0) {
					dao.addBook(booksDTO);
				
					}
			
				else {
					logger.error("Invalid Input");
				}	
			}
		logger.debug("outside validateandAdd");
		
	}

	@Override
	public void validateAndUpdateGenreByName(String genre, String bookName) throws MyException {
		// TODO Auto-generated method stub
		logger.debug("inside ValidateandUpdate");
	try {	if(genre != null && bookName != null) {
			   dao.updateGenreByBookName(genre, bookName);
		}
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
		logger.error("Emcountered an error while validating for add");
	}
	logger.trace("outside validateandUpdate");
		
	}

	@Override
	public void validateAndDeleteById(int bookId) throws MyException {
		// TODO Auto-generated method stub
		logger.trace("inside and validateandDelete");
		if(bookId >0 && bookId <10000) {
			logger.warn("calling delete dao");
			dao.deleteBookNameById(bookId);
		}
	}

	@Override
	public List<BooksDTO> validateAndGetall() {
		// TODO Auto-generated method stub
		logger.warn("inside validateAndGetall");
	return	dao.getAll();
		
	}

}
