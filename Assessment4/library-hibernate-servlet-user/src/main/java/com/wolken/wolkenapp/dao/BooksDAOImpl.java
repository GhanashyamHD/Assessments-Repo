package com.wolken.wolkenapp.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wolken.wolkenapp.HibernateUtil;
import com.wolken.wolkenapp.custom.MyException;
import com.wolken.wolkenapp.dto.BooksDTO;
//import org.apache.log4j.Logger;

public class BooksDAOImpl implements BooksDAO{
 // Logger logger= Logger.getLogger(BooksDAOImpl.class);
	Logger logger = Logger.getLogger("BooksDAOImpl");

	@Override
	public boolean addBook(BooksDTO booksDTO) {
		// TODO Auto-generated method stub
	try {	Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(booksDTO);
		//System.out.println("saved");
		transaction.commit();
		session.close();}catch (Exception e) {
			// TODO: handle exception
		}
	
		return true;
	}

	@Override
	public boolean updateGenreByBookName(String genre, String bookName) throws MyException {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
	 //   Query query = session.createQuery("update FruitDTO dto set dto.fruitName='"+name+"' where dto.fruitId="+id+"");
	try {   Query query = session.createQuery("update BooksDTO dto set dto.bookGenre = :genre where dto.bookName = :name");
	          query.executeUpdate();
	   query.setParameter("genre", genre);
	   query.setParameter("name", bookName);}catch (Exception e) {
		// TODO: handle exception
	}
		
	   session.close();
	   return true;
		
	}

	@Override
	public boolean deleteBookNameById(int bookId) throws MyException {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFactory().openSession();
		Transaction transaction = session.beginTransaction();
	//	Query query = session.createQuery(" delete from FruitDTO dto where dto.fruitId = "+id+" ");
	//	Query query = session.createQuery(" delete from FruitDTO dto where dto.fruitId = : ID");
	try {	Query query = session.getNamedQuery("delete");
		query.setParameter("ID", bookId);
		query.executeUpdate();}catch (Exception e) {
			// TODO: handle exception
			
		}
		session.close();
		return true;
		
	}

	@Override
	public List<BooksDTO> getAll() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getFactory().openSession();
	 Query query=session.getNamedQuery("selectall");
		// TODO: handle exception
	
		 List<BooksDTO> dtos = query.list();
		 for (BooksDTO booksDTO : dtos) {
			System.out.println(booksDTO);
		
		 
	 dtos.forEach(System.out::print);
	 session.close();
		
	 
	}
		
		 return dtos;

}
}