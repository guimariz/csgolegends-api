package model;

public class ProPlayerModel {
	private Integer id;
	private String proPlayerName;
	private ProPlayerStatsModel proPlayerStats;
	
	public ProPlayerModel(String name, ProPlayerStatsModel stats) {
		this.setName(name);
		this.setProPlayerStats(stats);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return proPlayerName;
	}
	public void setName(String proPlayerName) {
		this.proPlayerName = proPlayerName;
	}
	public ProPlayerStatsModel getProPlayerStats() {
		return proPlayerStats;
	}
	public void setProPlayerStats(ProPlayerStatsModel proPlayerStats) {
		this.proPlayerStats = proPlayerStats;
	}
	
}
