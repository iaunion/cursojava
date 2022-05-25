package org.indra.main;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.indra.models.*;
import org.indra.services.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.Cleanup;



public class Program {

	public static void main(String[] args) {

		System.out.println("Bienvenidos");
		
		//Configuracion de hibernate
		//Mapeos con archivos xml
		/*Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		ServiceBase.configureSessionFactory(sessionFactory);*/
		
		//Mapeos con anotaciones
		SessionFactory sessionFactory = new AnnotationConfiguration ()
				.configure()
				.addPackage("org.indra.models")
				.addAnnotatedClass(Libro.class)
				.buildSessionFactory();
		
		ServiceBase.configureSessionFactory(sessionFactory);
		
		//Configuracion de spring
		@Cleanup ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//ILibroService service = new LibroService(); //<-Esto lo vamos a reemplazar por la inyección de dependencias
		ILibroService service = (ILibroService)context.getBean("libroService");
		
		/*Libro pilares = new Libro();
		pilares.setTitulo("Los pilares de la tierra");
		pilares.setEscritor("Ken Follet");*/
		
		/*Libro tronos = new Libro();
		tronos.setTitulo("Juego de tronos");
		tronos.setEscritor("George RR Martin")*/
		
		Libro hobbit = new Libro();
		hobbit.setTitulo("El Hobbit");
		hobbit.setEscritor("J.R. Tolkien");
		
		service.add(hobbit);
		
		
		System.out.println("Libro salvado en la base");
	}

}
