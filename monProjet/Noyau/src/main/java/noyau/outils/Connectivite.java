package noyau.outils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import noyau.repository.ModuleRepository;
import noyau.repository.ModuleRepositoryJpa;
import noyau.repository.UtilisateurRepository;
import noyau.repository.UtilisateurRepositoryJpa;

/**
 * 
 * @author Francois 2
 * @version 1.0
 */
public class Connectivite {
	private Connectivite connectivite = null;
	
	private final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("module");
	
	private final ModuleRepository modRepo = new ModuleRepositoryJpa();
	private final UtilisateurRepository utiRepo = new UtilisateurRepositoryJpa();
	
	private Connectivite(){
	}
	
	/**
	 * 
	 * @return Singleton connectivite
	 */
	public Connectivite getInstance(){
		if(this.connectivite == null) this.connectivite = new Connectivite();
		return connectivite;
	}
	
	/**
	 * 
	 * @return EntityManagerFactory
	 */
	public EntityManagerFactory getEntityManagerFactory(){
		return this.entityManagerFactory;
	}
	
	/**
	 * 
	 * @return EntityManager
	 */
	public EntityManager createEntityManager(){
		return this.entityManagerFactory.createEntityManager();
	}

	/**
	 * @return the modRepo
	 */
	public ModuleRepository getModRepo() {
		return modRepo;
	}

	/**
	 * @return the utiRepo
	 */
	public UtilisateurRepository getUtiRepo() {
		return utiRepo;
	}
}
