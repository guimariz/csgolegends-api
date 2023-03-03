package dao;

import javax.persistence.EntityManager;

import models.ProPlayerModel;

public class ProPlayerDao {

	private EntityManager em;

	public ProPlayerDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void cadastrar(ProPlayerModel proPlayer) {
		this.em.persist(proPlayer);
	}
	
}
