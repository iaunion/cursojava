package org.indra.main;

import org.indra.services.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.indra.models.*;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		
		StandardServiceRegistry conf = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(conf).getMetadataBuilder().build();
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		
		IPersonaService service = new PersonaHibernateService(factory);
		
		try (final Scanner scanner = new Scanner(System.in)) {
		
			/*System.out.println("Introduzca el nombre y el apellido");
			
			Persona persona = new Persona();
			
			persona.setNombre(scanner.nextLine());
			persona.setApellido(scanner.nextLine());
			
			service.add(persona);*/
			
			System.out.println("Listo todas");
			System.out.println("---------------------------------------------------");
			List<Persona> personas = service.getAll();
			personas.stream().forEach( p -> System.out.println(p.getNombre() + " " + p.getApellido()));
			
			System.out.println("---------------------------------------------------");
			
			/*System.out.println("Borro una");
			System.out.println("---------------------------------------------------");
			service.delete(personas.stream().findFirst().get().getId());
			
			System.out.println("---------------------------------------------------");
			
			System.out.println("Listo todas");
			System.out.println("---------------------------------------------------");
			personas = service.getAll();
			personas.stream().forEach( p -> System.out.println(p.getNombre() + " " + p.getApellido()));*/
		}
		
		factory.close();
	}

}
