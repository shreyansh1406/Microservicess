package com.ltts.DetailInfo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class team {
	private int teamNum;
	private String teamName;
	private String ownerName;
	public int getTeamNum() {
		return teamNum;
	}
	public void setTeamNum(int teamNum) {
		this.teamNum = teamNum;
	}
	public String getTeamName() {
		return teamName;
	}
	
	public team() {
		super();
		
	}
	public team(int teamNum, String teamName, String ownerName) {
		super();
		this.teamNum = teamNum;
		this.teamName = teamName;
		this.ownerName = ownerName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	@Override
	public String toString() {
		return "Team [teamNum=" + teamNum + ", teamName=" + teamName + ", ownerName=" + ownerName + "]";
	}
	
	
}