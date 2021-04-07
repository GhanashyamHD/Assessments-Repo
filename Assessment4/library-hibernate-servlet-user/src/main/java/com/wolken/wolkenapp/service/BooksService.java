package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dto.BooksDTO;

public interface BooksService {
	public void validateAndAdd(BooksDTO booksDTO) ;
	public void validateAndUpdateGenreByName(String genre , String bookName) throws MyException;
	public void validateAndDeleteById(int bookId) throws MyException;
    public List<BooksDTO> validateAndGetall();
		
	

}
