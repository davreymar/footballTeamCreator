package domain;

import java.util.HashSet;
import java.util.Set;

public class Team {
	
	public Team(){
		players = new HashSet<Player>();
	}
	
	private Set<Player> players;
	private double rythmAverage;
	private double physicalAverage;
	private double shotAverage;
	private double dribblingAverage;
	private double defenseAverage;
	private double goalkeeperAverage;
	
	private double frontLane;
	private double midLane;
	private double backLane;
	private double goalkeeper;

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	public double getRythmAverage() {
		int totalRythm=0;
		for(Player p: players){
			totalRythm += p.getCharacteristic().getRhythm();
		}
		rythmAverage = totalRythm/players.size();
		return rythmAverage;
	}

	public void setRythmAverage(double rythmAverage) {
		this.rythmAverage = rythmAverage;
	}

	public double getPhysicalAverage() {
		int totalPhysical=0;
		for(Player p: players){
			totalPhysical += p.getCharacteristic().getPhysical();
		}
		physicalAverage = totalPhysical/players.size();
		return physicalAverage;
	}

	public void setPhysicalAverage(double physicalAverage) {
		this.physicalAverage = physicalAverage;
	}

	public double getShotAverage() {
		int totalShot=0;
		for(Player p: players){
			totalShot += p.getCharacteristic().getShot();
		}
		shotAverage = totalShot/players.size();
		return shotAverage;
	}

	public void setShotAverage(double shotAverage) {
		this.shotAverage = shotAverage;
	}

	public double getDribblingAverage() {
		int totalDribbling=0;
		for(Player p: players){
			totalDribbling += p.getCharacteristic().getDribbling();
		}
		dribblingAverage = totalDribbling/players.size();
		return dribblingAverage;
	}

	public void setDribblingAverage(double dribblingAverage) {
		this.dribblingAverage = dribblingAverage;
	}

	public double getDefenseAverage() {
		int totalDefense=0;
		for(Player p: players){
			totalDefense += p.getCharacteristic().getDefense();
		}
		defenseAverage = totalDefense/players.size();
		return defenseAverage;
	}

	public void setDefenseAverage(double defenseAverage) {
		this.defenseAverage = defenseAverage;
	}

	public double getGoalkeeperAverage() {
		int totalGoalkeeper=0;
		for(Player p: players){
			totalGoalkeeper += p.getCharacteristic().getGoalkeeper();
		}
		goalkeeperAverage = totalGoalkeeper/players.size();
		return goalkeeperAverage;
	}

	public void setGoalkeeperAverage(double goalkeeperAverage) {
		this.goalkeeperAverage = goalkeeperAverage;
	}

	
	
	public double getFrontLane() {
		double total = 0d;
		total = 2*getRythmAverage() + 2*getDribblingAverage() + 
				2*getShotAverage() + getPhysicalAverage();
		this.frontLane = total/7;
		return frontLane;
	}

	public void setFrontLane(double frontLane) {
		this.frontLane = frontLane;
	}

	public double getMidLane() {
		double total = 0d;
		total = getRythmAverage() + 2*getDribblingAverage() + 
				getShotAverage() + getDefenseAverage();
		this.midLane = total/5;
		return midLane;
	}

	public void setMidLane(double midLane) {
		this.midLane = midLane;
	}

	public double getBackLane() {
		double total = 0d;
		total = getRythmAverage() + 2*getPhysicalAverage() + 2*getDefenseAverage();
		this.backLane = total/5;
		return backLane;
	}

	public void setBackLane(double backLane) {
		this.backLane = backLane;
	}

	public double getGoalkeeper() {
		double total = 0d;
		total = 2*getGoalkeeperAverage()+getDefenseAverage();
		this.goalkeeper = total/3;
		return goalkeeper;
	}

	public void setGoalkeeper(double goalkeeper) {
		this.goalkeeper = goalkeeper;
	}

	@Override
	public String toString() {
		return "Team [players=" + players + ", rythmAverage=" + rythmAverage + ", physicalAverage=" + physicalAverage
				+ ", shotAverage=" + shotAverage + ", dribblingAverage=" + dribblingAverage + ", defenseAverage="
				+ defenseAverage + ", goalkeeperAverage=" + goalkeeperAverage + ", frontLane=" + frontLane
				+ ", midLane=" + midLane + ", backLane=" + backLane + ", goalkeeper=" + goalkeeper + "]";
	}


	
	
	
	
	
	
	
}
