package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private int id;
	private String name;
	private String emailid;
	private String password;
	private int salary;


	

	public User(int id, String name, String emailid, String password, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.password = password;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password + ", salary="
				+ salary + "]";
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
