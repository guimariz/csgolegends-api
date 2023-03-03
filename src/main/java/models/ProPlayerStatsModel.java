package models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "proplayerstats")
public class ProPlayerStatsModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private BigDecimal kdStats;
	private Integer totalKills;
	private Integer totalDeaths;
	private Integer totalMatches;
	
	@OneToOne
	private ProPlayerAverageModel proPlayerAverage;
	
	public ProPlayerStatsModel(Integer totalMatches, ProPlayerAverageModel proPlayerAverage) {
		super();
		this.totalMatches = totalMatches;
		this.proPlayerAverage = proPlayerAverage;
	}
	
	public ProPlayerStatsModel(Integer kills, Integer deaths) {
		this.setTotalKills(kills);
		this.setTotalDeaths(deaths);
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getKdStats() {
		return kdStats;
	}
	public void setKdStats(BigDecimal kdStats) {
		this.kdStats = kdStats;
	}
	public Integer getTotalKills() {
		return totalKills;
	}
	public void setTotalKills(Integer totalKills) {
		this.totalKills = totalKills;
	}
	public Integer getTotalDeaths() {
		return totalDeaths;
	}
	public void setTotalDeaths(Integer totalDeaths) {
		this.totalDeaths = totalDeaths;
	}
	public int getTotalMatches() {
		return totalMatches;
	}
	public void setTotalMatches(Integer totalMatches) {
		this.totalMatches = totalMatches;
	}
	public ProPlayerAverageModel getProPlayerAverage() {
		return proPlayerAverage;
	}
	public void setProPlayerAverage(ProPlayerAverageModel proPlayerAverage) {
		this.proPlayerAverage = proPlayerAverage;
	}
}
