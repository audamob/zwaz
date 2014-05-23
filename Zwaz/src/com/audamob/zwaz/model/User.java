package com.audamob.zwaz.model;

public class User {

	private String color;
	private String id;
	private String bestScore;
	private String score;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBestScore() {
		return bestScore;
	}
	public void setBestScore(String bestScore) {
		this.bestScore = bestScore;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
	
	public User(String color, String id, String bestScore, String score) {
		super();
		this.color = color;
		this.id = id;
		this.bestScore = bestScore;
		this.score = score;
	}
	
	
}
