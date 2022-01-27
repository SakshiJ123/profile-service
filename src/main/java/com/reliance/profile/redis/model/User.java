package com.reliance.profile.redis.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private String id;
private String name;
private long salary;
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
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public User(String id, String name, long salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

}
