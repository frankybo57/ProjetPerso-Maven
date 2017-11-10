package noyau.outils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connectivite {
	private Connectivite connectivite = null;
	
	private final EntityManagerFactory entityManagerFactory;
	
	private final ModuleRepository = new ModuleRepositoryJpa();
	private final UtilisateurRepository = new UtilisateurRepositoryJpa();
	
	private Connectivite(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("module");
	}
	
	public Connectivite getInstance(){
		if(this.connectivite == null) this.connectivite = new Connectivite();
		return connectivite;
	}
	
	public EntityManagerFactory getEntityManagerFactory(){
		return this.entityManagerFactory;
	}
	
	public EntityManager createEntityManager(){
		return this.entityManagerFactory.createEntityManager();
	}
}
