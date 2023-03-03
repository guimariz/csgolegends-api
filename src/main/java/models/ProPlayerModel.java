package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import enums.ProPlayerCard;

@Entity
@Table(name = "proplayers")
public class ProPlayerModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String proPlayerName;
	private ProPlayerStatsModel proPlayerStats;
	@Enumerated(EnumType.STRING)
	private ProPlayerCard proPlayerCard;

	public ProPlayerModel(String name, ProPlayerStatsModel stats) {
		this.setProPlayerName(name);
		this.setProPlayerStats(stats);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProPlayerName() {
		return proPlayerName;
	}
	public void setProPlayerName(String proPlayerName) {
		this.proPlayerName = proPlayerName;
	}
	public ProPlayerStatsModel getProPlayerStats() {
		return proPlayerStats;
	}
	public void setProPlayerStats(ProPlayerStatsModel proPlayerStats) {
		this.proPlayerStats = proPlayerStats;
	}
	
	public ProPlayerCard getProPlayerCard() {
		return proPlayerCard;
	}
	
	public void setProPlayerCard(ProPlayerCard proPlayerCard) {
		this.proPlayerCard = proPlayerCard;
	}
}
