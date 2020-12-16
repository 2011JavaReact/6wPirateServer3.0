package com.revature.pirate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pirate")
public class Pirate{ //implements Serializeable
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="pirate_id")
	private int id;
	
	@Column(name="name")
	private String name; //instance
	
	@ManyToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	public Pirate() {
		super();
	}
	
	public Pirate(String name, Role role){
		this.name = name;
		this.role = role;
	}
	
	public Pirate(int id, String name, Role role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName(){
		return this.name;
	}
	
	public void setName(String name){ // method scope
		this.name = name;
	}
	
	public Role getRole(){
		return this.role;
	}
	
	public void setRole(Role role){ // method scope
		this.role = role;
	}
	
	@Override
	public String toString(){
		return "Aaaarg! I have an ID of " + this.id + ". I am: " + this.name + ". I have been cursed with the role of: " + this.role;
	}
	//hashCode()
	//equals()
}