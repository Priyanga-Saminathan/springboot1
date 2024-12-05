package com.example.MySecondApp.Repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class EmployeeEntity {
	@Id
	private int id;
	private String name;
	private String position;
	private int age;
	public EmployeeEntity(String name, String position, int age) {
		this.name=name;
		this.position=position;
		this.age=age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position=position;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
