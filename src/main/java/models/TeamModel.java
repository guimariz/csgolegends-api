package models;

import java.util.List;

public class TeamModel {
	
	private Long id;
	private String name;
	private String country;
	private List<ProPlayerModel> ProPlayerList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<ProPlayerModel> getProPlayerList() {
		return ProPlayerList;
	}
	public void setProPlayerList(List<ProPlayerModel> proPlayerList) {
		ProPlayerList = proPlayerList;
	}
	
	
}
