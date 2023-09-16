package com.crm.CRM;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	int id;
	String fname;
	String lname;
	String city;
	long mob;
	int age;

	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", mob=" + mob
				+ ", age=" + age + "]";
	}

}
