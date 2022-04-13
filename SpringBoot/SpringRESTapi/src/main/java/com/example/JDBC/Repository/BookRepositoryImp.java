package com.example.JDBC.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.JDBC.model.Book;

@Repository
public class BookRepositoryImp  implements BookRepository{

	@Autowired
	private EntityManager em;
	@Override
	public int insertBook(Book b) {
		Session s=em.unwrap(Session.class);
		return (int) s.save(b);
	}

	@Override
	public int updateBook(String s, float p) {
		Session s1=em.unwrap(Session.class);
		Query q=s1.createQuery("update Book set price=:x where bookName=:y");
		q.setParameter("x", p);
		q.setParameter("y", s);
		return q.executeUpdate();
	}

	@Override
	public void deleteBook(int bid) {
		Session s=em.unwrap(Session.class);
		Book b=s.get(Book.class,bid);
		s.delete(b);
		
	}

	@Override
	public List<Book> getAllbooks() {
		Session s=em.unwrap(Session.class);
		Query q=s.createQuery("from Book");
		return q.getResultList();
	}

}
