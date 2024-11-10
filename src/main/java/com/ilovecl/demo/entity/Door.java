package com.ilovecl.demo.entity;

import java.sql.Date;

public class Door {
	String id;
	String name;
	String water;
	String power;
	Date date;
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
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
