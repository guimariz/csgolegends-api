package model;

public class ProPlayerAverageModel {
	
	private Integer id;
	private Long killsAverage;
	private Long deathsAverage;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getKillsAverage() {
		return killsAverage;
	}
	public void setKillsAverage(Long killsAverage) {
		this.killsAverage = killsAverage;
	}
	public Long getDeathsAverage() {
		return deathsAverage;
	}
	public void setDeathsAverage(Long deathsAverage) {
		this.deathsAverage = deathsAverage;
	}
}
