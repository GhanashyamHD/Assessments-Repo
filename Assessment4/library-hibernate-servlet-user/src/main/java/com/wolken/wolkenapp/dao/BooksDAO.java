package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dto.BooksDTO;

public interface BooksDAO {
	public boolean addBook(BooksDTO booksDTO) ;
	public boolean updateGenreByBookName(String genre , String bookName) throws MyException;
	public boolean deleteBookNameById(int bookId) throws MyException;
	public List<BooksDTO> getAll();

}
