package org.indra.repository;

public abstract class PeliculaRepositoryFactory {
	
	public abstract IPeliculaRepository createRepository();
	
	private static Class repositoryClass;
	
	public static void configureClass(Class repositoryClass) {
	
		PeliculaRepositoryFactory.repositoryClass = repositoryClass;
	
	}
	
	private static PeliculaRepositoryFactory instance;
	//Implemento el patron singleton
	public static PeliculaRepositoryFactory getInstance() throws Exception {
		
		if (PeliculaRepositoryFactory.repositoryClass == null) throw new Exception ("PeliculaRepositoryFactory not implemented yet");
		
		if (PeliculaRepositoryFactory.instance == null) {
			PeliculaRepositoryFactory.instance = (PeliculaRepositoryFactory) PeliculaRepositoryFactory.repositoryClass.newInstance();
		}
		
		return PeliculaRepositoryFactory.instance;
	}

}
