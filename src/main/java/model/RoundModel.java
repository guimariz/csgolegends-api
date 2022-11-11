package model;

public class RoundModel {
	
	private Long id;
	private Long kills;
	private TeamModel team1;
	private TeamModel team2;
	private String winningTeam;
	private String loosingTeam;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getKills() {
		return kills;
	}
	public void setKills(Long kills) {
		this.kills = kills;
	}
	public TeamModel getTeam1() {
		return team1;
	}
	public void setTeam1(TeamModel team1) {
		this.team1 = team1;
	}
	public TeamModel getTeam2() {
		return team2;
	}
	public void setTeam2(TeamModel team2) {
		this.team2 = team2;
	}
	public String getWinningTeam() {
		return winningTeam;
	}
	public void setWinningTeam(String winningTeam) {
		this.winningTeam = winningTeam;
	}
	public String getLoosingTeam() {
		return loosingTeam;
	}
	public void setLoosingTeam(String loosingTeam) {
		this.loosingTeam = loosingTeam;
	}
}
