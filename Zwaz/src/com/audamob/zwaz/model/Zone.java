package com.audamob.zwaz.model;

import java.util.Map;

public class Zone {

	private String id;
	private Map<Border, Integer> borders;
	private boolean Status;
	private User owner;
	private String background;

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Map<Border, Integer> getBorders() {
		return borders;
	}

	public void setBorders(Map<Border, Integer> borders) {
		this.borders = borders;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Zone(String id, Map<Border, Integer> borders, boolean status,
			User owner, String background, int x, int y) {
		super();
		this.id = id;
		this.borders = borders;
		Status = status;
		this.owner = owner;
		this.background = background;
		this.x = x;
		this.y = y;
	}

}
