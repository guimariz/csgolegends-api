package dao;

import javax.persistence.EntityManager;

import models.ProPlayerStatsModel;

public class ProPlayerStatsDao {
	private EntityManager em;

	public ProPlayerStatsDao(EntityManager em) {
		super();
		this.em = em;
	}
	
	public void cadastrar(ProPlayerStatsModel proPlayerStats) {
		this.em.persist(proPlayerStats);
	}
	
}
