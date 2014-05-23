package com.audamob.zwaz.model;

import java.util.List;
import java.util.Map;

public class Battlefield {

	private String id;
	private String name;
	private int line;
	private int colomn;
	//Zone avec les positions des voisins
	private Map<Zone,List<Integer>> zones;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getColomn() {
		return colomn;
	}
	public void setColomn(int colomn) {
		this.colomn = colomn;
	}
	public Map<Zone, List<Integer>> getZones() {
		return zones;
	}
	public void setZones(Map<Zone, List<Integer>> zones) {
		this.zones = zones;
	}
	
	public Battlefield(String id, String name, int line, int colomn,
			Map<Zone, List<Integer>> zones) {
		super();
		this.id = id;
		this.name = name;
		this.line = line;
		this.colomn = colomn;
		this.zones = zones;
	}
	
	
	
}
