package model;

import java.util.List;

public class MatchModel {

	private Integer id;
	private RoundModel round;
	private List<RoundModel> MatchRounds;
	private Boolean endMatch;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public RoundModel getRound() {
		return round;
	}
	public void setRound(RoundModel round) {
		this.round = round;
	}
	public List<RoundModel> getMatchRounds() {
		return MatchRounds;
	}
	public void setMatchRounds(List<RoundModel> matchRounds) {
		MatchRounds = matchRounds;
	}
	public Boolean getEndMatch() {
		return endMatch;
	}
	public void setEndMatch(Boolean endMatch) {
		this.endMatch = endMatch;
	}
	
	
}
