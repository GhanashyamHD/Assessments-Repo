package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
@Getter
@Setter
@EqualsAndHashCode

@NamedQueries( { 
@NamedQuery(name = "delete", query = "delete from BooksDTO dto where dto.bookId = : ID"),
@NamedQuery(name = "selectall", query = "from BooksDTO")})

@Entity
@Table(name = "booksdetails")
public class BooksDTO {
	@Id
	@Column(name = "bookId")
	private int bookId;
	@Column(name = "bookName")
	private String bookName;
	@Column(name ="bookGenre")
	private String bookGenre;
	@Column(name = "author")
	private String author;
	@Column(name = "volume")
	private int volume;
	

}
