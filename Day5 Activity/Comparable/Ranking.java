package Comparable;

import java.util.Scanner;
public class Ranking  implements Comparable<Ranking> {
	
	private int players;
	private int score;
	private String name;

	

	public Ranking() {
		super();
	
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayers() {
		return players;
	}

	public void setPlayers(int players) {
		this.players = players;
	}

	
	
	public Ranking(int score, String name) {
		super();
		
		this.score = score;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ranking [players=" + players + ", getPlayers()=" + getPlayers() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Ranking r) {
		// TODO Auto-generated method stub
		if(score==r.score)  
			return 0;  
			else if(score>r.score)  
			return 1;  
			else  
			return -1;  
			}  
	
}