package com.peekay.discoveryservice;


public class Movie {
	
	private String name;
	private String actorName;
	private String synopsis;
	
	
	public Movie(String name, String actorName, String synopsis) {
		super();
		this.name = name;
		this.actorName = actorName;
		this.synopsis = synopsis;
	}
	
	public Movie() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	

}
