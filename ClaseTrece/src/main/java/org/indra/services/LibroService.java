package org.indra.services;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.indra.models.*;

public class LibroService extends ServiceBase implements ILibroService {

	public void add(Libro libro) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(libro);
		transaction.commit();
	}

	
}
