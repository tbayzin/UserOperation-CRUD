package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	
	
	
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	@Override
	public String toString() {
		
		return "Kisinin ID si:  " + personId +  ",   Kisinin ismi: " + personName  ;
		
	}

}
